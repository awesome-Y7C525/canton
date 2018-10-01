package org.canton.discovery.test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hzldex on 2018/10/1.
 */
@SpringBootApplication
@RestController
public class DiscoveryTestClientApplication {
  @RequestMapping("/")
  public String home() {
    return "Hello world";
  }

  public static void main(String[] args) {
    new SpringApplicationBuilder(DiscoveryTestClientApplication.class).web(WebApplicationType.SERVLET).run(args);
  }
}
