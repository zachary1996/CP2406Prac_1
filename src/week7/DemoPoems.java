package week7;

public class DemoPoems {
    public static void main(String[] args) {
        Couplet couplet = new Couplet("by the sea");
        Limerick limerick = new Limerick("lollies");
        Haiku haiku = new Haiku("in the garden");
        display(couplet.getName(), couplet.getNumOfLines());
        display(limerick.getName(), limerick.getNumOfLines());
        display(haiku.getName(), haiku.getNumOfLines());

    }

    private static void display(String title, int num) {
        System.out.println("the title is: " + title);
        System.out.println("there are " + num + " lines");
    }
}
