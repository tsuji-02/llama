package com.example.demo.controller.teacher;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class TeacherStudentsManagerController {
	@GetMapping("teacher/students_manager")
    public String get(Model model,Principal principal) {
		return "teacher/students_manager";
	}
}
