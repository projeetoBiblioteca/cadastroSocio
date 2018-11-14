package dao;

import conexao.Conexao;
import vo.SocioVo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CadSocioDao 
{
  private SocioVo socioVo;
  public CadSocioDao(SocioVo socioVo)
  {
    this.socioVo = socioVo;
  }
  
  public void salvar() throws SQLException,Exception
  {
    String sql = "INSERT INTO socio( socio_nome, "
               + "                   socio_fone, "
               + "                   socio_imail)"
               + "VALUES  ('"      + socioVo.getNome() 
               + "','"             + socioVo.getFone() 
               + "','"             + socioVo.getImail()+"')";
    
    
    System.out.println(sql);
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);

    conexao.desconectar();
  }
  
  public void editar()throws SQLException,Exception, ClassNotFoundException, ClassNotFoundException
  {
    int num = Integer.parseInt(socioVo.getCodigo());
    String sql = "update socio set socio_nome = '" + socioVo.getNome()  + "',"
                                + "socio_fone     = '" + socioVo.getFone()  + "',"
                                + "socio_imail    = '" + socioVo.getImail() + "' " 
                                + "where socio_id = "  + num;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    
    conexao.desconectar();
  }
  
  public SocioVo getSocioVo() {
    return socioVo;
  }

  public void setSocioVo(SocioVo socioVo) {
    this.socioVo = socioVo;
  }

  public SocioVo buscar()throws SQLException,Exception, ClassNotFoundException, ClassNotFoundException
  {
    
    int codigo = Integer.parseInt(socioVo.getCodigo());
    
    String sql = "select * from socio where socio_id ="+codigo;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    
    Statement sessao = con.createStatement();
    ResultSet rs = sessao.executeQuery(sql);
    
    if(rs.next())
    {
      String dCod = Integer.toString(rs.getInt("socio_id"));
      String dNome = rs.getString("socio_nome");
      String dFone = rs.getString("socio_fone");
      String dImail = rs.getString("socio_imail");
      
      socioVo.setCodigo(dCod);
      socioVo.setNome(dNome);
      socioVo.setFone(dFone);
      socioVo.setImail(dImail);
    }
    conexao.desconectar();
    return socioVo;
  }
  
  public void excluir()throws SQLException,Exception, ClassNotFoundException, ClassNotFoundException
  {
    int codigo = Integer.parseInt(socioVo.getCodigo());
     
    String sql = "delete from socio where socio_id = " + codigo;
    
    Conexao conexao = new Conexao();
    Connection con = conexao.conectar();
    
    Statement sessao = con.createStatement();
    sessao.executeUpdate(sql);
    
    conexao.desconectar();
  }
}
