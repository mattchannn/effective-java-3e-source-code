package effectivejava.chapter2.item1.nocompanion;

import effectivejava.chapter2.item1.nocompanion.another.Vehicle;

public class StaticFactoryNoCompanion {

    public static void main(String[] args) {
        Vehicle b = Vehicle.newBMW();
        Vehicle a = Vehicle.newAudi();
        b.accelerate();
        a.accelerate();
    }
}