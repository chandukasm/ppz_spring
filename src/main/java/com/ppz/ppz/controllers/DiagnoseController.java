package com.ppz.ppz.controllers;


import com.ppz.ppz.models.Diagnose;
import com.ppz.ppz.models.Drug;
import com.ppz.ppz.repositories.DiagnoseRepository;
import com.ppz.ppz.services.DiagnoseService;
import com.ppz.ppz.services.DrugService;
//import com.sun.codemodel.internal.JForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class DiagnoseController {


    @Autowired
    private DiagnoseService diagnoseService;

    @Autowired
    private DrugService drugService;


//    private List<Drug> drugList =drugService.getAll();

    @GetMapping("/diagnose/all")
    public List<Diagnose> getAll() {
        return diagnoseService.getAll();
    }

    @GetMapping("/diagnose/{id}")
    public ArrayList<String> getDiagnose(@PathVariable int id) {
        Diagnose d = diagnoseService.getOne(id);
        List<Drug> drugs = d.getDrugs();
        ArrayList drugNames = new ArrayList();
        for (int i = 0; i < drugs.size(); i++) {
            System.out.println(drugs.get(i).getDrug_name());
            drugNames.add(drugs.get(i).getDrug_name());
        }
        return drugNames;
    }


    @PostMapping("/diagnose")
    public Diagnose saveOne(@RequestBody Diagnose diagnose) {
        List<Integer> drugIds = diagnose.getDrugIds();

        for (int i = 0; i < drugIds.size(); i++) {
            Drug d = drugService.getOne(drugIds.get(i));
            diagnose.addDrug(d);
        }




        return diagnoseService.newDiagnose(diagnose);
    }

}


//    @GetMapping("/diagnose/all")
//    public List<Diagnose> getAll() {
//        return diagnoseService.getAll();
//    }
//
//    @GetMapping ("/diagnose/{id}")
//    public Diagnose getDiagnose(@PathVariable int id) {
//        Diagnose d =  diagnoseService.getOne(id);
//        List<Drug> drugs = d.getDrugs();
//        for(int i=0;i<drugs.size();i++){
//            System.out.println(drugs.get(i).getDrug_name());
//        }
//        return diagnoseService.getOne(id);
//    }
