package com.ppz.ppz.models;

import javax.persistence.Entity;

//@Entity
public class PrescribedDrugs {
    private int position;
    private String drug_name;
    private int drug_id;
    private String dose;
    private int days;
    private int no_of_pills;
    private int pillCount;//no_of_pills*pillsPerDose*days
    private int doseInInt;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public int getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(int drug_id) {
        this.drug_id = drug_id;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getNo_of_pills() {
        return no_of_pills;
    }

    public void setNo_of_pills(int no_of_pills) {
        this.no_of_pills = no_of_pills;
    }

    public int getPillCount() {
        return pillCount;
    }

    public void setPillCount(int pillCount) {
        this.pillCount = pillCount;
    }

    public int getDoseInInt() {
        return doseInInt;
    }

    public void setDoseInInt(int doseInInt) {
        this.doseInInt = doseInInt;
    }
}
