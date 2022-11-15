package hu.nye.iot.error404;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController ("/api/status")
public class ErrorController {
    

    private String message;

    @PostMapping
    public void post(String message) {
        this.message = message;
    }

    @GetMapping
    public String get() {
        return this.message;
    }
}
