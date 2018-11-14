package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao 
{
  public static Connection con;
 
  private final String driver;
  private final String url;
  private final String usuario;
  private final String senha;

  public Conexao() 
  {
    driver = ("com.mysql.jdbc.Driver");
    url = ("jdbc:mysql://localhost:3306/biblioteca");
    usuario =("root");
    senha = ("");
  
  }
  
  
  public  Connection conectar()throws ClassNotFoundException, SQLException
  {
    con = null;
    Class.forName(driver);
    con = DriverManager.getConnection(url, usuario, senha);
    return con;
    
  }
  
  public void desconectar() throws SQLException
  {
    con.close();
  }
}
