package project.demo2.Page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginPage {

    @GetMapping(path = "/index")
    public String index(){
        return "index";
    }
    @GetMapping(path = "/Login")
    public String hello(){
        return "hello";
    }
}
