package chainofresponsibility;

public class Toimitusjohtaja extends Handler {
    private final double MAX = 100;

    @Override
    public void processRequest(Palkankorotuspyynto request) {
        if(request.getAmount() < MAX) {
            System.out.println("Toimitusjohtaja hyväksyy " + request.getAmount() + "% palkankorotuksen.");
        } else {
            System.out.println("Toimitusjohtaja EI hyväksy " + request.getAmount() + "% palkankorotusta.");
            super.processRequest(request);
        }
    }
}
