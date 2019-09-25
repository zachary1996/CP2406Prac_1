package week8;

// An array for different boat types
public class FixDebugEleven2 {
    public static void main(String[] args) {
        DebugBoat[] ref = new DebugBoat[3];
        DebugRowboat blueBoat = new DebugRowboat();
        DebugRowboat redBoat = new DebugRowboat();
        DebugOceanLiner bigBoat = new DebugOceanLiner();
        ref[0] = blueBoat;
        ref[1] = redBoat;
        ref[2] = bigBoat;
        for (int x = 0; x < ref.length; ++x) {
            ref[x].setPassengers();
            ref[x].setPower();
            System.out.println(ref[x].toString());
        }
    }
}
