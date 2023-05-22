/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.jswing.sprint2.models;

import com.github.britooo.looca.api.core.Looca;
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
    
    
    
    public static void insertMysql () {
        ConnectionMySQL connection = new ConnectionMySQL();
        JdbcTemplate con = connection.getConnection();
        
//        //instanciando looca api
//        Looca looca = new Looca();
//        com.github.britooo.looca.api.group.rede.Rede rede = looca.getRede();
//        System.out.println(rede.getGrupoDeInterfaces().getInterfaces());


        //dando select no totem
        TotemCRUD totemCrud = new TotemCRUD();
        Totem totem = totemCrud.getTotemByToken("A233");

        System.out.println("Validando totem" + totem);
        //inserindo dentro da tabela rede
        
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
                + "null, null, null, null, '1', '1');"));  
        
    }
   
}
