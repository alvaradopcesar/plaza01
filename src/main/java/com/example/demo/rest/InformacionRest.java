package com.example.demo.rest;

import com.example.demo.domain.Informacion;
import com.example.demo.service.InformacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InformacionRest {

    @Autowired
    InformacionService informacionService;

    @GetMapping("/informaciones")
    public List<Informacion> findAll() {
        return informacionService.findAll();
    }

    @PostMapping("/informacion")
    public Informacion createInformacion(@RequestBody Informacion informacion) {
        return  informacionService.Save(informacion);
    }

}
