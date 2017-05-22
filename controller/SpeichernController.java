/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum_9.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import praktikum_9.model.Figuren;
import praktikum_9.view.Oberflaeche;

/**
 *
 * @author nobody
 */
public class SpeichernController implements ActionListener
{
  private Oberflaeche view;
  private Figuren model;
  
  public SpeichernController(Oberflaeche view, Figuren model)
  {
    this.view = view;
    this.model = model;    
  }
  
  public void registerEvents()
  {
    view.getBtnSpeichern().addActionListener(this);
    view.getMnuMniSpeichern().addActionListener(this);
    view.getPmMniSpeichern().addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    JFileChooser fc = view.getFcSave();
    int wahl = fc.showSaveDialog(view);
    if (wahl == JFileChooser.APPROVE_OPTION)
    {
      File datei = fc.getSelectedFile();
      view.getFcOeffnen().setCurrentDirectory(datei);
      String dateiname = datei.getAbsolutePath();
      try {
        model.speichereFiguren(dateiname);
      }
      catch (IOException ex) {
        
      }
    }
  }
}
