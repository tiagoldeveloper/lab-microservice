package br.com.financeiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/financeiro")
public class FinanceiroController {

    @GetMapping
    public Flux<List<String>> financeiro(){
        return fluxo();
    }


    private Flux<List<String>> fluxo(){
        List<String>  strings = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            strings.add("Gerando financeiro =>"+i);
        }
        return Flux.just(strings);
    }

}
