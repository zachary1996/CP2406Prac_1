package week7;

public class Poem {
    protected String name;
    private int numOfLines;

    Poem(String nme, int num) {
        name = nme;
        numOfLines = num;
    }

    public int getNumOfLines() {
        return numOfLines;
    }

    public String getName() {
        return name;
    }
}
