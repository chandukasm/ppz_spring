package com.ppz.ppz.services;


import com.ppz.ppz.models.Patient;
import com.ppz.ppz.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAll(){
        return patientRepository.findAll();
    }

    public Patient newPatient(Patient patient){
        return patientRepository.save(patient);
    }



}
