/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum_9.logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nobody
 */
public class OhmLogger
{
  private static Logger instance = null;
  private static final String propFile = "logger.properties";
  
  public OhmLogger()
  {

  }
  
  public static Logger getLogger()
  {
    if(instance == null)
    {
      instance = Logger.getLogger("ohm");
      initLogger();
    }
    return instance;
  }
  
  private static void initLogger()
  {
    try
    {
      instance.setUseParentHandlers(false);
      Properties props = new Properties();
      try
      {
        InputStream is = OhmLogger.class.getResourceAsStream(propFile);
        props.load(is);
      }
      catch(NullPointerException ex)
      {
        System.out.println("Problem mit Resource Stream");
      }
      
      String level = props.getProperty("LOG_LEVEL");
      String datei = props.getProperty("LOG_DATEI");
      
      //in temporäres Verzeichnis loggen
      //String datei = System.getProperty("java.io.tmpdir")+File.separator+"log.xml";
      
      FileHandler fh = new FileHandler(datei);
      ConsoleHandler ch = new ConsoleHandler();
      
      //Text Ausgabe --> eigener Formatter
      instance.addHandler(fh);
      
      ch.setFormatter(new OhmFormatter());
      fh.setFormatter(new OhmFormatter());
      
      instance.setLevel(Level.parse(level));
      instance.addHandler(ch);
      
    }
    catch(IOException ioex)
    {
      System.err.println(ioex);
    }
  }
}
