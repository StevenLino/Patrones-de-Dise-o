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

// Concrete Factory - Family 2
public class Family2TransportFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new SUV();
    }

    @Override
    public Bike createBike() {
        return new RoadBike();
    }
}