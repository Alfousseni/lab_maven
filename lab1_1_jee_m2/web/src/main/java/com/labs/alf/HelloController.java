package com.labs.alf;

import com.labs.alf.services.HelloImpl;
import com.labs.alf.services.IHello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private IHello helloService = new HelloImpl();
    @GetMapping
    public String sayHello() {
        return helloService.sayHello();
    }
}
