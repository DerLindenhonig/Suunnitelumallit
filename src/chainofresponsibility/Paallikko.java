package chainofresponsibility;

public class Paallikko extends Handler {
    private final double MAX = 5;

    @Override
    public void processRequest(Palkankorotuspyynto request) {
        if(request.getAmount() < MAX) {
            System.out.println("Päällikkö hyväksyy " + request.getAmount() + "% palkankorotuksen.");
        } else {
            System.out.println("Päällikkö EI hyväksy " + request.getAmount() + "% palkankorotusta.");
            super.processRequest(request);
        }
    }
}
