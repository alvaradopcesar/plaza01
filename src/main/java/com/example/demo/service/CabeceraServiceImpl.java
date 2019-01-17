package com.example.demo.service;

import com.example.demo.domain.Cabecera;
import com.example.demo.respository.CabeceraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CabeceraServiceImpl implements CabeceraService {

    @Autowired
    private CabeceraRepository cabeceraRepository;

    @Override
    public List<Cabecera> findAll() {
        return cabeceraRepository.findAll();
    }

    @Override
    public Cabecera Save(Cabecera discount){
        return cabeceraRepository.save(discount);
    }

    @Override
    public void Update(Cabecera discount){
        Optional<Cabecera> discountOpt = cabeceraRepository.findById(discount.getId());
        if (discountOpt.isPresent()) {
            cabeceraRepository.delete(discountOpt.get());
        }
    }

    @Override
    public void Delete(Long id){
        Optional<Cabecera> discount = cabeceraRepository.findById(id);
        if (discount.isPresent()) {
            cabeceraRepository.delete(discount.get());
        }
    }

}
