package chainofresponsibility;

public abstract class Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void processRequest(Palkankorotuspyynto request) {
        if (successor != null) {
            successor.processRequest(request);
        }
    }
}