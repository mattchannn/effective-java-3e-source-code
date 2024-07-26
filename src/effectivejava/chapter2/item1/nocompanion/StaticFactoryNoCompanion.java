package effectivejava.chapter2.item1.nocompanion;

import effectivejava.chapter2.item1.nocompanion.another.Audi;
import effectivejava.chapter2.item1.nocompanion.another.Vehicle;
import effectivejava.chapter2.item1.nocompanion.another.BMW;

import java.util.Collections;

public class StaticFactoryNoCompanion {

    public static void main(String[] args) {
        BMW b = Vehicle.newBMW();
        Audi a = Vehicle.newAudi();
        b.accelerate();
        a.accelerate();
    }
}