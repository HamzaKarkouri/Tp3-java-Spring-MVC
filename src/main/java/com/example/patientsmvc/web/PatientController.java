package com.example.patientsmvc.web;

import com.example.patientsmvc.Entities.Patient;
import com.example.patientsmvc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
@GetMapping(path="/index")
    public String patients(Model model){
    List<Patient> patients=patientRepository.findAll();
    model.addAttribute("listPatients",patients);
return "patients";
    }

}
