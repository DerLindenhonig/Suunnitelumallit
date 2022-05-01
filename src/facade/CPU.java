package facade;

public class CPU {
    public void freeze() {
        System.out.println("CPU odottaa");
    }

    public void jump(long position) {
        System.out.println("CPU 'hyppyy' muistinosoiteseen " + position);
    }

    public void execute() {
        System.out.println("Suorittaa CPU");
    }
}
