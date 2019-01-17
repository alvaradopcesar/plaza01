package com.example.demo.respository;

import com.example.demo.domain.Cabecera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CabeceraRepository extends JpaRepository<Cabecera, Long> {

    @Query("SELECT c FROM Cabecera c ")
    List<Cabecera> findAll();

}
