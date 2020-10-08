package Task1;

public class Main {

    public static void main(String[] args) {

	    Driver d1 = new Driver("Nicklas", 27);

	    Car c1 = new Car("Tesla", 'S', 2020, "Hatchback");

        c1.setDriver("Nicklas");

        System.out.println(c1);
        System.out.println(d1);

        Car c2 = new Car("Ford", 'X', 1776,"lowrider");
        c2.setDriver("Nicklas");

        System.out.println(c2);
        System.out.println(d1);


    }
}
