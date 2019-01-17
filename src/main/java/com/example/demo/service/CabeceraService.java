
package com.example.demo.service;

import com.example.demo.domain.Cabecera;

import java.util.List;

public interface CabeceraService {

    Cabecera Save(Cabecera discount);

    void Update(Cabecera discount);

    void Delete(Long id);

    List<Cabecera> findAll();

}