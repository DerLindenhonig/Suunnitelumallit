package facade;

public class HardDrive {
    private char[] hdArr;

    public HardDrive() {
        //this.hdArr = new char[1974672];
        this.hdArr = new char[197];

        for (int i = 0; i < hdArr.length-1; i++) {
            char c = (char) i;
            hdArr[i] = c;
        }
    }

    public char[] read(int lba, int size) {
        System.out.println("Lue dataa kovalevyltä. Lba: " + lba + ". Size: " + size);

        for(long i = lba; i < hdArr.length-1; i++) {
            System.out.print(hdArr[Math.toIntExact(i)] + " ");
        }

        return hdArr;
    }
}
