package com.ppz.ppz.services;

import com.ppz.ppz.models.Diagnose;
import com.ppz.ppz.repositories.DiagnoseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DiagnoseService {
    @Autowired
    private DiagnoseRepository diagnoseRepository;

    public List<Diagnose> getAll(){
        return diagnoseRepository.findAll();
    }

    public Diagnose newDiagnose(  Diagnose diagnose){

        return diagnoseRepository.save(diagnose);
    }

    public Diagnose getOne(int id){
        return diagnoseRepository.getOne(id);
    }
}
