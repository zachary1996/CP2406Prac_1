package week7;

public class Rock {
    protected String rockDescription;
    int sampleNum;
    double weight; //in grams

    public Rock(int number, double grams) {
        sampleNum = number;
        weight = grams;
        rockDescription = "Unclassified";
    }

    public double getWeight() {
        return weight;
    }

    public int getSampleNum() {
        return sampleNum;
    }

    public String getRockDescription() {
        return rockDescription;
    }
}
