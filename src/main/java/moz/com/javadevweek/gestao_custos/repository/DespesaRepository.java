package moz.com.javadevweek.gestao_custos.repository;

import java.util.List;
import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;

import moz.com.javadevweek.gestao_custos.entity.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, UUID> {

    List<Despesa> findByEmail(String email);




} 