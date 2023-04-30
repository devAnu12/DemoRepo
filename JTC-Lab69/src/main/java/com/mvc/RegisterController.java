package com.mvc;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	@Autowired
	private StudentValidator studentValidator;
	{
		System.out.println("ib in RegisterController");
	}

	@RequestMapping(value = "/showRegister.jtc")
	public String showRegisterForm(Model model) throws ServletException {
		System.out.println("showRegisterForm");
		Student stu = new Student();
		stu.setSid("JTC-99");
		model.addAttribute("student", stu);
		return "register";
	}

	@PostMapping(value = "/registerStudent.jtc")
	public String registerStudent(@ModelAttribute("student") Student stu, BindingResult result)
			throws ServletException {
		System.out.println("registerStudent");
		studentValidator.validate(stu, result);
		if (result.hasErrors()) {
			System.out.println(result.getErrorCount());
			return "register";
		}
		System.out.println(stu.getSid());
		System.out.println(stu.getSname());
		System.out.println(stu.getEmail());
		System.out.println(stu.getPhone());
		System.out.println(stu.getGender());
		System.out.println(stu.getQualification());
		String tim[] = stu.getTimings();
		for (int i = 0; i < tim.length; i++) {
			System.out.println(tim[i]);
		}
		System.out.println(stu.getRemarks());
		return "home";
	}
}
