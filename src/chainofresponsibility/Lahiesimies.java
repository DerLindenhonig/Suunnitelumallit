package chainofresponsibility;

public class Lahiesimies extends Handler {
    private final double MAX = 2;

    @Override
    public void processRequest(Palkankorotuspyynto request) {
        if(request.getAmount() < MAX) {
            System.out.println("Lähiesimies hyväksyy " + request.getAmount() + "% palkankorotuksen.");
        } else {
            System.out.println("Lähiesimies EI hyväksy " + request.getAmount() + "% palkankorotusta.");
            super.processRequest(request);
        }
    }
}
