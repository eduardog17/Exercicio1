package com.example.exercicio1jpa.repository;

import com.example.exercicio1jpa.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnderecoRepository extends JpaRepository <Endereco,Long>{

    List<Endereco> findAllByCidade (String cidade);
    List<Endereco> findAllByRua(String rua);
    List<Endereco> findAllByCep (String cep);
}
