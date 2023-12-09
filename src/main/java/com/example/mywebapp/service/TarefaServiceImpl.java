package com.example.mywebapp.service;

import com.example.mywebapp.model.Tarefa;
import com.example.mywebapp.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServiceImpl implements TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    @Override
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    @Override
    public Tarefa obterTarefa(int id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    @Override
    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa atualizarTarefa(int id, Tarefa tarefa) {
        if (tarefaRepository.existsById(id)) {
            tarefa.setId(id);
            return tarefaRepository.save(tarefa);
        }
        return null;
    }

    @Override
    public void excluirTarefa(int id) {
        tarefaRepository.deleteById(id);
    }
}
