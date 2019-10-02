import ar.com.ada.collision.SubClass.ElectricalVehicle;
import ar.com.ada.collision.SubClass.SportsVehicle;
import ar.com.ada.collision.SubClass.Truck;
import ar.com.ada.collision.SuperClass.Vehicle;

public class App {
    public static void main(String[] args) {

        Vehicle vehiculo = new Vehicle("Blazer", "Chevrolet", 1995);
        Vehicle vehiculo2 = new Vehicle("Fusion", "Chevrolet", 2014);
        Vehicle vehiculo3 = new Vehicle("Megane", "Renault", 2007);
        Vehicle moto = new ElectricalVehicle("MUY", "Yamaha", 2000, 234);
        Vehicle moto2 = new ElectricalVehicle("ECC", "Chopper", 2019, 254);
        Vehicle moto3 = new ElectricalVehicle("HYG", "Harley", 2006, 765);
        Vehicle carro = new SportsVehicle("R43", "Mustang", 2019, 678);
        Vehicle carro2 = new SportsVehicle("TG2", "Ferrari", 1999, 233);
        Vehicle carro3 = new SportsVehicle("MNK", "Pontiac", 1980, 500);
        Vehicle camion = new Truck("EE3","MACK", 1998, 89 );
        Vehicle camion2 = new Truck("SDD", "MACK", 2000, 100);
        Vehicle camion3 = new Truck("LKM", "MACK", 2011, 300);

        Vehicle[] array = {vehiculo, vehiculo2, vehiculo3,
                moto, moto2, moto3, camion, camion2, camion3, carro, carro2, carro3};

        for (int i= 0; i < array.length; i++ ){
            System.out.println("Vehiculo: " + i + "Ficha Tecnica: " + array[i].technicalSheet());
        }
    }
}
