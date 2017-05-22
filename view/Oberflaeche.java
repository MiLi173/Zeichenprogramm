/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_9.view;

/**
 *
 * @author Miri
 */
public class Oberflaeche extends javax.swing.JFrame
{
  /**
   * @return the jLayeredPane1
   */
  public javax.swing.JLayeredPane getjLayeredPane1()
  {
    return jLayeredPane1;
  }
  /**
   * @return the pmMniDrucken
   */
  public javax.swing.JMenuItem getPmMniDrucken()
  {
    return pmMniDrucken;
  }
  /**
   * @return the ccColor
   */
  public javax.swing.JColorChooser getCcColor()
  {
    return ccColor;
  }

  /**
   * @return the fcOeffnen
   */
  public javax.swing.JFileChooser getFcOeffnen()
  {
    return fcOeffnen;
  }

  /**
   * @return the fcSave
   */
  public javax.swing.JFileChooser getFcSave()
  {
    return fcSave;
  }

  /**
   * @return the pmMniOeffnen
   */
  public javax.swing.JMenuItem getPmMniOeffnen()
  {
    return pmMniOeffnen;
  }

  /**
   * @return the pmMniSpeichern
   */
  public javax.swing.JMenuItem getPmMniSpeichern()
  {
    return pmMniSpeichern;
  }
  /**
   * @return the btnDrucken
   */
  public javax.swing.JButton getBtnDrucken()
  {
    return btnDrucken;
  }

  /**
   * @return the btnOeffnen
   */
  public javax.swing.JButton getBtnOeffnen()
  {
    return btnOeffnen;
  }

  /**
   * @return the btnSpeichern
   */
  public javax.swing.JButton getBtnSpeichern()
  {
    return btnSpeichern;
  }

  /**
   * @return the mniDatei
   */
  public javax.swing.JMenu getMniDatei()
  {
    return mniDatei;
  }

  /**
   * @return the mniStart
   */
  public javax.swing.JMenu getMniStart()
  {
    return mniStart;
  }

  /**
   * @return the mnuMniDrucken
   */
  public javax.swing.JMenuItem getMnuMniDrucken()
  {
    return mnuMniDrucken;
  }

  /**
   * @return the mnuMniOeffnen
   */
  public javax.swing.JMenuItem getMnuMniOeffnen()
  {
    return mnuMniOeffnen;
  }

  /**
   * @return the mnuMniSpeichern
   */
  public javax.swing.JMenuItem getMnuMniSpeichern()
  {
    return mnuMniSpeichern;
  }

  /**
   * Creates new form Oberflaeche
   */
  public Oberflaeche()
  {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jPopupMenu1 = new javax.swing.JPopupMenu();
    pmMniOeffnen = new javax.swing.JMenuItem();
    pmMniSpeichern = new javax.swing.JMenuItem();
    pmMniDrucken = new javax.swing.JMenuItem();
    fcOeffnen = new javax.swing.JFileChooser();
    fcSave = new javax.swing.JFileChooser();
    ccColor = new javax.swing.JColorChooser();
    toolBar = new javax.swing.JToolBar();
    btnOeffnen = new javax.swing.JButton();
    btnSpeichern = new javax.swing.JButton();
    btnDrucken = new javax.swing.JButton();
    jLayeredPane1 = new javax.swing.JLayeredPane();
    jMenuBar1 = new javax.swing.JMenuBar();
    mniDatei = new javax.swing.JMenu();
    mnuMniOeffnen = new javax.swing.JMenuItem();
    mnuMniSpeichern = new javax.swing.JMenuItem();
    mnuMniDrucken = new javax.swing.JMenuItem();
    mniStart = new javax.swing.JMenu();

    pmMniOeffnen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/praktikum_9/view/icons/Open24.gif"))); // NOI18N
    pmMniOeffnen.setText("öffnen");
    jPopupMenu1.add(pmMniOeffnen);

    pmMniSpeichern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/praktikum_9/view/icons/Save24.gif"))); // NOI18N
    pmMniSpeichern.setText("speichern");
    jPopupMenu1.add(pmMniSpeichern);

    pmMniDrucken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/praktikum_9/view/icons/print.gif"))); // NOI18N
    pmMniDrucken.setText("drucken");
    jPopupMenu1.add(pmMniDrucken);

    fcOeffnen.setCurrentDirectory(fcOeffnen.getCurrentDirectory());

    fcSave.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
    fcSave.setCurrentDirectory(fcOeffnen.getCurrentDirectory());

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    toolBar.setRollover(true);

    btnOeffnen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/praktikum_9/view/icons/Open24.gif"))); // NOI18N
    btnOeffnen.setToolTipText("vorhandene Datei öffnen");
    btnOeffnen.setFocusable(false);
    btnOeffnen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnOeffnen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    toolBar.add(btnOeffnen);

    btnSpeichern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/praktikum_9/view/icons/Save24.gif"))); // NOI18N
    btnSpeichern.setToolTipText("Datei speichern");
    btnSpeichern.setFocusable(false);
    btnSpeichern.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnSpeichern.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    toolBar.add(btnSpeichern);

    btnDrucken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/praktikum_9/view/icons/print.gif"))); // NOI18N
    btnDrucken.setToolTipText("Datei speichern");
    btnDrucken.setFocusable(false);
    btnDrucken.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnDrucken.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    toolBar.add(btnDrucken);

    getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

    jLayeredPane1.setLayout(new java.awt.BorderLayout());
    getContentPane().add(jLayeredPane1, java.awt.BorderLayout.CENTER);

    mniDatei.setLabel("Datei");

    mnuMniOeffnen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
    mnuMniOeffnen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/praktikum_9/view/icons/Open24.gif"))); // NOI18N
    mnuMniOeffnen.setText("Öffnen");
    mniDatei.add(mnuMniOeffnen);

    mnuMniSpeichern.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
    mnuMniSpeichern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/praktikum_9/view/icons/Save24.gif"))); // NOI18N
    mnuMniSpeichern.setText("Speichern");
    mniDatei.add(mnuMniSpeichern);

    mnuMniDrucken.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
    mnuMniDrucken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/praktikum_9/view/icons/print.gif"))); // NOI18N
    mnuMniDrucken.setText("Drucken");
    mniDatei.add(mnuMniDrucken);

    jMenuBar1.add(mniDatei);

    mniStart.setLabel("Start");
    jMenuBar1.add(mniStart);

    setJMenuBar(jMenuBar1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(Oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(Oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(Oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(Oberflaeche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Oberflaeche().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDrucken;
  private javax.swing.JButton btnOeffnen;
  private javax.swing.JButton btnSpeichern;
  private javax.swing.JColorChooser ccColor;
  private javax.swing.JFileChooser fcOeffnen;
  private javax.swing.JFileChooser fcSave;
  private javax.swing.JLayeredPane jLayeredPane1;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JPopupMenu jPopupMenu1;
  private javax.swing.JMenu mniDatei;
  private javax.swing.JMenu mniStart;
  private javax.swing.JMenuItem mnuMniDrucken;
  private javax.swing.JMenuItem mnuMniOeffnen;
  private javax.swing.JMenuItem mnuMniSpeichern;
  private javax.swing.JMenuItem pmMniDrucken;
  private javax.swing.JMenuItem pmMniOeffnen;
  private javax.swing.JMenuItem pmMniSpeichern;
  private javax.swing.JToolBar toolBar;
  // End of variables declaration//GEN-END:variables
}
