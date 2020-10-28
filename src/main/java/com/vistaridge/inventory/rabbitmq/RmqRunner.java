package com.vistaridge.inventory.rabbitmq;

import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RmqRunner implements CommandLineRunner {

	
	  private final RabbitTemplate rabbitTemplate;
	  private final Receiver receiver;

	  public RmqRunner(Receiver receiver, RabbitTemplate rabbitTemplate) {
	    this.receiver = receiver;
	    this.rabbitTemplate = rabbitTemplate;
	  }

	  @Override
	  public void run(String... args) throws Exception {
	    System.out.println("Sending message...");
	    rabbitTemplate.convertAndSend(RabbitMqConfig.topicExchangeName, "foo.bar.baz", "Hello from RabbitMQ!");
	    receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
	  }
	  
	  
}
