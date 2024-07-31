package fa.training.controller;

import fa.training.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableLoadTimeWeaving
public class UserController {

    @Autowired
    private IUserRepository repository;

    @GetMapping("/cc")
    public String index() {
        return "hello";
    }
}
