package com.example.lojamarcao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="lancamento")
public class Lancamento{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codLancamento;

    @NotNull
    private String tipo;

    private Boolean status;

    @NotNull
    private Long total;

    public Long getCodLancamento() {
        return codLancamento;
    }

    public void setCodLancamento(Long codLancamento) {
        this.codLancamento = codLancamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codLancamento == null) ? 0 : codLancamento.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lancamento other = (Lancamento) obj;
        if (codLancamento == null) {
            if (other.codLancamento != null)
                return false;
        } else if (!codLancamento.equals(other.codLancamento))
            return false;
        return true;
    }
}