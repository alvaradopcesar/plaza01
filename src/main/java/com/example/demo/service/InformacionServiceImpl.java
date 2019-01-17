package com.example.demo.service;

import com.example.demo.domain.Informacion;
import com.example.demo.respository.InformacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformacionServiceImpl implements InformacionService {

    @Autowired
    private InformacionRepository informacionRepository;

    @Override
    public List<Informacion> findAll() {
        return informacionRepository.findAll();
    }

    @Override
    public List<Informacion> findByIdCab(Long idCab){
        return informacionRepository.findByIdCab(idCab);
    }

    @Override
    public Informacion Save(Informacion discount){
        return informacionRepository.save(discount);
    }

    @Override
    public void Update(Informacion discount){
        Optional<Informacion> discountOpt = informacionRepository.findById(discount.getId());
        if (discountOpt.isPresent()) {
            informacionRepository.delete(discountOpt.get());
        }
    }

    @Override
    public void Delete(Long id){
        Optional<Informacion> discount = informacionRepository.findById(id);
        if (discount.isPresent()) {
            informacionRepository.delete(discount.get());
        }
    }

}
