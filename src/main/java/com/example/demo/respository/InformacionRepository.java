package com.example.demo.respository;

import com.example.demo.domain.Informacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InformacionRepository extends JpaRepository<Informacion, Long> {

    @Query("SELECT c FROM Informacion c ")
    List<Informacion> findAll();

    @Query("SELECT c FROM Informacion c where c.idCab = :idCab")
    List<Informacion> findByIdCab(Long idCab);

}
