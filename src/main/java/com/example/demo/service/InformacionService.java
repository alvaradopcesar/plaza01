
package com.example.demo.service;

import com.example.demo.domain.Informacion;

import java.util.List;

public interface InformacionService {

    Informacion Save(Informacion discount);

    void Update(Informacion discount);

    void Delete(Long id);

    List<Informacion> findAll();

    List<Informacion> findByIdCab(Long idCab);

}
