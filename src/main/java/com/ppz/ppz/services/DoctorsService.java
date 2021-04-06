package com.ppz.ppz.services;

import com.ppz.ppz.models.Doctors;
import com.ppz.ppz.models.Drug;
import com.ppz.ppz.repositories.DoctorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorsService {
    @Autowired
    private DoctorsRepository doctorsRepository;

    public List<Doctors> getAll() {
        return doctorsRepository.findAll();
    }

    public Doctors addDoctor(Doctors doctors) {
        return doctorsRepository.save(doctors);
    }

    public Doctors getOne(int id) {
        return doctorsRepository.getOne(id);
    }

    public Doctors getByEmail(String email , String password) {
        return doctorsRepository.findByEmailAddress(email,password);


    }




}
