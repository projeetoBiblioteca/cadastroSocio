package template;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CadastroTemplate extends javax.swing.JFrame 
{

  private static final long serialVersionUID = 1L;
  public CadastroTemplate() 
  {
    initComponents();
    btnSalvar.addActionListener((ActionListener)this); 
    btnExcluir.addActionListener((ActionListener)this);
    btnSair.addActionListener((ActionListener)this);
  }
  
  
  public abstract void btnSalvarActionPerformed(ActionEvent e);
  public abstract void btnExcluirActionPerformed(ActionEvent e);
  public abstract void btnSairActionPerformed(ActionEvent e);
  
  public void actionPerformed(ActionEvent e)
  {
    switch(e.getActionCommand())
    {
      case"Salvar":
        btnSalvarActionPerformed(e);
        break;
      case"Excluir":
        btnExcluirActionPerformed(e);
        break;
      case"Sair":
        btnSairActionPerformed(e);
        break;
    }
  }
  
  

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel3 = new javax.swing.JPanel();
    btnSalvar = new javax.swing.JButton();
    btnExcluir = new javax.swing.JButton();
    btnSair = new javax.swing.JButton();
    jSeparator1 = new javax.swing.JSeparator();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    btnSalvar.setText("Salvar");

    btnExcluir.setText("Excluir");

    btnSair.setText("Sair");

    org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(btnSalvar)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(btnExcluir)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 240, Short.MAX_VALUE)
        .add(btnSair)
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap(10, Short.MAX_VALUE)
        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(1, 1, 1)
        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(btnSair)
          .add(btnExcluir)
          .add(btnSalvar))
        .add(4, 4, 4))
    );

    getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

    pack();
  }// </editor-fold>//GEN-END:initComponents

    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  protected javax.swing.JButton btnExcluir;
  protected javax.swing.JButton btnSair;
  protected javax.swing.JButton btnSalvar;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JSeparator jSeparator1;
  // End of variables declaration//GEN-END:variables
}
