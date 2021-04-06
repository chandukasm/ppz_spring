package com.ppz.ppz.services;

import com.ppz.ppz.models.Drug;
import com.ppz.ppz.repositories.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DrugService {
    @Autowired
    private DrugRepository drugRepository;


    public List<Drug> getAll() {
        return drugRepository.findAll();
    }

    public Drug addDrug(Drug drug) {
        return drugRepository.save(drug);
    }

    public Drug getOne(int id) {
        return drugRepository.getOne(id);
    }

    public int editQuantityPerDiagnose(int id1, int quantity2, int id3) {
        int quantity = drugRepository.editQuantityPerDiagnose(id1, quantity2, id3);
        System.out.println(quantity);
        return quantity;
    }
}


