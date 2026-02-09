package moz.com.javadevweek.gestao_custos.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import moz.com.javadevweek.gestao_custos.entity.Despesa;
import moz.com.javadevweek.gestao_custos.repository.DespesaRepository;



@RequestMapping("/gestao/performance")
@RestController
public class GestaoDespesaPerformance {



    @Autowired
     DespesaRepository repository;

    @GetMapping("/sem-paginacao")
    public ResponseEntity<List<Despesa>> ListarSemPaginacao(){
        long start = System.currentTimeMillis();
        var despesas = repository.findAll();

        long end = System.currentTimeMillis();
        System.out.println("Tempo gasto para listar despesas sem paginação: " + (end - start) + " ms");
        return ResponseEntity.ok(despesas);
    }

    @GetMapping("/com-paginacao") //
    public ResponseEntity<List<Despesa>> ListarComPaginacao(){
        long start = System.currentTimeMillis();
        var despesas = repository.findAll();

        long end = System.currentTimeMillis();
        System.out.println("Tempo gasto para listar despesas com paginação: " + (end - start) + " ms");
        return ResponseEntity.ok(despesas);
    }






}
