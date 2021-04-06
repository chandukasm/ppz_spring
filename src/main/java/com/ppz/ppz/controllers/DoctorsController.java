package com.ppz.ppz.controllers;


import com.ppz.ppz.models.Doctors;
import com.ppz.ppz.models.Drug;
import com.ppz.ppz.services.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class DoctorsController {

    @Autowired
    private DoctorsService doctorsService;

    @GetMapping("/doctors/all")
    public List<Doctors> getall() {
        return doctorsService.getAll();
    }

    @PostMapping("/doctors")
    public Doctors saveOne(@RequestBody Doctors doctors) {

        return doctorsService.addDoctor(doctors);

    }

    @GetMapping("/doctors/{email}/{password}")
    public Object getOne(@PathVariable String email, @PathVariable String password) {


        Doctors d = doctorsService.getByEmail(email, password);
        if (d != null) {
            return "Authorized";
        } else {
            return "Username Or password is worong";
        }


    }


}
