package com.example.exercicio1jpa.Controller;

import com.example.exercicio1jpa.entity.Endereco;
import com.example.exercicio1jpa.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("api/v1")
    public class EnderecoController {
        @Autowired
        private EnderecoService enderecoService;

        @PostMapping("endereco")
        public Endereco salvarEndereco(@RequestBody Endereco endereco){
            return enderecoService.salvarEndereco(endereco);
        }
        @GetMapping("endereco/{Id}")
        public Endereco  buscarEndereco (@PathVariable Long Id ){
            return enderecoService.buscarEndereco(Id);
        }
        @GetMapping("endereco")
        public List<Endereco> ListaEndereco(){
            return  enderecoService.ListaEndereco();
        }
        @GetMapping ("/deletar/{id}")
        public void deletarEndereco(@PathVariable Long id){enderecoService.deletarEndereco(id);
        }
        @GetMapping ("endereco/cidade/{nomeCidade}")
        public List<Endereco> buscarPorCidade(@PathVariable String nomeCidade){
            return enderecoService.buscarPorCidade(nomeCidade);
        }
        @GetMapping ("endereco/cep/{cep}")
        public List<Endereco> buscarcep(@PathVariable String cep){
            return enderecoService.buscarcep(cep);
        }
        @GetMapping ("endereco/rua/{rua}")
        public List<Endereco> buscarRua(@PathVariable String rua){
            return enderecoService.buscarRua(rua);
        }
    }

