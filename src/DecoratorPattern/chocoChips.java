package DecoratorPattern;

public class chocoChips extends Wrapper{

    public chocoChips(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Choco Chip Added";
    }
}