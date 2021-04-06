package com.ppz.ppz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "diagnose")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Diagnose {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="ppz_system_diagnose")
    @SequenceGenerator(name="ppz_system_diagnose",sequenceName="ppz_system_diagnose",  allocationSize=1)
    private int id;

    @CreationTimestamp
    private LocalDateTime created;
    private int billid;
    private String diagnose;
    private int patient_id;
    private ArrayList<Integer> drugIds;


    public ArrayList<Integer> getDrugIds() {
        return drugIds;
    }

    public void setDrugIds(ArrayList<Integer> drugIds) {
        this.drugIds = drugIds;
    }

    public List<Drug> getDrugs() {

        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {

        this.drugs = drugs;
    }

    public Diagnose() {
    }

    public Diagnose(int billid, String diagnose, int patient_id, ArrayList<Integer> drugIds, List<Drug> drugs) {
        this.billid = billid;
        this.diagnose = diagnose;
        this.patient_id = patient_id;
        this.drugIds = drugIds;
        this.drugs = drugs;
    }

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "diagnose_drugs",
            joinColumns = @JoinColumn(name = "diagnose_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "drug_id", referencedColumnName = "id"))
    private List<Drug> drugs =  new ArrayList<>();

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public int getBillid() {
        return billid;
    }

    public void setBillid(int billid) {
        this.billid = billid;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public void addDrug(Drug d){
        this.getDrugs().add(d);
    }


}


