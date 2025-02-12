package com.senai.project.Controller;

import com.senai.project.DataBase.BancoDeProdutos;
import com.senai.project.Model.Produto;

import java.util.List;

public class Controller {
    private BancoDeProdutos bancoDeProdutos;


    public void inserirNoBanco(Produto p) {
        bancoDeProdutos.insert(p);
    }

    public List<Produto> pegarTodosOsProdutos() {
        return bancoDeProdutos.findAll();
    }

    public void update(Produto p) {
        bancoDeProdutos.update(p);
    }

    public void excluir(Produto p){
        bancoDeProdutos.delete(p.getIdProduto());
    }

}
