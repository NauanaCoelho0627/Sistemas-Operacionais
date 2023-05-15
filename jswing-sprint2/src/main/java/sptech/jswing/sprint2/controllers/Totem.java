package sptech.jswing.sprint2.controllers;


public class Totem {
    private Integer idTotem;
    private Integer fkCompanhia;
    private String fabricante;
    private String arquitetura;
    private String sistemaOperacional;
    private String processador;
    private String localizacaoTotem;
    private String token;

    public Totem(Integer idTotem, Integer fkCompanhia, String fabricante, String arquitetura, String sistemaOperacional, String processador, String localizacaoTotem, String token) {
        this.idTotem = idTotem;
        this.fkCompanhia = fkCompanhia;
        this.fabricante = fabricante;
        this.arquitetura = arquitetura;
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
        this.localizacaoTotem = localizacaoTotem;
        this.token = token;
    }

    public Totem() {
    }

    public Integer getIdTotem() {
        return idTotem;
    }

    public void setIdTotem(Integer idTotem) {
        this.idTotem = idTotem;
    }

    public Integer getFkCompanhia() {
        return fkCompanhia;
    }

    public void setfkCompanhia(Integer fkCompanhia) {
        this.fkCompanhia = fkCompanhia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getArquitetura() {
        return arquitetura;
    }

    public void setArquitetura(String arquitetura) {
        this.arquitetura = arquitetura;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getLocalizacaoTotem() {
        return localizacaoTotem;
    }

    public void setLocalizacaoTotem(String localizacaoTotem) {
        this.localizacaoTotem = localizacaoTotem;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Totem{" + "idTotem=" + idTotem + ", fkCompanhia=" + fkCompanhia + ", fabricante=" + fabricante + ", arquitetura=" + arquitetura + ", sistemaOperacional=" + sistemaOperacional + ", processador=" + processador + ", localizacaoTotem=" + localizacaoTotem + ", token=" + token + '}';
    }
    
    
}
