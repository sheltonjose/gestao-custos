package moz.com.javadevweek.gestao_custos.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import moz.com.javadevweek.gestao_custos.entity.Despesa;
import moz.com.javadevweek.gestao_custos.repository.DespesaRepository;



@RequestMapping("/gestao/performance")
public class GestaoDespesaPerformance {



    @Autowired
     DespesaRepository repository;


    public ResponseEntity<List<Despesa>> ListarSemPaginacao(){
        long start = System.currentTimeMillis();
        var despesas = repository.findAll();

        
        return ResponseEntity.ok(despesas);
    }







}
