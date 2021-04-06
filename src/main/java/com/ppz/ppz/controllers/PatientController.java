package com.ppz.ppz.controllers;


import com.ppz.ppz.models.Patient;
import com.ppz.ppz.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("patient/all")
    public List<Patient> all(){
        return patientService.getAll();
    }

    @PostMapping("/patient")
    public Patient saveOne(@RequestBody  Patient x){

        return patientService.newPatient(x);
    }


}
