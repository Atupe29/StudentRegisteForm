package com.jdc04.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdc04.Entity.Hospital;
import com.jdc04.Service.HospitalService;

@Controller
public class HospitalController {
	@Autowired
	private HospitalService hospitalService;

	@GetMapping("/")
	public String register(Model model) {
		Hospital hospital = new Hospital();
		model.addAttribute(hospital);
		return "register";
	}

	@PostMapping("/registerPatient")
	public String registerPatient(@ModelAttribute("hospital") Hospital hospital) {
		System.out.println(hospital);
		hospitalService.registerPatient(hospital);
		return "registerPatient";
	}
}
