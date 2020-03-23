package br.com.adriano.controlecartao.api.dtos;

import br.com.adriano.controlecartao.api.entities.CartaoCredito;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class CompraDTO {

    private Long id;

    @NotEmpty(message = "A descrição da compra não pode ser em branco.")
    @Length(min = 10, max = 100, message = "A descrição deve ter entre 10 e 100 caracteres.")
    private String descricao;

    private Integer parcelas;

    private Integer parcelasPagas;

    @NotEmpty(message = "O cartão de crédito da compra não pode ser em branco.")
    private CartaoCredito cartaoCredito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Integer getParcelasPagas() {
        return parcelasPagas;
    }

    public void setParcelasPagas(Integer parcelasPagas) {
        this.parcelasPagas = parcelasPagas;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
}
