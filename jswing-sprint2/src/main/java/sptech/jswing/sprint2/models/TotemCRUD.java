package sptech.jswing.sprint2.models;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sptech.jswing.sprint2.controllers.Totem;

import java.util.List;

public class TotemCRUD {
    public Totem getTotemByToken(String token) {

        Connection con = new Connection();
        JdbcTemplate cursor = con.getConnection();

        List<Totem> validacao = cursor.query(String.format("SELECT * FROM totem as t JOIN componenteTotem as ct ON  t.idTotem = ct.fkTotem JOIN componente as c ON c.idComponente = ct.fkComponente;", token)
                , new BeanPropertyRowMapper(Totem.class));
        for (Totem totem : validacao) {
            return totem;
        }

        return null;

    }
}
