/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author USUARIO
 */
// Uso
public class Main {
    public static void main(String[] args) {
        TransportFactory family1Factory = new Family1TransportFactory();
        Car family1Car = family1Factory.createCar();
        Bike family1Bike = family1Factory.createBike();

        family1Car.drive();
        family1Bike.ride();

        TransportFactory family2Factory = new Family2TransportFactory();
        Car family2Car = family2Factory.createCar();
        Bike family2Bike = family2Factory.createBike();

        family2Car.drive();
        family2Bike.ride();
    }
}
