package week7;

public class MetamorphicRock extends Rock {
    MetamorphicRock(int number, double grams) {
        super(number, grams);
        rockDescription = "The original rock is subjected to heat and " +
                "pressure, causing profound physical or chemical change.";
    }
}
