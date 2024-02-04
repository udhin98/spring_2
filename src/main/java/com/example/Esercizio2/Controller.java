package com.example.Esercizio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class Controller {
   @GetMapping("/ciao/Lombardia")
    public Saluto saluto (@RequestParam String nome) {
        String provincia = "Lombardia";
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new Saluto(nome,provincia, saluto);
    }
}
