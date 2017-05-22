/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum_9.controller;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import praktikum_9.model.Figuren;
import praktikum_9.model.GraphikModel;
import praktikum_9.view.GraphikView;

/**
 *
 * @author nobody
 */
public class GraphikController implements MouseMotionListener, MouseListener
{
  private GraphikView view;
  private Figuren model;
  private GraphikModel punkte;
  
  public GraphikController(GraphikView view, Figuren model)
  {
    this.view = view;
    this.model = model;
    punkte = new GraphikModel();
  }
  
  public void registerEvents()
  {
    view.addMouseMotionListener(this);
    view.addMouseListener(this);
  }

  @Override
  public void mouseDragged(MouseEvent e)
  {
    Point p = e.getPoint();
    view.drawPoint(p);
    punkte.addPoint(p);
  }

  @Override
  public void mouseMoved(MouseEvent e)
  {
  }

  @Override
  public void mouseClicked(MouseEvent e)
  {
  }

  @Override
  public void mousePressed(MouseEvent e)
  {
  }

  @Override
  public void mouseReleased(MouseEvent e)
  {
    if(e.getButton() == MouseEvent.BUTTON3)
    {
      view.doPrint();
    }
    if(e.getButton() == MouseEvent.BUTTON1)
    {
      model.addFigur(punkte);
      punkte.clearPoints();
    }
  }

  @Override
  public void mouseEntered(MouseEvent e)
  {
  }

  @Override
  public void mouseExited(MouseEvent e)
  {
  }
}
