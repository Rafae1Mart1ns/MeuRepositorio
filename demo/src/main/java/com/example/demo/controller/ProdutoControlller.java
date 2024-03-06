package com.example.demo.controller;

import com.example.demo.modelEntity.Produto;
import com.example.demo.repository.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/produto")
public class ProdutoControlller {
    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(
            @RequestParam String nome,
            @RequestParam String descricao,
            @RequestParam int qtdeEstoque
    ){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setDescricao(descricao);
        produto.setQtdeestoque(qtdeEstoque);

        produtoRepositorio.save(produto);
        return produto + " salvo";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Produto> getAllUsers(){
        return produtoRepositorio.findAll();
    }

    }
