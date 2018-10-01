package org.canton.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaServer
public class NetflixApplication {
  @RequestMapping("/")
  public String home(){
    return "HelloWorld";
  }

  public static void main(String[] args) {
    SpringApplication.run(NetflixApplication.class, args);
  }
}
