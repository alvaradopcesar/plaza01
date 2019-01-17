package com.example.demo.service;

import com.example.demo.domain.Detalle;
import com.example.demo.respository.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.*;
import java.util.Base64;
import java.util.List;
import java.util.Optional;


@Service
public class DetalleServiceImpl implements DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;

    @Override
    public List<Detalle> findAll() {
        return detalleRepository.findAll();
    }

    @Override
    public List<Detalle> findByIdCab(Long idCab){
        return detalleRepository.findByIdCab(idCab);
    }

    @Override
    public Detalle Save(Detalle detalle) {

        Detalle detalleToSave = new Detalle();
        detalleToSave.setIdCab(detalle.getIdCab());
        detalleToSave.setNombreFile(detalle.getNombreFile());
        detalleToSave.setFile64("");

        Detalle det = detalleRepository.save(detalleToSave);
        CreateFile(detalle.getNombreFile(),detalle.getFile64());
        return det;
    }

    private void CreateFile(String nombreFile, String file64){
        byte[] decoded = Base64.getDecoder().decode(file64);

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./" + nombreFile);
            fos.write(decoded);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void Update(Detalle discount){
        Optional<Detalle> discountOpt = detalleRepository.findById(discount.getId());
        if (discountOpt.isPresent()) {
            detalleRepository.delete(discountOpt.get());
        }
    }

    @Override
    public void Delete(Long id){
        Optional<Detalle> discount = detalleRepository.findById(id);
        if (discount.isPresent()) {
            detalleRepository.delete(discount.get());
        }
    }

}
