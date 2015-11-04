/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassemble;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Max
 */
public class MainFrame extends javax.swing.JFrame {

  
  private File currentFile;
  /**
   * Creates new form MainFrame
   */
  public MainFrame() {
    initComponents();
    
  }
  
  private void openNewFile() {
    if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
      this.currentFile = fileChooser.getSelectedFile();
    }
    try {
      this.assemblyTextArea.setText(Util.readFile(currentFile.getPath(), StandardCharsets.UTF_8));
      this.saveAssemblyAsMenuItem.setEnabled(true);
      this.saveAssemblyMenuItem.setEnabled(true);
    } catch (IOException ex) {
      Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  private void saveFile(){
    if(this.currentFile == null) return;
    try {
      Util.saveFile(currentFile.getPath(), assemblyTextArea.getText());
    } catch (IOException ex) {
      Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    AboutPopup = new javax.swing.JDialog();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    fileChooser = new javax.swing.JFileChooser();
    jScrollPane1 = new javax.swing.JScrollPane();
    assemblyTextArea = new javax.swing.JTextArea();
    jLabel3 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    machineCode = new javax.swing.JTextArea();
    jLabel4 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    openFileMenuItem = new javax.swing.JMenuItem();
    saveAssemblyMenuItem = new javax.swing.JMenuItem();
    saveAssemblyAsMenuItem = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();

    AboutPopup.setTitle("About JAssemble");
    AboutPopup.setMaximumSize(new java.awt.Dimension(300, 150));
    AboutPopup.setMinimumSize(new java.awt.Dimension(300, 150));
    AboutPopup.setModal(true);
    AboutPopup.setPreferredSize(new java.awt.Dimension(300, 150));
    AboutPopup.setResizable(false);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("JAssemble");

    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("©2015 Maxton Connor");

    javax.swing.GroupLayout AboutPopupLayout = new javax.swing.GroupLayout(AboutPopup.getContentPane());
    AboutPopup.getContentPane().setLayout(AboutPopupLayout);
    AboutPopupLayout.setHorizontalGroup(
      AboutPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
      .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    AboutPopupLayout.setVerticalGroup(
      AboutPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(AboutPopupLayout.createSequentialGroup()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel2)
        .addGap(0, 87, Short.MAX_VALUE))
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("JAssemble");

    assemblyTextArea.setColumns(20);
    assemblyTextArea.setRows(5);
    jScrollPane1.setViewportView(assemblyTextArea);

    jLabel3.setText("Assembly Code:");

    machineCode.setColumns(20);
    machineCode.setLineWrap(true);
    machineCode.setRows(5);
    jScrollPane2.setViewportView(machineCode);

    jLabel4.setText("Machine Code:");

    jButton1.setText("Assemble!");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jMenu1.setText("File");

    openFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
    openFileMenuItem.setText("Open...");
    openFileMenuItem.setName("openFileMenuItem"); // NOI18N
    openFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        openFileMenuItemActionPerformed(evt);
      }
    });
    jMenu1.add(openFileMenuItem);

    saveAssemblyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
    saveAssemblyMenuItem.setText("Save assembly");
    saveAssemblyMenuItem.setEnabled(false);
    saveAssemblyMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        saveAssemblyMenuItemActionPerformed(evt);
      }
    });
    jMenu1.add(saveAssemblyMenuItem);

    saveAssemblyAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
    saveAssemblyAsMenuItem.setText("Save assembly as...");
    saveAssemblyAsMenuItem.setEnabled(false);
    saveAssemblyAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        saveAssemblyAsMenuItemActionPerformed(evt);
      }
    });
    jMenu1.add(saveAssemblyAsMenuItem);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("About");
    jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu2MouseClicked(evt);
      }
    });
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jLabel4)
              .addComponent(jButton1))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton1)
        .addGap(11, 11, 11)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    this.AboutPopup.setVisible(true);
  }//GEN-LAST:event_jMenu2MouseClicked

  private void openFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileMenuItemActionPerformed
    this.openNewFile();
  }//GEN-LAST:event_openFileMenuItemActionPerformed

  private void saveAssemblyAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAssemblyAsMenuItemActionPerformed
    if(fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
      this.currentFile = fileChooser.getSelectedFile();
      this.saveFile();
    }
  }//GEN-LAST:event_saveAssemblyAsMenuItemActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Assembler as = new Assembler(assemblyTextArea.getText());
    try {
      int[] assembledWords = as.assemble();
      int i = 0;
      machineCode.setText("memory_initialization_radix=16;\nmemory_initialization_vector=");
      for(int word : assembledWords) {
        machineCode.append(String.format("%1$04x", (short)word));
        if(++i < assembledWords.length){
          machineCode.append(",");
        } else {
          machineCode.append(";\n");
        }
      }
    } catch (InvalidInstructionException ex) {
      Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  private void saveAssemblyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAssemblyMenuItemActionPerformed
    this.saveFile();
  }//GEN-LAST:event_saveAssemblyMenuItemActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainFrame().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JDialog AboutPopup;
  private javax.swing.JTextArea assemblyTextArea;
  private javax.swing.JFileChooser fileChooser;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTextArea machineCode;
  private javax.swing.JMenuItem openFileMenuItem;
  private javax.swing.JMenuItem saveAssemblyAsMenuItem;
  private javax.swing.JMenuItem saveAssemblyMenuItem;
  // End of variables declaration//GEN-END:variables
}
