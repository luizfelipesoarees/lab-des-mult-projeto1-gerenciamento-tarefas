package com.lh.labdesmultprojeto1gerenciamentotarefas.repository;

import com.lh.labdesmultprojeto1gerenciamentotarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}