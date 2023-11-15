/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

// Producto
class Computer {
    private String cpu;
    private String ram;
    private String storage;

    // Constructor privado
    private Computer() {}

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void showComputer() {
        System.out.println("Computer with CPU: " + cpu + ", RAM: " + ram + ", Storage: " + storage);
    }

    // Builder
    static class ComputerBuilder {
        private Computer computer;

        public ComputerBuilder() {
            this.computer = new Computer();
        }

        public ComputerBuilder buildCPU(String cpu) {
            computer.setCpu(cpu);
            return this;
        }

        public ComputerBuilder buildRAM(String ram) {
            computer.setRam(ram);
            return this;
        }

        public ComputerBuilder buildStorage(String storage) {
            computer.setStorage(storage);
            return this;
        }

        public Computer getComputer() {
            return computer;
        }
    }
}




