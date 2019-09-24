package week7;

public class DemoRocks {

    public static void main(String[] args) {
        IgneousRock sample1 = new IgneousRock(1, 23);
        SedimentaryRock sample2 = new SedimentaryRock(2, 120);
        MetamorphicRock sample3 = new MetamorphicRock(3, 300);
        System.out.println("sample number " + sample1.getSampleNum());
        System.out.println("the weight is " + sample1.getWeight() + " grams");
        System.out.println(sample1.getRockDescription());
        System.out.println();
        System.out.println("sample number " + sample2.getSampleNum());
        System.out.println("the weight is " + sample2.getWeight() + " grams");
        System.out.println(sample2.getRockDescription());
        System.out.println();
        System.out.println("sample number " + sample3.getSampleNum());
        System.out.println("the weight is " + sample3.getWeight() + " grams");
        System.out.println(sample3.getRockDescription());
    }

}
