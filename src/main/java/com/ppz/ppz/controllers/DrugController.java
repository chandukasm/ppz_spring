package com.ppz.ppz.controllers;

import com.ppz.ppz.models.Drug;
import com.ppz.ppz.models.PrescribedDrugs;
import com.ppz.ppz.services.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import sun.tools.jconsole.JConsole;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class DrugController {

    @Autowired
    private DrugService drugService;

    @GetMapping("/drug/all")
    public List<Drug> all() {
        return drugService.getAll();
    }

    @PostMapping("/drug")
    public Drug saveOne(@RequestBody Drug drug) {
        return drugService.addDrug(drug);

    }

    @PostMapping("/drug/{id1}/{quantity2}/{id3}")
    public int editQuantityPerDiagnose(@PathVariable int id1, @PathVariable int id3, @PathVariable int quantity2) {

        return drugService.editQuantityPerDiagnose(id1, quantity2, id3);
    }


    @PostMapping("/drug/update")
    public String editQuantityPerDiagnose1(@RequestBody List<PrescribedDrugs> prescribedDrugs) {
        for (int i = 0; i <prescribedDrugs.size() ; i++) {
           PrescribedDrugs p = prescribedDrugs.get(i);
            drugService.editQuantityPerDiagnose(p.getDrug_id(), p.getPillCount(), p.getDrug_id());
        }

        return "updated successfully";

    }


}
