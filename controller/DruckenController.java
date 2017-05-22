/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum_9.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import praktikum_9.model.Figuren;
import praktikum_9.view.GraphikView;
import praktikum_9.view.Oberflaeche;

/**
 *
 * @author nobody
 */
public class DruckenController implements ActionListener
{
  private GraphikView view;
  private Oberflaeche obfl;
  private Figuren model;
  
  public DruckenController(GraphikView view, Figuren model, Oberflaeche obfl)
  {
    this.view = view;
    this.model = model;
    this.obfl = obfl;
  }
  
  public void registerEvents()
  {
    obfl.getBtnDrucken().addActionListener(this);
    obfl.getMnuMniDrucken().addActionListener(this);
    obfl.getPmMniDrucken().addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    view.doPrint();
  }

}
