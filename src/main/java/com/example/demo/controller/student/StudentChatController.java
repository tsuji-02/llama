package com.example.demo.controller.student;

import java.security.Principal;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class StudentChatController {
	@GetMapping("student/chat")
    public String get(Model model,Principal principal) {
		return "chat";

	}
}