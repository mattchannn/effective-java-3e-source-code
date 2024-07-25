package effectivejava.chapter2.item1.companion;

import effectivejava.chapter2.item1.companion.another.Vehicle;
import effectivejava.chapter2.item1.companion.another.Vehicles;

import java.util.Collection;
import java.util.Collections;

public class StaticFactoryCompanion {

    public static void main(String[] args) {
        Vehicle v = Vehicles.newBMW();
        Collection c = Collections.unmodifiableList(null);
    }
}