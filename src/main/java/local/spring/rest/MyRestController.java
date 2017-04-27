package local.spring.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/hey")
  public MyRestResponse hey(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new MyRestResponse(counter.incrementAndGet(),
        String.format(template, name));
  }
}
