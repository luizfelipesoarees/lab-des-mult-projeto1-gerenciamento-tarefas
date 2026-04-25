package com.lh.labdesmultprojeto1gerenciamentotarefas.service;

import com.lh.labdesmultprojeto1gerenciamentotarefas.model.Tarefa;
import com.lh.labdesmultprojeto1gerenciamentotarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa criar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public Tarefa buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Tarefa atualizar(Long id, Tarefa nova) {
        Tarefa existente = repository.findById(id).orElse(null);

        if (existente == null) return null;

        existente.setNome(nova.getNome());
        existente.setDescricao(nova.getDescricao());
        existente.setStatus(nova.getStatus());
        existente.setObservacoes(nova.getObservacoes());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}