package com.lh.labdesmultprojeto1gerenciamentotarefas;

import com.lh.labdesmultprojeto1gerenciamentotarefas.model.Tarefa;
import com.lh.labdesmultprojeto1gerenciamentotarefas.service.TarefaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Labdesmultprojeto1gerenciamentotarefasApplicationTests {

	@Autowired
	private TarefaService service;

	@Test
	void deveCriarTarefa() {
		Tarefa tarefa = new Tarefa();
		tarefa.setNome("Teste");
		tarefa.setDescricao("Desc");
		tarefa.setStatus("PENDENTE");

		Tarefa salva = service.criar(tarefa);

		assertNotNull(salva.getId());
		assertNotNull(salva.getDataCriacao());
	}

	@Test
	void deveAtualizarTarefa() {
		Tarefa tarefa = new Tarefa();
		tarefa.setNome("Original");
		tarefa.setDescricao("Desc");
		tarefa.setStatus("PENDENTE");

		Tarefa salva = service.criar(tarefa);

		Tarefa nova = new Tarefa();
		nova.setNome("Atualizada");
		nova.setDescricao("Nova desc");
		nova.setStatus("CONCLUIDA");

		Tarefa atualizada = service.atualizar(salva.getId(), nova);

		assertEquals("Atualizada", atualizada.getNome());
		assertNotNull(atualizada.getDataAtualizacao());
		assertNotNull(atualizada.getDataCriacao());
	}

	@Test
	void deveDeletarTarefa() {
		Tarefa tarefa = new Tarefa();
		tarefa.setNome("Deletar");
		tarefa.setDescricao("Desc");
		tarefa.setStatus("PENDENTE");

		Tarefa salva = service.criar(tarefa);

		service.deletar(salva.getId());

		Tarefa buscada = service.buscar(salva.getId());

		assertNull(buscada);
	}
}