/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli.individual.connectiom;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import cli.individual.controlls.Totem;

/**
 *
 * @author NauanaCoelhodosSanto
 */
public class TotemCrud {
    public Totem getTotemByToken(String token) {

        ConnectionServer conServer = new ConnectionServer();
        JdbcTemplate cursor = conServer.getConnection();

        List<Totem> validacao = cursor.query(String.format("SELECT * FROM totem as t JOIN componenteTotem as ct ON  t.idTotem = ct.fkTotem JOIN componente as c ON c.idComponente = ct.fkComponente;", token)
                , new BeanPropertyRowMapper(Totem.class));
        for (Totem totem : validacao) {
            return totem;
        }

        return null;

    }
    
    public Totem getTotemByToken1(String token) {

        ConnectionSQL con = new ConnectionSQL();
        JdbcTemplate cursor = con.getConnection();

        List<Totem> validacao = cursor.query(String.format("SELECT * FROM totem as t JOIN componenteTotem as ct ON  t.idTotem = ct.fkTotem JOIN componente as c ON c.idComponente = ct.fkComponente;", token)
                , new BeanPropertyRowMapper(Totem.class));
        for (Totem totem : validacao) {
            return totem;
        }

        return null;

    }
}
