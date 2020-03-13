package com.creactiviti.piper.core.job;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.creactiviti.piper.core.Accessor;

/**
 * @author Arik Cohen
 * @since Mar, 13 2020
 */
public interface Webhook extends Accessor {

  List<Delivery> getDeliveries ();
  
  public static interface Delivery {
    
    Date getCreateTime ();
    
    Map<?,?> getPayload();
    
    int getStatusCode ();
    
  }
  
}
