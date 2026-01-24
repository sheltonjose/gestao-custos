package moz.com.javadevweek.gestao_custos.useCases;

import moz.com.javadevweek.gestao_custos.entity.Despesa;

public class CadastroDespesaUseCase {
   //SOLID
   //Single Responsibility Principle

   public void execute(Despesa despesa){
      System.out.println(despesa.getCategoria());
       
   }

}
