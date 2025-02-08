package DecoratorPattern;

public class Cappuccino implements Coffee{
    @Override
    public int getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Cappuccino ";
    }
}