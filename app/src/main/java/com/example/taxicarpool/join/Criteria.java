package com.example.taxicarpool.join;

import android.widget.CheckBox;

import com.example.taxicarpool.R;

public class Criteria {


    public boolean suv, sedan, truck, van, gender, pets;

    public Criteria(boolean suv, boolean sedan, boolean truck, boolean van, boolean gender, boolean pets) {
        this.suv = suv;
        this.sedan = sedan;
        this.truck = truck;
        this.van = van;
        this.gender = gender;
        this.pets = pets;
    }

    public void setSuv(boolean suv) {
        this.suv = suv;
    }

    public void setSedan(boolean sedan) {
        this.sedan = sedan;
    }

    public void setTruck(boolean truck) {
        this.truck = truck;
    }

    public void setVan(boolean van) {
        this.van = van;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setPets(boolean pets) {
        this.pets = pets;
    }

    public boolean isSuv() {
        return suv;
    }

    public boolean isSedan() {
        return sedan;
    }

    public boolean isTruck() {
        return truck;
    }

    public boolean isVan() {
        return van;
    }

    public boolean isGender() {
        return gender;
    }

    public boolean isPets() {
        return pets;
    }
    public String toString() {
        return "Criteria{" +
                "suv=" + suv +
                ", sedan='" + sedan + '\'' +
                ", truck=" + truck +
                ", van=" + van +
                ", gender" + gender +
                ", pets" + pets +
                '}';
    }
}
