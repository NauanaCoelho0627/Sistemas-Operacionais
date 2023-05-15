package sptech.jswing.sprint2.controllers;


public class Rede {
    private String ipv4;
    private Long pacotesRecebidos;
    private Long pacotesEnviados;
    
    //Tipagem será mudada.
    private String dataHora;

    public Rede(String ipv4, Long pacotesRecebidos, Long pacotesEnviados, String dataHora) {
        this.ipv4 = ipv4;
        this.pacotesRecebidos = pacotesRecebidos;
        this.pacotesEnviados = pacotesEnviados;
        this.dataHora = dataHora;
    }

    public Rede() {
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    public Long getPacotesRecebidos() {
        return pacotesRecebidos;
    }

    public void setPacotesRecebidos(Long pacotesRecebidos) {
        this.pacotesRecebidos = pacotesRecebidos;
    }

    public Long getPacotesEnviados() {
        return pacotesEnviados;
    }

    public void setPacotesEnviados(Long pacotesEnviados) {
        this.pacotesEnviados = pacotesEnviados;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Rede{" + "ipv4=" + ipv4 + ", pacotesRecebidos=" + pacotesRecebidos + ", pacotesEnviados=" + pacotesEnviados + ", dataHora=" + dataHora + '}';
    }
    
    
}
