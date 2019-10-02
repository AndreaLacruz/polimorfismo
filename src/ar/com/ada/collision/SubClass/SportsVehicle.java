package ar.com.ada.collision.SubClass;

import ar.com.ada.collision.SuperClass.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {
    private Integer rpm;

    public SportsVehicle(){}

    public SportsVehicle(Integer rpm){
        this.rpm = rpm;
    }

    public  SportsVehicle(String model, String brand, Integer year, Integer rpm) {
        super(model, brand, year);
        this.rpm = rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    @Override
    public String technicalSheet(){
        if (this.rpm <= 50){
            return "Vehiculo deportivo: " + this.toString() + "El auto es muy bonito, pero solo sirve para salir pasear";
        } else if (this.rpm  <= 300){
            return "Vehiculo deportivo: " + this.toString() + "Con este auto puedes desafiar a cualquiera en la pista";
        } else if (this.rpm <= 600){
            return "Vehiculo deportivo: " + this.toString() + "si tienes este auto, debe considerar participar en NASCAR";
        } else {
            return "Vehiculo deportivo: " + this.toString() + "¿Eres parte del elenco de rápidos y furiosos?";
        }
    }

    @Override
    public String toString() {
        return "vehicle: rpm " + this.rpm;
    }

    @Override
    public int hashCode() {
        return -83 * Objects.hash(this.rpm, this.model, this.brand, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        SportsVehicle that = (SportsVehicle) obj;
        return this.rpm.equals(that.rpm) && super.equals(that);
    }
}
