package com.example.Atividade;

import org.springframework.web.bind.annotation.*;

@RestController
public class EndPoint {
    Usuario us1 = new Usuario("matheus", 22, 22);

    @GetMapping("/get")
    public Usuario getUsuario(){
        return us1;
    }
    @DeleteMapping("/delete")
    public String getDelete(){
    if (us1 != null) {
        us1 = null;
        return "Usuario deletado";
        }else {
        return "usuario ja foi deletado ou nao existe";
    }
    }
    @PostMapping("/post")
    public String createUsuario(@RequestBody Usuario novoUsuario) {
        if (us1 == null) {
            us1 = novoUsuario;
            return "Novo usuario criado com sucesso!";
        } else {
            return "Usuario já existe. Use PUT para atualizar.";
        }
    }
    @PutMapping("/put")
    public String updateUsuario(@RequestBody Usuario usuarioAtualizado) {
        if (us1 != null) {
            us1.setNome(usuarioAtualizado.getNome());
            us1.setCpf(usuarioAtualizado.getCpf());
            us1.setTelefone(usuarioAtualizado.getTelefone());
            return "Usuario atualizado com sucesso!";
        } else {
            return "Usuario não existe. Use POST para criar um novo.";
        }
    }
}
