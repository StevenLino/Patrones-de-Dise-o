/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author USUARIO
 */

//Uso
public class Main {
    public static void main(String[] args) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        Computer computer = builder.buildCPU("Intel i7").buildRAM("16GB").buildStorage("512GB SSD").getComputer();

        computer.showComputer();
    }
}
