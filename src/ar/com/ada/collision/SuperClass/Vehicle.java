package ar.com.ada.collision.SuperClass;

import java.util.Objects;

public class Vehicle {

    protected String model;
    protected String brand;
    protected Integer year;

    public Vehicle() {
    }

    public Vehicle(String model, String brand, Integer year){
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public String technicalSheet(){
       return"La ficha técnica de este vehiculo: " + this.toString() + "[ Este vehiculo no tiene categoria asignada ]";
    }

    @Override
    public String toString(){
        return "vehicle: modelo " + this.model + " marca " + this.brand + " año " + this.year;
    }

    @Override
    public int hashCode(){
        return -43 * Objects.hash(this.model, this.brand, this.year);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Vehicle that = (Vehicle) obj;
        return this.model.equals(that.model) && this.brand.equals(that.brand);
    }

}
