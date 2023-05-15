/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2.models;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import sptech.jswing.sprint2.controllers.CPU;
import sptech.jswing.sprint2.controllers.Disco;
import sptech.jswing.sprint2.controllers.Janelas;
import sptech.jswing.sprint2.controllers.MemoriaRam;
import sptech.jswing.sprint2.controllers.Rede;
import sptech.jswing.sprint2.controllers.Totem;

/**
 *
 * @author NauanaCoelhodosSanto
 */
public class ScriptInserindoNoDocker {
    public static void main(String[] args) {
        ConnectionMySQL connection = new ConnectionMySQL();
        JdbcTemplate con = connection.getConnection();
        
        CPU cpu = new CPU();
        Disco disco = new Disco();
        Janelas janela = new Janelas();
        MemoriaRam memoria = new MemoriaRam();
        Rede rede = new Rede();
        Totem totem = new Totem();
        
        
        //inserindo na tabela companhia
        con.update("insert into companhiaAerea(nome, cnpj, email) values("
                + "'Azul', '123456789', 'azul@gmail.com.br'),"
                + "('Gol', '123456789', 'gol@gmail.com.br'),"
                + "('Latam', '123456789', 'latam@gmail.com.br');");
        
        //inserindo na tabela totem;
        con.update(String.format("insert into totem (token, localizacao, arquitetura, sistemaOperacional, processador,fkCompanhiaAerea) values("
                + "'a232', '%s', 'x86', '%s', '%s', 1);", totem.getLocalizacaoTotem(),totem.getSistemaOperacional(), totem.getProcessador()));
        
        //inserindo dentro da tabela rede
//        String pacotesEnviados = rede.getPacotesEnviados().toString();
//        String pacotesRecebidos = rede.getPacotesRecebidos().toString();
//        Integer pcEnviados = Integer.parseInt(pacotesEnviados);
//        Integer pcRecebidos = Integer.parseInt(pacotesRecebidos);
//        con.update(String.format("insert into registroRede (enderecoIPv4, pacotesRecebidos, pacotesEnviados, dataHoraCaptura, fkTotem) values("
//                + "'%s', '%d', '%d', '%s','1');",rede.getIpv4(), pcRecebidos,
//                pcEnviados, rede.getDataHora()));
        
        //inserindo dentro da tabela componente
        con.update("insert into componente (descricao) values("
                + "'MEMORIA RAM'),"
                + "('DISCO');");
        
        //inserindo na tabela componenteTotem memoria
        con.update(String.format("insert into componenteTotem (descricao, total, frequencia, fkComponente, fkTotem) values("
                + "'Memoria Ram', null, null, '1','1');"));
        
        //inserindo na tabela componenteTotem disco
        con.update(String.format("insert into componenteTotem (descricao, total, frequencia, fkComponente, fkTotem) values("
                + "'Disco', null, null, '2','1');"));
        
        //inserindo na tabela registro
        con.update(String.format("insert into registroComponente (valorUso, dataHotaCaptura, fkComponenteTotem) values("
                + "null, null, '1');"));
        
        //inserindo na tabela processoCPU
        con.update(String.format("insert into processoCPU (valorUsoCPU, valorUsoMemoria, bytesUtilizados"
                + "valorUsoMemoriaVirtual, fkRegistroComponente, fkComponenteTotem) values("
                + "'%.2d', null,null, null, '1', '1');"), cpu.getUsoCpu());
        
    }
   
}
