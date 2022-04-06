package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] arguments) {
        List<Image> photos = new ArrayList();

        Image img1 = new ProxyImage("Photo1");
        Image img2 = new ProxyImage("Photo2");
        Image img3 = new ProxyImage("Photo3");

        photos.add(img1);
        photos.add(img2);
        photos.add(img3);

        System.out.println("\nTulosta tiedot valokuvakansion sisällöstä:");

        for(Image i : photos) {
            i.showData();
        }

        System.out.println("\nLataa ja näyttää kuvia:");

        for(Image i : photos) {
            i.displayImage();
        }
    }
}
