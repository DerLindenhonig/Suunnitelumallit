package facade;

import java.util.Arrays;

public class Memory {
    private char[] memoryArr;

    public Memory() {
        memoryArr = new char[1000000];
    }

    public void load(int position, char[] data) {
        System.out.println("\nTallentaa (lataa) data: " + Arrays.toString(data)+ " muistiin: " + position);

        for (int i = position; i < data.length; i++) {
            memoryArr[i] = data[i];
        }
    }
}
