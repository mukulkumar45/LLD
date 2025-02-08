package DecoratorPattern;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new Mocha();
        coffee = new whipCream(coffee);
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        coffee = new chocoChips(coffee);
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        Coffee coffee1 = new Cappuccino();
        coffee1 = new chocoChips(coffee1);
        System.out.println(coffee1.getCost());
        System.out.println(coffee1.getDescription());

        System.out.println("Design Complete");

    }
}
