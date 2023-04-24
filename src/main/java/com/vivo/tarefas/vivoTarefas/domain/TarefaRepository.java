package com.vivo.tarefas.vivoTarefas.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivo.tarefas.vivoTarefas.domain.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}
