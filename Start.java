/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum_9;

import javax.swing.WindowConstants;
import praktikum_9.controller.DruckenController;
import praktikum_9.controller.GraphikController;
import praktikum_9.controller.OeffnenController;
import praktikum_9.controller.SpeichernController;
import praktikum_9.model.Figuren;
import praktikum_9.view.GraphikView;
import praktikum_9.view.Oberflaeche;

/**
 * Builder Class
 * @author nobody
 */
public class Start
{
  public Start()
  {
    Oberflaeche frm = new Oberflaeche();
    frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    Figuren model = new Figuren();
    GraphikView view = new GraphikView(); 
    view.setModel(model);
    frm.getjLayeredPane1().setLayer(view, 0);
    
    
    OeffnenController openCtrl = new OeffnenController(frm, model);
    SpeichernController saveCtrl = new SpeichernController(frm, model);
    DruckenController printCtrl = new DruckenController(view, model, frm);
    openCtrl.registerEvents();
    saveCtrl.registerEvents();
    printCtrl.registerEvents();
    
    GraphikController controller = new GraphikController(view, model);
    controller.registerEvents();
    
    frm.setTitle("Zeichenprogramm");
    frm.setSize(800, 600);
    frm.setVisible(true);
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) 
  {
    new Start();
  }
}
