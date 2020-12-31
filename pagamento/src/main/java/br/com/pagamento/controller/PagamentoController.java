package br.com.pagamento.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoController {

    @GetMapping
    public ResponseEntity<String> pagamento(){
        return ResponseEntity.ok("gerando pagamento");
    }

}
