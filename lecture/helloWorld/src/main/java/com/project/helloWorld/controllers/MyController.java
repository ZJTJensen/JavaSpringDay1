package main.java.com.project.helloWorld.controllers;
import org.springframework.stereoype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCrontroller{


    @RequestMapping("/")
    public String index(){
        return "index";
    }
}