package com.chichiveh.FirstSpringBoot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/chichiveh/{name}/show")
    public HelloResponse helloparam(@PathVariable String name){
        return new HelloResponse("Hello, " + name);
    }

    @GetMapping("/chichiveh")
    public HelloResponse hello(){
        return new HelloResponse("Hello , World!");
    }

    @PostMapping("/chichiveh")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello " + name + "!");
    }
}
