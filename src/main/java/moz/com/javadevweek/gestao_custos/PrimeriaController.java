package moz.com.javadevweek.gestao_custos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/javadevweek")
public class PrimeriaController {




    public String helloWorld(){
        return "Hello World, 2026";
    }

}
