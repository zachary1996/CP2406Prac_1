package week8;

public class DebugRowboat extends DebugBoat {
    public DebugRowboat() {
        super("row");
        setPassengers();
        setPower();
    }

    public void setPassengers() {
        super.passengers = 2;
    }

    public void setPower() {
        super.power = "oars";
    }
}