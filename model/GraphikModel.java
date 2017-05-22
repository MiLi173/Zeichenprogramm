/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum_9.model;

import java.awt.Point;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nobody
 */
public class GraphikModel
{
  private ArrayList<Point> punkte;
  
  public GraphikModel()
  {
    punkte = new ArrayList<>();
  }
  
  public void addPoint(Point p)
  {
    punkte.add(p);
  }
  
  public void clearPoints()
  {
    punkte.clear();
  }

  /**
   *
   * @return
   */
  public List<Point> getPunkte()
  {
    return Collections.unmodifiableList(punkte);
  }
  
  // Punkte dauerhaft speichern
  public void speicherePunkte(String dateiname) throws FileNotFoundException, IOException
  {
    FileOutputStream fos = new FileOutputStream(dateiname);
    BufferedOutputStream buffout = new BufferedOutputStream(fos);
    ObjectOutputStream oos = new ObjectOutputStream(buffout);
    
    oos.writeObject(oos);
    // auf Festplatte schreiben
    oos.flush(); 
    oos.close();
  }
  
  @SuppressWarnings("unchecked")
  public void ladePunkte(String dateiname) throws FileNotFoundException, IOException, ClassNotFoundException
  {
    FileInputStream fis = new FileInputStream(dateiname);
    BufferedInputStream buffin = new BufferedInputStream(fis);
    ObjectInputStream ois = new ObjectInputStream(buffin);
    
    punkte = (ArrayList<Point>)ois.readObject();
    ois.close();
  }
  
}
