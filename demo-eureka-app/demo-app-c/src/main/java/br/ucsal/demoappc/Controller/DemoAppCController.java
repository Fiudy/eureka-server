package br.ucsal.demoappc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAppCController { 

    @GetMapping("/random")
    public int getRandom() {
        return (int) (Math.random() * 10);
    }
}
