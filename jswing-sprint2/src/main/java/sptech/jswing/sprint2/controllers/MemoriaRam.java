package sptech.jswing.sprint2.controllers;

/**
 *
 * @author marcusgoncalves
 */
public class MemoriaRam {
    private Double emUso;
    private Double disponivel;
    
    //Tipagem será mudada.
    private String dataHora;

    public MemoriaRam(Double emUso, Double disponivel, String dataHora) {
        this.emUso = emUso;
        this.disponivel = disponivel;
        this.dataHora = dataHora;
    }

    public MemoriaRam() {
    }

    public Double getEmUso() {
        return emUso;
    }

    public void setEmUso(Double emUso) {
        this.emUso = emUso;
    }

    public Double getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Double disponivel) {
        this.disponivel = disponivel;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "MemoriaRam{" + "emUso=" + emUso + ", disponivel=" + disponivel + ", dataHora=" + dataHora + '}';
    }
    
    
}
