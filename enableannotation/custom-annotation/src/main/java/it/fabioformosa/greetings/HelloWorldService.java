package it.fabioformosa.greetings;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


@Component
public class HelloWorldService {

  @PostConstruct
  public void getHelloMessage() {
    System.out.println("Hello World");
  }

}
