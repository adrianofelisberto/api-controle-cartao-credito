package br.com.adriano.controlecartao.api.dtos;

import br.com.adriano.controlecartao.api.entities.Compra;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

public class ItemDTO {

    private Long id;

    @NotEmpty(message = "O nome do item não pode ser em branco.")
    @Length(min = 5, max = 50, message = "O nome do item deve ter entre 5 e 50 caracteres.")
    private String nome;

    @NotEmpty(message = "O valor do item não pode ser em branco.")
    private BigDecimal valor;

    @NotEmpty(message = "A compra a qual o item pertence não pode ser em branco.")
    private Compra compra;

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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
