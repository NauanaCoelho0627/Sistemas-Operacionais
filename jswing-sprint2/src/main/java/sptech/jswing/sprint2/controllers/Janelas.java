package sptech.jswing.sprint2.controllers;



public class Janelas {
    private Integer PID;
    private String titulo;
    private String comando;
    private String localizacao;
    private Boolean visivel;
    
    //Tipagem será mudada.
    private String dataHora;

    public Janelas(Integer PID, String titulo, String comando, String localizacao, Boolean visivel, String dataHora) {
        this.PID = PID;
        this.titulo = titulo;
        this.comando = comando;
        this.localizacao = localizacao;
        this.visivel = visivel;
        this.dataHora = dataHora;
    }

    public Janelas() {
    }
    

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Boolean getVisivel() {
        return visivel;
    }

    public void setVisivel(Boolean visivel) {
        this.visivel = visivel;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Janelas{" + "PID=" + PID + ", titulo=" + titulo + ", comando=" + comando + ", localizacao=" + localizacao + ", visivel=" + visivel + ", dataHora=" + dataHora + '}';
    }

    
}
