package br.com.adriano.controlecartao.api.dtos;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class UsuarioCadastroDTO extends BaseDTO {

    private Long id;

    @NotEmpty(message = "O nome do usuário não pode ser em branco.")
    @Length(min = 3, max = 100, message = "O nome do usuário deve ter entre 3 e 100 caracteres.")
    private String nome;

    @NotEmpty(message = "O password não pode ser em branco.")
    @Length(min = 6, max = 6, message = "O deve ter 6 caracteres.")
    private String password;

    @NotEmpty(message = "O username não pode ser em branco.")
    @Length(min = 5, max = 100, message = "O username deve ter entre 5 e 10 caracteres.")
    private String username;

    @NotEmpty(message = "O email não pode ser em branco.")
    @Length(min = 5, max = 150, message = "O email deve ter entre 5 e 150 caracteres.")
    @Email(message = "Email inválido.")
    private String email;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
