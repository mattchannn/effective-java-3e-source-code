package effectivejava.chapter3.item10;

import java.util.ArrayList;
import java.util.List;

public final class CClass {
    private final String s;

    public CClass(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    // Broken - violates reflexivity
    // Because we intentionally override `equals` method and make
    // it returns false
    public static void main(String[] args) {
        CClass aClass = new CClass("1");

        // Compare the same class
        // The below will return `false`
        boolean firstEq = aClass.equals(aClass);
        System.out.printf("Is aClass equal to itself? %s%n", firstEq);

        List<CClass> listClazz = new ArrayList<>();
        listClazz.add(aClass);
        // The list will say it doesn't contain the aClass because
        //  the criteria of "contain" means if the list contains at least one element `e` such that `Objects.equals(o, e)`
        //  in here, we forcefully override equals methods therefore aClass.equals(aClass) returns false
        // Hence, the `contains` method also returns false.
        boolean secEq = listClazz.contains(aClass);
        System.out.printf("Does the list contain aClass? %s", secEq);
    }
}
