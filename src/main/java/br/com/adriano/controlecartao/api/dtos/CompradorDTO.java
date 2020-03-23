package br.com.adriano.controlecartao.api.dtos;

import br.com.adriano.controlecartao.api.entities.Usuario;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class CompradorDTO {

    private Long id;

    @NotEmpty(message = "O nome do comprador não pode ser em branco.")
    @Length(min = 5, max = 50, message = "O nome do comprador deve ter entre 5 e 50 caracteres.")
    private String nome;

    @NotEmpty(message = "O usuário não pode ser em branco.")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
