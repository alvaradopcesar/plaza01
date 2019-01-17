package com.example.demo.respository;

import com.example.demo.domain.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DetalleRepository extends JpaRepository<Detalle, Long> {

    @Query("SELECT c FROM Detalle c ")
    List<Detalle> findAll();

    @Query("SELECT c FROM Detalle c where c.idCab = :idCab")
    List<Detalle> findByIdCab(Long idCab);

}
