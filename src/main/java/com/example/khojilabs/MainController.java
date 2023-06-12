/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.khojilabs;


import com.example.khojilabs.repository.EmployeeRepository;
import com.example.khojilabs.tables.Employee;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Valame
 */
@Controller
public class MainController {
    
    @Autowired
    private EmployeeRepository er;
    
    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
    @PostMapping("/save")
    public String greetingSubmit(@ModelAttribute Employee e) {
        er.save(e);
        return "redirect:/dashboard?save=success";
    }

     @GetMapping("/view")
    public ModelAndView add(ModelAndView m){
        m.addObject("employeeList", er.findAll());
        m.setViewName("ViewAll");
        return m;
    }
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model m){
        Optional<Employee> e = er.findById(id);
        System.out.println(e);
        m.addAttribute("employee", e.get());
        return "/Edit";
    }
    
    @PostMapping("/update")
    public String update(@ModelAttribute Employee e){
        er.save(e);
        return "redirect:/view?update=success";
    }
    
    @GetMapping(path="/delete/{id}")
    public String deleteUse(@PathVariable("id") Long id){
        er.deleteById(id);
        return "redirect:/view?delete-result=success";
    }
    @GetMapping("/")
    public String home(){
        return "redirect:/dashboard";
    }
}
