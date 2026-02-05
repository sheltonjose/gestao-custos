package moz.com.javadevweek.gestao_custos.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import moz.com.javadevweek.gestao_custos.entity.Despesa;
import moz.com.javadevweek.gestao_custos.repository.DespesaRepository;

@Service
public class CadastroDespesaUseCase {
   //SOLID
   //Single Responsibility Principle

   @Autowired
   private DespesaRepository despesaRepository;


   public Despesa execute(Despesa despesa){

      if(despesa.getCategoria()==null || despesa.getData()==null || despesa.getDescricao()==null || despesa.getEmail()==null || despesa.getValor()==null){
         throw new IllegalArgumentException("Todos os campos devem ser preenchidos");


      }


      despesa = despesaRepository.save(despesa);

      return despesa;

      
      
   }

}
