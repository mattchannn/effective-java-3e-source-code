package effectivejava.chapter2.item1.nocompanion.another;

public interface Vehicle {
    static BMW newBMW() {
        return new BMW();
    }

    static Audi newAudi() {
        return new Audi();
    }

    void accelerate();
}
