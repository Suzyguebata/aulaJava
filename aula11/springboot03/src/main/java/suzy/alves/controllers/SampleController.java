package suzy.alves.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/hello")
    public ResponseEntity<String>get() {
        return ResponseEntity.ok("Hello World");
    }
}
