package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conection {
    
    //ATRIBUTOS
    private static Connection conection = null;
    
    //Esta é a variável fonte que recebe o mesmo nome da base dados
    //criada no postgresql
    private String fonte = "CursoInverno";
    
    //Conexão com a base de dados do PostgreSQL utilizando JDBC
    private Conection() {

        try {
            //Driver para fazer conexão com um banco PostgreSQL
            Class.forName("org.postgresql.Driver");
            
            //Comando para fazer conexão via JDBC com um banco PostgreSQL,
            //informando-se o servidor e sua porta. No caso, "localhost" na porta "5432"
            // + o nome da base de dados, o usuario que será utilizado e sua senha.
            conection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/"
                    + fonte, "postgres", "senha1234");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro de class não encontrada!!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro na conection com o banco de dados !!!");
        }
    }

    public static Connection getInstance() {
        if (conection == null) {
            new Conection();
        }
        return conection;
    }
}