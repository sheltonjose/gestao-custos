package moz.com.javadevweek.gestao_custos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import moz.com.javadevweek.gestao_custos.entity.Despesa;
import moz.com.javadevweek.gestao_custos.useCases.CadastroDespesaUseCase;





@RestController
@RequestMapping("/gestao")
public class GestaoDespesaController {

    /*
        cadastrar despesa(casos de uso da aplicação)
        criar tabelas na base de dados
        criar entidade
    */
   @Autowired
    CadastroDespesaUseCase cadastroDespesaUseCase;

    @PostMapping("/create")
    public Despesa createDespesa(@RequestBody Despesa despesa){
        
        return cadastroDespesaUseCase.execute(despesa);


    }





}
