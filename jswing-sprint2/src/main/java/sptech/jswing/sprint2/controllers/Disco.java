package sptech.jswing.sprint2.controllers;

import java.util.List;

/**
 *
 * @author marcusgoncalves
 */
public class Disco {
    private Long valorDisponivel;
    private Long valorEmUso;
    private Long qtdLeituras;
    
    //Tipagem será modificada depois
    private String dataHora;

    public Disco(Long valorDisponivel, Long valorEmUso, Long qtdLeituras, String dataHora) {
        this.valorDisponivel = valorDisponivel;
        this.valorEmUso = valorEmUso;
        this.qtdLeituras = qtdLeituras;
        this.dataHora = dataHora;
    }

    public Disco() {
    }

    public Long getValorDisponivel() {
        return valorDisponivel;
    }

    public void setValorDisponivel(Long valorDisponivel) {
        this.valorDisponivel = valorDisponivel;
    }

    public Long getValorEmUso() {
        return valorEmUso;
    }

    public void setValorEmUso(Long valorEmUso) {
        this.valorEmUso = valorEmUso;
    }

    public Long getQtdLeituras() {
        return qtdLeituras;
    }

    public void setQtdLeituras(Long qtdLeituras) {
        this.qtdLeituras = qtdLeituras;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Disco{" + "valorDisponivel=" + valorDisponivel + ", valorEmUso=" + valorEmUso + ", qtdLeituras=" + qtdLeituras + ", dataHora=" + dataHora + '}';
    }
    
    
}
