package com.example.exercicio1jpa.service;

import com.example.exercicio1jpa.entity.Endereco;
import com.example.exercicio1jpa.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);

    }

    public Endereco buscarEndereco(Long id) {
        return enderecoRepository.findById(id).get();
    }

    public List<Endereco> ListaEndereco() {
        return enderecoRepository.findAll();

    }

    public void deletarEndereco(Long Id) {
        enderecoRepository.deleteById(Id);
    }

    public List<Endereco> buscarPorCidade(String nomeCidade) {
        return enderecoRepository.findAllByCidade(nomeCidade);
    }

    public List<Endereco> buscarcep(String cep) {
        return enderecoRepository.findAllByCep(cep);
    }

    public List<Endereco> buscarRua(String rua) {
        return enderecoRepository.findAllByRua(rua);
    }
}
