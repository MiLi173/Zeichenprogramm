/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum_9.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.JFileChooser;
import praktikum_9.model.Figuren;
import praktikum_9.view.Oberflaeche;

/**
 *
 * @author nobody
 */
public class OeffnenController implements ActionListener
{
  private Oberflaeche view;
  private Figuren model;
  
  public OeffnenController(Oberflaeche view, Figuren model)
  {
    this.view = view;
    this.model = model;
  }
  
  public void registerEvents()
  {
    view.getBtnOeffnen().addActionListener(this);
    view.getMnuMniOeffnen().addActionListener(this);
    view.getPmMniOeffnen().addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    JFileChooser fc = view.getFcOeffnen();
    Preferences pref = Preferences.userRoot().node("LAST_USED_FOLDER");
    int wahl = fc.showOpenDialog(view);
    if (wahl == JFileChooser.APPROVE_OPTION)
    {
      File datei = fc.getSelectedFile();
      view.getFcOeffnen().setCurrentDirectory(datei);
      String dateiname = datei.getAbsolutePath();
      pref.put("LAST_USED_FOLDER", dateiname);
      try {
        model.ladeFiguren(dateiname);
      }
      catch (FileNotFoundException ex) {
      }
      catch (IOException | ClassNotFoundException ex)
      {
        Logger.getLogger(OeffnenController.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

}
