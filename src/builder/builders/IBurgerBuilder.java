package builder.builders;

public interface IBurgerBuilder {
    /* public abstract on turha kirjoittaa interfaceen */
    public abstract void createNewBurgerProduct();
    public abstract void buildSampyla();
    public abstract void buildKastike();
    public abstract void buildPihvi();
    public abstract Object getBurger();
}
