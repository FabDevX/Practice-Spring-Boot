package org.umss.spring_course.Restful_web_service_example;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

  @GetMapping("hello-world/{name}/test/{otroname}")
    public  HelloWorld  helloWorld(@PathVariable String name,@PathVariable String otroname){
        return new HelloWorld(String.format("Hello World, %s, %s", name,otroname));
    }
}
