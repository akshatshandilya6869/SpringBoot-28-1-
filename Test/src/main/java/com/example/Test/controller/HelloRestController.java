package com.example.Test.controller;//package com.example.Test.controller;//package com.example.Test.controller;
//
//
//import org.springframework.web.bind.annotation.*;
//import com.example.Test.dto.User;
//
//@RestController
//public class HelloRestController {
//
//
//    // curl localhost:8080/hello -w "\n"
//    //uc1
//    @GetMapping(value = {"", "/", "/home"})
//    public String sayHello() {
//        return "Hello From BridgeLabz! ! !";
//
//    }
//
///*    RequestParam -@RequestParam annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.
//      return-Hello (name) from Bridgelabz
//      api- http://localhost:8080/hello/query?name=Dev
// */
//    @GetMapping("/query")
//    public String sayHello(@RequestParam String name) {
//        return "Hello " + name + " from Bridgelabz";
//    }
//
//
//    /*    RequestParam -@RequestParam annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.
//      return-Hello (name) from Bridgelabz
//      api- http://localhost:8080/params/kush
// */
//    @GetMapping("/params/{name}")
//    public String sayHelloPathVariable(@PathVariable String name) {
//        return "Hello " + name + " from Bridgelabz";
//    }
//    /*      RequestParam -@PostMapping annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.
//            return-Hello (firstName) (lastName) from Bridgelabz
//            api- http://localhost:8080/post (with custom provided firstName and lastName)
//   */
//    @PostMapping("/post")
//    public String sayHelloPost(@RequestBody User user) {
//        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from Bridgelabz";
//    }
//
//    // curl -X PUT localhost: 8080/hello/put/Lisa/?lastName=Terrisa -w "\n"
//    @PutMapping("/put/{firstName}")
//    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
//        return "Hello " + firstName + " " + lastName + "!";
//    }
//}

//import lombok.extern.slf4j.Slf4j;
//package com.example.Test.controller; // ✅ Package declaration should be at the top

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    private static final Logger logger = LoggerFactory.getLogger(HelloRestController.class); // ✅ Proper logging setup

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        logger.info("Received request: firstName={}, lastName={}", firstName, lastName);

        String message = "Hello " + firstName + " " + lastName + "!";

        logger.debug("Generated message: {}", message);
        return message;
    }
}


