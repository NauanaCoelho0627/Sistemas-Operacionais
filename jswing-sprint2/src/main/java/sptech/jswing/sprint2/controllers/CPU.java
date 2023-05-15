package sptech.jswing.sprint2.controllers;

import java.util.List;


public class CPU {
    private Double usoCpu;
    private Double frequencia;
    
    //A tipagem da lista será mudada.
    private List<String> processos;
    
    //Tipagem será modificada.
    private String dataHora;

    public CPU(Double usoCpu, Double frequencia, List<String> processos, String dataHora) {
        this.usoCpu = usoCpu;
        this.frequencia = frequencia;
        this.processos = processos;
        this.dataHora = dataHora;
    }

    public CPU() {
    }

    public Double getUsoCpu() {
        return usoCpu;
    }

    public void setUsoCpu(Double usoCpu) {
        this.usoCpu = usoCpu;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }

    public List<String> getProcessos() {
        return processos;
    }

    public void setProcessos(List<String> processos) {
        this.processos = processos;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "CPU{" + "usoCpu=" + usoCpu + ", frequencia=" + frequencia + ", processos=" + processos + ", dataHora=" + dataHora + '}';
    }
    
    
}
