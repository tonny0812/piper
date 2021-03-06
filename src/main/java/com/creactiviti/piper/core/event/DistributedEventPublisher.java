/*
 * Copyright 2016-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.creactiviti.piper.core.event;

import java.util.Objects;

import com.creactiviti.piper.core.messagebroker.MessageBroker;
import com.creactiviti.piper.core.messagebroker.Queues;

/**
 * @author Arik Cohen
 * @since Jun 4, 2017
 */
public class DistributedEventPublisher implements EventPublisher {

  private final MessageBroker messageBroker;
  
  public DistributedEventPublisher (MessageBroker aMessageBroker) {
    messageBroker = Objects.requireNonNull(aMessageBroker);
  }
  
  @Override
  public void publishEvent(PiperEvent aEvent) {
    messageBroker.send(Queues.EVENTS, aEvent);
  }

}
