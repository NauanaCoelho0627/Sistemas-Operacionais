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
public class ConnectionServer {
    private JdbcTemplate connection;

    public ConnectionServer() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://airplane-solutions.database.windows.net:1433;"
                + "database=bd-airplane-solutions;encrypt=true;trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;");
        dataSource.setUsername("totemInfo@airplane-solutions");
        dataSource.setPassword("Totem_!nf0");
        
        this.connection = new JdbcTemplate(dataSource);
    }
    
    public JdbcTemplate getConnection() {
        System.out.println("Acessando o banco de dados!");
        return connection;
    }
}
