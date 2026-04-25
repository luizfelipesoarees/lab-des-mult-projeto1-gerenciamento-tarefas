package com.lh.labdesmultprojeto1gerenciamentotarefas.controller;

import com.lh.labdesmultprojeto1gerenciamentotarefas.model.Tarefa;
import com.lh.labdesmultprojeto1gerenciamentotarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return service.criar(tarefa);
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Tarefa buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa nova) {
        return service.atualizar(id, nova);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}