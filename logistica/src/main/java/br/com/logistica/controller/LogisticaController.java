package br.com.logistica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/logistica")
public class LogisticaController {

    @GetMapping
    public ResponseEntity<String> logistica(){
        return ResponseEntity.ok("gerando logistica");
    }

}
