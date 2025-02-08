package DecoratorPattern;

public class whipCream extends Wrapper{

    Coffee coffee = new Mocha();

    public whipCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "WhipCream Added ";
    }
}