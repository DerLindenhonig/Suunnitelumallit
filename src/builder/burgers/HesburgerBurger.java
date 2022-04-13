package builder.burgers;

public class HesburgerBurger {
    StringBuilder sb = new StringBuilder();

    public void setSampyla(String sampyla) {
        sb.append(sampyla + "\n");
    }

    public void setKastike(String kastike) {
        sb.append(kastike + "\n");
    }

    public void setPihvi(String pihvi) {
        sb.append(pihvi + "\n");
    }

    public String toString() {
        return sb.toString();
    }
}
