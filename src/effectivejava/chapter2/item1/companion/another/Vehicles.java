package effectivejava.chapter2.item1.companion.another;

public class Vehicles {
    private Vehicles() {
    }

    public static BMW newBMW() {
        return new BMW();
    }

    static class BMW implements Vehicle {
        @Override
        public void accelerate() {
            System.out.println("BMW accelerating");
        }
    }
}
