package com.example.mywebapp.service;

import com.example.mywebapp.model.Tarefa;

import java.util.List;

public interface TarefaService {
    List<Tarefa> listarTarefas();
    Tarefa obterTarefa(int id);
    Tarefa criarTarefa(Tarefa tarefa);
    Tarefa atualizarTarefa(int id, Tarefa tarefa);
    void excluirTarefa(int id);
}
