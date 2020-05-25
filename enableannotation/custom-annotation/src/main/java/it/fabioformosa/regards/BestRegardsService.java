package it.fabioformosa.regards;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class BestRegardsService {

  @PostConstruct
  public void getBestRegards() {
    System.out.println("Best Regards!");
  }

}
