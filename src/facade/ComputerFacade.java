package facade;

/**
 * A boot sector - sector of data storage device (hard disk, floppy disk, optical disc, etc.)
 * which contains machine code to be loaded into random-access memory (RAM)
 * and then executed by a computer system's built-in firmware (e.g., the BIOS).
 * */

public class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    int kBootAddress;
    int kBootSector;
    int kSectorSize;

    public ComputerFacade() {
        this.kBootAddress = 8000;
        this.kBootSector = 0;
        this.kSectorSize = 512;
    }

    public void start() {
        cpu.freeze();
        memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
        cpu.jump(kBootAddress);
        cpu.execute();
    }
}
