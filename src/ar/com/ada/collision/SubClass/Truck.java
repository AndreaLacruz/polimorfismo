package ar.com.ada.collision.SubClass;

import ar.com.ada.collision.SuperClass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {
    private Integer maxLoad;

    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String model, String brand, Integer year, Integer maxLoad) {
        super(model, brand, year);
        this.maxLoad = maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    @Override
    public  String technicalSheet(){
        if (this.maxLoad <= 100){
            return "Camion: " + this.toString() + "Para iniciar un negocio de flete, está muy bien este auto";
        } else {
            return "Camion: " + this.toString() + "Tienes que usar este auto en el campo, es una máquina de trabajo!!";
        }
    }

    @Override
    public String toString() {
        return "vehicle: maxLoad " + this.maxLoad;
    }

    @Override
    public int hashCode() {
        return -43 * Objects.hash(this.maxLoad, this.model, this.brand, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Truck that = (Truck) obj;
        return this.maxLoad.equals(that.maxLoad) && super.equals(that);
    }
}
