package com.cydeo.lab04springmvc.controller;

import com.cydeo.lab04springmvc.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {



    @RequestMapping("/profile")
    public String profileInfo(Model model){

        Profile profile = new Profile();
        profile.setEmail("anittaksa3440@gmail.com");
        profile.setPhoneNumber("7867349058");
        profile.setName("Anna");
        profile.setSurname("Pierre-Louis");
        profile.setUserName("Anita_Taksa");
        profile.setCreatedDate(LocalDateTime.now());

        model.addAttribute("profile", profile);

        return "profile/profile-info";
    }
}
