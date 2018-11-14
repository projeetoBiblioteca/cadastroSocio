package control;

import dao.CadSocioDao;
import vo.SocioVo;
import java.sql.SQLException;


public class CadSocioControl 
{
  
  public CadSocioControl()
  {
    
  }
//-------------------------------------------------------------------------------------------------------------------------|  
  public void salvar(String nome,String fone,String imail )throws SQLException,Exception
  {
    SocioVo socioVoS = new SocioVo();
    
    socioVoS.setNome(nome);
    socioVoS.setFone(fone);
    socioVoS.setImail(imail);
    
    CadSocioDao socioDaoS = new CadSocioDao(socioVoS);
    socioDaoS.salvar();  
  }
//-------------------------------------------------------------------------------------------------------------------------|  
  public void editar(String codigo, String nome,String fone,String imail )throws SQLException,Exception
  {
    SocioVo socioVoEd = new SocioVo();
   
    socioVoEd.setCodigo(codigo);
    socioVoEd.setNome(nome);
    socioVoEd.setFone(fone);
    socioVoEd.setImail(imail);
    
    CadSocioDao socioDao = new CadSocioDao(socioVoEd);  
    socioDao.editar(); 
  }
//-------------------------------------------------------------------------------------------------------------------------|  
  public SocioVo buscar(String codigo ) throws Exception
  {
    SocioVo socioVoB = new SocioVo();
    
    socioVoB.setCodigo(codigo);
    
    CadSocioDao socioDaoB = new CadSocioDao(socioVoB);
   return socioDaoB.buscar();
  }
//-------------------------------------------------------------------------------------------------------------------------|  
  public void excluir(String codigo ) throws Exception
  {
    SocioVo socioVoEx = new SocioVo();
    
    socioVoEx.setCodigo(codigo);
    
    CadSocioDao socioDaoEx = new CadSocioDao(socioVoEx);
    socioDaoEx.excluir();
  }
 //-------------------------------------------------------------------------------------------------------------------------|
}
