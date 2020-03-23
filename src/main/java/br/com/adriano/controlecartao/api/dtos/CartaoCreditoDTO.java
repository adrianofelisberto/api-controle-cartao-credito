package br.com.adriano.controlecartao.api.dtos;

import br.com.adriano.controlecartao.api.entities.Usuario;

import javax.validation.constraints.NotEmpty;

public class CartaoCreditoDTO {

    private Long id;

    private String bandeira;

    private String logo;

    @NotEmpty(message = "O dia do vencimento não pode ser em branco.")
    private Integer diaVencimento;

    @NotEmpty(message = "O dia do fechamento não pode ser em branco.")
    private Integer diaFechamento;

    @NotEmpty(message = "O usuário do cartão deve ser informado.")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(Integer diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public Integer getDiaFechamento() {
        return diaFechamento;
    }

    public void setDiaFechamento(Integer diaFechamento) {
        this.diaFechamento = diaFechamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
