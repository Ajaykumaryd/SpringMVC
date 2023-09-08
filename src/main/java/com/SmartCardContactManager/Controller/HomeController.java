package com.SmartCardContactManager.Controller;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
//        model.addAttribute("Name","Ajay");
        return "home";
    }

//    @RequestMapping(path = "/action",method = RequestMethod.POST)
//    public String handleForm(@RequestParam("email")String email,
//                             @RequestParam("name")String name,
//                             @RequestParam("password")String password,Model model)
//
//    {
//        System.out.println("userEmail "+email);
//        System.out.println("userName "+email);
//        System.out.println("password "+password);
//
//        model.addAttribute("email",email);
//        model.addAttribute("name",name);
//        model.addAttribute("password",password);
//
//        return "Success";
//    }



    @RequestMapping(path = "/action",method = RequestMethod.POST)
    public String handleForm(@RequestParam("email")String email,
                             @RequestParam("name")String name,
                             @RequestParam("password")String password,Model model)

    {
        System.out.println("userEmail "+email);
        System.out.println("userName "+email);
        System.out.println("password "+password);

        model.addAttribute("email",email);
        model.addAttribute("name",name);
        model.addAttribute("password",password);

        return "Success";
    }















}