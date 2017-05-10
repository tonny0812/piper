/* 
 * Copyright (C) Creactiviti LLC - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Arik Cohen <arik@creactiviti.com>, Apr 2017
 */
package com.creactiviti.piper.core.task;

import org.junit.Assert;
import org.junit.Test;

import com.creactiviti.piper.core.job.SimpleTaskExecution;
import com.creactiviti.piper.core.messenger.Queues;

public class WorkTaskExecutorTests {

  @Test
  public void test1 () {
    WorkTaskDispatcher executor = new WorkTaskDispatcher((k,m)->Assert.assertEquals(Queues.TASKS, k));
    executor.dispatch(SimpleTaskExecution.create());
  }
  
  @Test
  public void test2 () {
    SimpleTaskExecution task = SimpleTaskExecution.create();
    task.setNode("encoder");
    WorkTaskDispatcher executor = new WorkTaskDispatcher((k,m)->Assert.assertEquals("encoder", k));
    executor.dispatch(task);
  }
  
  @Test
  public void test3 () {
    SimpleTaskExecution task = SimpleTaskExecution.create();
    task.setNode("encoder.xlarge");
    WorkTaskDispatcher executor = new WorkTaskDispatcher((k,m)->Assert.assertEquals("encoder.xlarge", k));
    executor.dispatch(task);
  }
  
}
