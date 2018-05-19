package home.blackharold.sweater.controller;

import home.blackharold.sweater.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class RegistrationController {
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/registration")
    public String registration(){
    
    }
}
