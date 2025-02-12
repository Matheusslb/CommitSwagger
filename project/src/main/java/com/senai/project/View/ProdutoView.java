package com.senai.project.View;


import com.senai.project.Controller.Controller;
import com.senai.project.Model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProdutoView {

    Controller c1 = new Controller();

    @GetMapping("/produto")
    public List<Produto> getAllProdutos(){
        return c1.pegarTodosOsProdutos();
    }

    @PostMapping("/produto")
    public String postNovoProduto(@RequestBody Produto p){
        c1.inserirNoBanco(p);
        return "Sucesso";
    }

    //@DeleteMapping("/delete")
    @PutMapping("/produto")
    public String updatePut(@RequestBody Produto p){
        c1.update(p);
        return "update feito";
    }

    @DeleteMapping("/delete")
    public String excluir(@RequestBody Produto p){
        c1.excluir(p);
        return "excluido com sucesso";
    }
}