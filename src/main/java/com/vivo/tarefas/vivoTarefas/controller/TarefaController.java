package com.vivo.tarefas.vivoTarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivo.tarefas.vivoTarefas.domain.TarefaRepository;
import com.vivo.tarefas.vivoTarefas.domain.model.Tarefa;

@CrossOrigin
@RestController
@RequestMapping("/tarefas")
public class TarefaController {
	
	@Autowired
	TarefaRepository repo;
	
	@GetMapping("/all")
	public List<Tarefa> listarSaidasMensal() {
		return repo.findAll();
	}
	
	@PostMapping("/new")
	public Tarefa newTarefa(@RequestBody Tarefa t) {
		return repo.save(t);
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "Chegou!";
	}

}
