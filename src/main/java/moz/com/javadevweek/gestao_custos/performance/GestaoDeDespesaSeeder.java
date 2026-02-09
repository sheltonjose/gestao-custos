package moz.com.javadevweek.gestao_custos.performance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import moz.com.javadevweek.gestao_custos.entity.Despesa;
import moz.com.javadevweek.gestao_custos.repository.DespesaRepository;


//@Component
public class GestaoDeDespesaSeeder implements CommandLineRunner {


    @Autowired
    private DespesaRepository despesaRepository;
    


    @Override
    public void run(String... args) throws Exception {
        // Lógica para popular a base de dados com dados de teste, se necessário
        
        List<Despesa> despesas = new ArrayList<>();
        System.out.println("Iniciando a geração de seed.");



        for(int i= 0; i <= 150000; i++){
            Despesa despesa = new Despesa();
            despesa.setDescricao("Gasto nr : " + i);
            despesa.setValor(BigDecimal.valueOf(100 + (i % 50))); // Valor de exemplo
            despesa.setData(LocalDate.now().minusDays(i % 30)); // Data de exemplo entre dia 1 a 30
            despesa.setCategoria("Teste " ); 
            despesa.setEmail("performance@gmail.com" ); 


            despesas.add(despesa);

        }
        despesaRepository.saveAll(despesas);
        System.out.println("Seed finalizado com sucesso! Total de despesas geradas: " + despesas.size());

    }

}
