package DecoratorPattern;

public abstract class Wrapper implements Coffee{
    protected Coffee coffee;

    public Wrapper(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

}