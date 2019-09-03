package week4;

import org.junit.jupiter.api.Test;

class SandwichTest {
    @Test
    public void test1() {
        Sandwich sandwich = new Sandwich();
        sandwich.setMainIng("cheese");
        sandwich.setBreadType("rye");
        sandwich.setCost(14);
        System.out.println("the sandwich's main ingredient is " + sandwich.getMainIng() + "," + " the bread type is "
                + sandwich.getBreadType() + " and it costs $" + sandwich.getCost());
    }
}