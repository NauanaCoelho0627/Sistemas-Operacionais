package sptech.jswing.sprint2.models;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author marcusgoncalves
 */
public class Connection {
    private JdbcTemplate connection;

    public Connection() {
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
