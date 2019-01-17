
package com.example.demo.service;

import com.example.demo.domain.Detalle;

import java.util.List;

public interface DetalleService {

    Detalle Save(Detalle discount);

    void Update(Detalle discount);

    void Delete(Long id);

    List<Detalle> findAll();

    List<Detalle> findByIdCab(Long idCab);

}
