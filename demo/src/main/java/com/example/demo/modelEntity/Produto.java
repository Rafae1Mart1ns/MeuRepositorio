package com.example.demo.modelEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Produto{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;

    private int qtdeestoque;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getQtdeestoque() {
        return qtdeestoque;
    }

    public void setQtdeestoque(int qtdeestoque) {
        this.qtdeestoque = qtdeestoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id && Objects.equals(nome, produto.nome) && Objects.equals(descricao, produto.descricao) && Objects.equals(qtdeestoque, produto.qtdeestoque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, qtdeestoque);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrição='" + descricao + '\'' +
                ", quantidade='" + qtdeestoque + '\'' +
                '}';
    }
}
