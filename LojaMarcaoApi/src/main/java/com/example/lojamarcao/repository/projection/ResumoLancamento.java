package com.example.lojamarcao.repository.projection;

import com.example.lojamarcao.model.TipoLancamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ResumoLancamento {

    private Long cod;
    private String descricao;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private BigDecimal valor;
    private TipoLancamento tipo;
    private String categoria;
    private String pessoa;

    public ResumoLancamento(Long cod, String descricao, LocalDate dataVencimento, LocalDate dataPagamento,
	    BigDecimal valor, TipoLancamento tipo, String categoria, String pessoa) {
	this.cod = cod;
	this.descricao = descricao;
	this.dataVencimento = dataVencimento;
	this.dataPagamento = dataPagamento;
	this.valor = valor;
	this.tipo = tipo;
	this.categoria = categoria;
	this.pessoa = pessoa;
    }

    public Long getCod() {
	return cod;
    }

    public void setCod(Long cod) {
	this.cod = cod;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public LocalDate getDataVencimento() {
	return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
	this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataPagamento() {
	return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
	this.dataPagamento = dataPagamento;
    }

    public BigDecimal getValor() {
	return valor;
    }

    public void setValor(BigDecimal valor) {
	this.valor = valor;
    }

    public TipoLancamento getTipo() {
	return tipo;
    }

    public void setTipo(TipoLancamento tipo) {
	this.tipo = tipo;
    }

    public String getCategoria() {
	return categoria;
    }

    public void setCategoria(String categoria) {
	this.categoria = categoria;
    }

    public String getPessoa() {
	return pessoa;
    }

    public void setPessoa(String pessoa) {
	this.pessoa = pessoa;
    }

}
