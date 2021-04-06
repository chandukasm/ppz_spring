package com.ppz.ppz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "patient")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Patient {
    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="ppz_system_patient")
    @SequenceGenerator(name="ppz_system_patient",sequenceName="ppz_system_patient",  allocationSize=1)
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;

    @OneToMany(targetEntity = Diagnose.class , cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id" , referencedColumnName = "id")
    private List<Diagnose> diagnoseList;

    public List<Diagnose> getDiagnoseList() {
        return diagnoseList;
    }

    public void setDiagnoseList(List<Diagnose> diagnoseList) {
        this.diagnoseList = diagnoseList;
    }

    @CreationTimestamp
    private LocalDateTime created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
