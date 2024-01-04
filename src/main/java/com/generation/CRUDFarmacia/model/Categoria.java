package com.generation.CRUDFarmacia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Nome da Categoria")
    @Size(min=3,max = 25, message = "Tamanho deve está entre 3 a 25 caracteres")
    @Column(length = 20)
    private String nome;

    @NotNull(message = "Descrição da Categoria")
    @Size(min = 10, max = 500, message = "A descrição da categoria deve ter entre 10 a 500 caracteres")
    @Column(length = 500)
    private String descricao;

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
}
