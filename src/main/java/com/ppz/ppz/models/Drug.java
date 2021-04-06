package com.ppz.ppz.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "drug")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="ppz_system_drug",sequenceName="ppz_system_drug",  allocationSize=1)
    private int id;

    private int Quantity;

    private String drug_name;

    private String description;

//    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "drugs" ,cascade = CascadeType.ALL)
//    private List<Diagnose> prescribed = new ArrayList<>();

//    public List<Diagnose> getPrescibed() {
//        return prescribed;
//    }
//
//    public void setPrescibed(List<Diagnose> prescibed) {
//        this.prescribed = prescibed;
//    }


    public Drug(int id, int quantity, String drug_name, String description) {
        this.id = id;
        Quantity = quantity;
        this.drug_name = drug_name;
        this.description = description;

    }

    public Drug() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }



}
