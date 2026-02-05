package moz.com.javadevweek.gestao_custos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import moz.com.javadevweek.gestao_custos.custom_messages.ErrorMessages;
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
    public ResponseEntity<?> createDespesa(@RequestBody Despesa despesa){
     

        try{
           var result= cadastroDespesaUseCase.execute(despesa);

           return ResponseEntity.ok(result);//200 OK
        }catch(IllegalArgumentException e){
            var ErrorMessage = new ErrorMessages(e.getMessage(), "INVALID PARAMS");
            return ResponseEntity.badRequest().body(ErrorMessage); //400 BAD REQUEST
        }

    }

    // /gestao/find/sheltonjose02@gmail.com?data=2026-06-01
    @GetMapping("/{email}")
    public void findByEmailAndDate(@PathVariable String email){

    }





}
