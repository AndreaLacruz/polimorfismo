package ar.com.ada.collision.SubClass;

import ar.com.ada.collision.SuperClass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency;

    public ElectricalVehicle(){}

    public ElectricalVehicle(Integer potency){
        this.potency = potency;
    }

    public  ElectricalVehicle(String model, String brand, Integer year, Integer potency){
        super(model, brand, year);
        this.potency = potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    @Override
    public String technicalSheet(){
        if (this.year < 2007) {
            return "No existe modelo para este año";
        } else {
            return "Vehiculo electrico: " + this.toString() + "“Es un auto de última tecnología!";
        }
    }

    @Override
    public String toString() {
        return "vehicle: potency " + this.potency;
    }

    @Override
    public int hashCode() {
        return -43 * Objects.hash(this.potency, this.model, this.brand, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ElectricalVehicle that = (ElectricalVehicle) obj;
        return this.potency.equals(that.potency) && super.equals(that);
    }
}
