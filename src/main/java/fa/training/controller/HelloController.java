package fa.training.controller;

import fa.training.repository.IModunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableLoadTimeWeaving
public class HelloController {

    @Autowired
    private IModunRepository repository;

    @GetMapping("/hello")
    public String index() {
        return "hello";
    }
}
