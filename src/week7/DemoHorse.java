package week7;

public class DemoHorse {

    public static void main(String[] args) {
        Horse familyHorse = new Horse("rodney", "white", 2009);
        familyHorse.display();
        RaceHorse stallion = new RaceHorse("fred", "black", 2017, 6);
        stallion.display();
    }

}
