package com.creactiviti.piper.core.job;

import java.util.List;

import com.creactiviti.piper.core.MapObject;

public class WebhookInput extends MapObject implements Webhook  {
  
  public WebhookInput (MapObject aConfiguration) {
    super(aConfiguration);
  }
  
  @Override
  public List<Delivery> getDeliveries() {
    return List.of();
  }

}
