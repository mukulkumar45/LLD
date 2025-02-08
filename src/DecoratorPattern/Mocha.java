package DecoratorPattern;

public class Mocha implements Coffee{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Mocha ";
    }
}
