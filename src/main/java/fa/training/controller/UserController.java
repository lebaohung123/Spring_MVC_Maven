package fa.training.controller;

import fa.training.entity.User;
import fa.training.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableLoadTimeWeaving
@RequestMapping("/users")

public class UserController {

    @Autowired
    private IUserRepository repository;

    @GetMapping("/add")
    public String index() {
        User user = new User();
        user.setName("bao hung");
        repository.save(user);
        System.out.println(repository.findAll());
        return "hello";
    }
}
