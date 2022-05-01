package facade;

/**
 * Example of how a client ("you")
 * interacts with a facade ("computer")
 * to a complex system (internal computer parts, like CPU and HardDrive).
 * */

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
