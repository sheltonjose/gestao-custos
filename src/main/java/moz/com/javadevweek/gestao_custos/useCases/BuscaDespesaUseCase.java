package moz.com.javadevweek.gestao_custos.useCases;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moz.com.javadevweek.gestao_custos.entity.Despesa;
import moz.com.javadevweek.gestao_custos.repository.DespesaRepository;

@Service
public class BuscaDespesaUseCase {


@Autowired
private DespesaRepository despesaRepository;

public List<Despesa> buscarPorEmailEData(String email, LocalDate data){
    


}

}
