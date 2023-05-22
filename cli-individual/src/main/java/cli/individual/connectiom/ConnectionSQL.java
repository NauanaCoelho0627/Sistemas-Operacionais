/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli.individual.connectiom;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author NauanaCoelhodosSanto
 */
public class ConnectionSQL {
    private JdbcTemplate connection;

    public ConnectionSQL() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://mydatabase:3306/banco1");
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
        
        this.connection = new JdbcTemplate(dataSource);
    }
    
    public JdbcTemplate getConnection() {
        System.out.println("Acessando o banco de dados!");
        return connection;
    }
}
