package com.SpringMvc.Controller;


//import com.SpringMvc.Entities.User;
import com.SpringMvc.Entities.User;
import lombok.Data;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Data
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



//    @RequestMapping(path = "/action",method = RequestMethod.POST)
//    public String handleForm(@RequestParam("email")String email,
//                             @RequestParam("name")String name,
//                             @RequestParam("password")String password,Model model)
//
//    {
//      User user=new User();
////      user.set(email);
//        user.setEmail(email);
//        user.setName(name);
//        user.setPassword(password);
//
//        System.out.println(user);
//
//        model.addAttribute("user",user);
//
//        return "Success";
//    }


    @RequestMapping(path = "/action",method = RequestMethod.POST)
    public String handelForm(@ModelAttribute User user, Model model){
    return "Success";
    }















}