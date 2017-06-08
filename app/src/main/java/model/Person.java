package model;

import java.io.Serializable;

public class Person implements Serializable {

    private String nameAlumn;
    private String phone;
    private Integer registryAlumn;
    private String nameParent;
    private String description_strike;
    private String date_strike;
    private String title_suspension;
    private String description_suspension;
    private Integer quantity_days_suspension;


    public Person () {

    }

    public String getNameAlumn() {
        return nameAlumn;
    }

    public void setNameAlumn(String nameAlumn) {
        this.nameAlumn = nameAlumn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRegistryAlumn() {
        return registryAlumn;
    }

    public void setRegistryAlumn(Integer registryAlumn) {
        this.registryAlumn = registryAlumn;
    }

    public String getNameParent() {
        return nameParent;
    }

    public void setNameParent(String nameParent) {
        this.nameParent = nameParent;
    }

    public String getDescription_strike() {
        return description_strike;
    }

    public void setDescription_strike(String description_strike) {
        this.description_strike = description_strike;
    }

    public String getDate_strike() {
        return date_strike;
    }

    public void setDate_strike(String date_strike) {
        this.date_strike = date_strike;
    }

    public String getTitle_suspension() {
        return title_suspension;
    }

    public void setTitle_suspension(String title_suspension) {
        this.title_suspension = title_suspension;
    }

    public String getDescription_suspension() {
        return description_suspension;
    }

    public void setDescription_suspension(String description_suspension) {
        this.description_suspension = description_suspension;
    }

    public Integer getQuantity_days_suspension() {
        return quantity_days_suspension;
    }

    public void setQuantity_days_suspension(Integer quantity_days_suspension) {
        this.quantity_days_suspension = quantity_days_suspension;
    }
}
