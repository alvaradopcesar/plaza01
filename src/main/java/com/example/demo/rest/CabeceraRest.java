package com.example.demo.rest;

import com.example.demo.domain.Cabecera;
import com.example.demo.service.CabeceraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CabeceraRest {

    @Autowired
    CabeceraService cabeceraServiceService;

    @GetMapping("/cabeceras")
    public List<Cabecera> findAll() {
        return cabeceraServiceService.findAll();
    }

    @PostMapping("/cabecera")
    public Cabecera createCabecera(@RequestBody Cabecera cabecera) {
        return  cabeceraServiceService.Save(cabecera);
    }

}
