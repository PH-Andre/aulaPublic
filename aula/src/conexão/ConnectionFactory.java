package conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

        public static Connection criaConexao(){
            System.out.println("Estabelecendo conexão com BD");
            String str = "jdbc:mysql://localhost/agenda";
            String user = "root";
            String password = "root";

            try {
                return DriverManager.getConnection(str,user,password);
            } catch (SQLException e ){
                throw new RuntimeException(e.getMessage());
            }
        }
}

