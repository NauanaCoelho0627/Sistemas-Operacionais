package sptech.jswing.sprint2.models;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 *
 * @author NauanaCoelhodosSanto
 */
public class ConnectionMySQL {
      private JdbcTemplate connectionMySQL;

    public ConnectionMySQL() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://100.26.187.124:3306/banco1?autoReconnect=true&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
        
        this.connectionMySQL = new JdbcTemplate(dataSource);
    }
    
    
    public JdbcTemplate getConnection() {
        System.out.println("Acessando o banco de dados!");
        return connectionMySQL;
    }
}
