/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum_9.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.DialogTypeSelection;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import praktikum_9.model.Figuren;
import praktikum_9.model.GraphikModel;

/**
 *
 * @author nobody
 */
public class GraphikView extends JComponent implements Printable
{
  private final Rectangle2D.Float pixel;
  private final Line2D.Float line;
  private final static Dimension EINS = new Dimension(1, 1);
  private Figuren model;
  private Point before = new Point(0, 0);
  private static final Logger lg = Logger.getLogger("ohm");
  private Point start;
  
  public GraphikView()
  {
    pixel = new Rectangle2D.Float();
    line = new Line2D.Float();
  }
  
  @Override
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    for(GraphikModel m: model.getFiguren())
    {
      for(Point f: m.getPunkte())
      {
        pixel.setFrame(f, EINS);
        g2.draw(pixel);
      }
    }
  }
  
  public void drawPoint(Point p)
  {
    // Graphic holen
    Graphics2D g2  = (Graphics2D)this.getGraphics();
    pixel.setFrame(p, EINS);
    g2.draw(pixel);
    line.setLine(before, p);
    lg.info("zeichne Linie");
    g2.draw(line);
    before = p;
    
    // Graphic freigeben
    g2.dispose();
  }
  
  public void setModel(Figuren model)
  {
    this.model = model;
  }

  public void doPrint()
  {
    HashPrintRequestAttributeSet printSet = new HashPrintRequestAttributeSet();
    printSet.add(DialogTypeSelection.NATIVE);
    PrinterJob pj = PrinterJob.getPrinterJob();
    pj.setPrintable(this);
    
    //Druckdialog
    if(pj.printDialog(printSet))
    {
      try
      {
        pj.print(printSet);
      }
      catch(PrinterException e)
      {
        JOptionPane.showMessageDialog(this, e.toString());
      }
    }
  }
  
  @Override
  public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException
  {
    Graphics2D g2p = (Graphics2D) graphics;
    if(pageIndex == 1)
    {
      g2p.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
      g2p.scale(pageFormat.getImageableWidth()/pageFormat.getWidth(), 
                pageFormat.getImageableHeight()/pageFormat.getHeight());
      
      super.print(g2p);
      return Printable.PAGE_EXISTS;
    }
    else
    {
      return Printable.NO_SUCH_PAGE;
    }
  }

}
