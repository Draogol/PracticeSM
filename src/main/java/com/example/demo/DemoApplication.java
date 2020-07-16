
package com.example.demo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DemoApplication {
	private AtomicLong counter = new AtomicLong();

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s! %d", name, counter.get());
	}

//	@Scheduled(fixedDelay = 1000)
//	public void inc() {
//		counter.incrementAndGet();
//	}
}
            