package visao;

import control.CadSocioControl;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import template.CadastroTemplate;
import vo.SocioVo;


public class CadSocioView extends CadastroTemplate implements ActionListener
{
  
  private static final long serialVersionUID = 1L;
 
  private SocioVo socioVo;
  
  public CadSocioView() 
  {
    initComponents();
    setSize(400, 310);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  }
//=================================================================================================|
 @Override
  public void btnSalvarActionPerformed(ActionEvent e) {
    String texto = "";
    
    if(tfCodi.getText().equals(texto))
    {
      try
      {
        CadSocioControl socioControl = new CadSocioControl();
        socioControl.salvar(this.tfNome.getText(),
                this.tfFone.getText(),
                this.tfImail.getText());
        
        JOptionPane.showMessageDialog(null,"Socio cadastrado com sucesso","Cadastro Socio",JOptionPane.INFORMATION_MESSAGE);
      }
      catch(SQLException sqle)
      {
        JOptionPane.showMessageDialog(null,"Erro: "+sqle.getMessage(),"Cadastro Socio",JOptionPane.INFORMATION_MESSAGE);
      }
      catch(Exception ex)
      {
        JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage(),"Cadastro Socio",JOptionPane.INFORMATION_MESSAGE);
      }
    }
    else
      
    {
      try
      {
        CadSocioControl socioControl = new CadSocioControl();
        socioControl.editar(this.tfCodi.getText(),
                this.tfNome.getText(),
                this.tfFone.getText(),
                this.tfImail.getText());
        
        JOptionPane.showMessageDialog(null,"Socio cadastrado com sucesso","Cadastro Socio",JOptionPane.INFORMATION_MESSAGE);
      }
      catch(HeadlessException ex)
      {
        JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage(),"Cadastro Socio",JOptionPane.INFORMATION_MESSAGE);
      }
      catch (Exception ex) 
      {
        Logger.getLogger(CadSocioView.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
//=================================================================================================|
  @Override
  public void btnExcluirActionPerformed(ActionEvent e) {
    try
      {
	CadSocioControl socioControlB = new CadSocioControl();
        socioControlB.excluir(tfCodi.getText());
        
        tfCodi.setText("");
        tfNome.setText("");
        tfFone.setText("");
        tfImail.setText("");
        
	JOptionPane.showMessageDialog(null,"Cadastro excluido com sucesso","Buscar Socio",JOptionPane.INFORMATION_MESSAGE);
      }
      catch(HeadlessException ex)
      {
        JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage(),"Excluir Socio",JOptionPane.INFORMATION_MESSAGE);
      } 
      catch (Exception ex) 
      {
        JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage(),"Excluir Socio",JOptionPane.INFORMATION_MESSAGE);
      } 
  }
//=================================================================================================|
  @Override
  public void btnSairActionPerformed(ActionEvent e) {
    this.dispose();
  }
//=================================================================================================|
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    tfCodi = new javax.swing.JTextField();
    tfNome = new javax.swing.JTextField();
    tfFone = new javax.swing.JTextField();
    tfImail = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Codigo");

    jLabel2.setText("Nome");

    jLabel3.setText("Fone");

    jLabel4.setText("Imail");

    tfCodi.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusLost(java.awt.event.FocusEvent evt) {
        tfCodiFocusLost(evt);
      }
    });

    org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
          .add(jLabel1)
          .add(jLabel2)
          .add(jLabel3)
          .add(jLabel4)
          .add(tfImail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
          .add(tfFone)
          .add(tfNome)
          .add(tfCodi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(244, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .add(jLabel1)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(tfCodi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jLabel2)
        .add(4, 4, 4)
        .add(tfNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(jLabel3)
        .add(2, 2, 2)
        .add(tfFone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(jLabel4)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(tfImail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(15, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void tfCodiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodiFocusLost
    String texto = "";
    if(!tfCodi.getText().equals(texto))  
    {
	try
      {
	CadSocioControl socioControlB = new CadSocioControl();
        socioVo = socioControlB.buscar(tfCodi.getText());
        
        tfNome.setText(socioVo.getNome());
        tfFone.setText(socioVo.getFone());
        tfImail.setText(socioVo.getImail());
	JOptionPane.showMessageDialog(null,"Busca realizada com sucesso","Buscar Socio",JOptionPane.INFORMATION_MESSAGE);
      }
      catch(HeadlessException ex)
      {
        JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage(),"Buscar Socio",JOptionPane.INFORMATION_MESSAGE);
      } 
      catch (Exception ex) 
      {
        JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage(),"Buscar Socio",JOptionPane.INFORMATION_MESSAGE);
      } 
     }
  }//GEN-LAST:event_tfCodiFocusLost

    public static void main(String args[]) 
    {
      try 
      {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                                                          getInstalledLookAndFeels()) 
        {
          if ("Nimbus".equals(info.getName())) 
          {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
          }
        }
      } 
      catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
      {
            java.util.logging.Logger.getLogger(CadSocioView.class.getName()).log(java.util.
                                                      logging.Level.SEVERE, null, ex);
      }
      java.awt.EventQueue.invokeLater(() -> {
        new CadSocioView().setVisible(true);
      });
    }
//=================================================================================================|
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField tfCodi;
  private javax.swing.JTextField tfFone;
  private javax.swing.JTextField tfImail;
  private javax.swing.JTextField tfNome;
  // End of variables declaration//GEN-END:variables

  

  
}
