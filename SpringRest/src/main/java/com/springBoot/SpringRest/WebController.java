/**
 * 
 */
package com.springBoot.SpringRest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tcgdev
 *
 */
@RestController
public class WebController {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
	/*@RequestMapping("/")
    public String index() {
        return "Congratulations you set your first service";
    } */
	
	    @RequestMapping("/greeting")
	    public Greetings greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greetings(counter.incrementAndGet(),
	                            String.format(template, name));
	    }
}
