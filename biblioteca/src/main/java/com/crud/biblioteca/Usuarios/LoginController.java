package com.crud.biblioteca.Usuarios;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {

    private final UsersService usersService;

    public LoginController(UsersService usersService){
        this.usersService = usersService;
    }

    @GetMapping("/login")
    public String login(){
        return  "login";
    }

    @GetMapping("/novo")
    public String carregarRegister(Model model){
        model.addAttribute("user", new Usuarios());
        return "register";
    }


    @PostMapping("/register")
    public String register(@ModelAttribute("user") Usuarios user, Model model){
        usersService.saveUsers(user.getName(), user.getPassword());
        model.addAttribute("sucesso", "Usuário cadastrado com sucesso!");
        return "login";
    }

}
