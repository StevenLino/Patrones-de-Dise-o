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
// Concrete Factory - Family 1
public class Family1TransportFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public Bike createBike() {
        return new MountainBike();
    }
}
