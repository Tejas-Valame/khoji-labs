/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.khojilabs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Valame
 */
@Controller
public class MainController {
    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
    
@GetMapping
public String home(){
    return "index";
}
}
