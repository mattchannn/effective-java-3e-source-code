package effectivejava.chapter2.item1.companion.another;

public class Vehicles implements Vehicle {
    private Vehicles() {
    }

    public static Vehicle newBMW() {
        return new BMW();
    }

    static class BMW implements Vehicle {
        public void accelerate() {
            System.out.println("BMW accelerating");
        }
    }
}
