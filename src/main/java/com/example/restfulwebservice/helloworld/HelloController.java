package com.example.restfulwebservice.helloworld;

import com.example.restfulwebservice.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //GET
    // /hello-world -> End-point
    // @RequestMapping(method=RequestMethod.GET, path= "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
    //alt + enter
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        // %s -> 가변데이터가 올 수 있다.. %s안에 name이라는 값이 들어감
        //ex -> name : 우병걸이면 hello world, 우병걸
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
