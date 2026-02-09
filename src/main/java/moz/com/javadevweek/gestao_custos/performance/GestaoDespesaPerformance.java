package moz.com.javadevweek.gestao_custos.performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import moz.com.javadevweek.gestao_custos.repository.DespesaRepository;



@RequestMapping("/gestao/performance")
public class GestaoDespesaPerformance {



    @Autowired
    private DespesaRepository despesaRepository;






    

}
