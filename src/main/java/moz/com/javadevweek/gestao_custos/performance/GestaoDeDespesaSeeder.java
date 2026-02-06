package moz.com.javadevweek.gestao_custos.performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import moz.com.javadevweek.gestao_custos.repository.DespesaRepository;


@Component
public class GestaoDeDespesaSeeder implements CommandLineRunner {


    @Autowired
    private DespesaRepository despesaRepository;
    


    @Override
    public void run(String... args) throws Exception {
        // Lógica para popular a base de dados com dados de teste, se necessário
        System.out.println("Aplicação iniciada. Base de dados pronta para uso.");
    }

}
