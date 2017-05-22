/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum_9.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author nobody
 */
public class OhmFormatter extends SimpleFormatter
{
  private static final DateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
  
  public OhmFormatter()
  {

  }
  
  @Override
  public String format(LogRecord record)
  {
    StringBuilder builder = new StringBuilder();
    builder.append(df.format(new Date(record.getMillis()))).append(" | ");
    builder.append(record.getLevel()).append(" | ");
    builder.append(record.getSourceClassName()).append(" | ");
    builder.append(formatMessage(record)).append(" | ");
    builder.append("\n");
    return builder.toString();
  }
  
  @Override
  public String getHead(Handler h) {
    return super.getHead(h);
  }

  /**
   *
   * @param h
   * @return
   */
  @Override
  public String getTail(Handler h) {
    return super.getTail(h);
  }
}
