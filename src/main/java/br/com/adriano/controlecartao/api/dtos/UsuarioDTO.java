package br.com.adriano.controlecartao.api.dtos;

public class UsuarioDTO extends BaseDTO {

    private String username;
    private String email;
    private String nome;

    public UsuarioDTO() {}

    public UsuarioDTO(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
