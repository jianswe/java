package inheritance;

import objects.Rectangle;

/**
 * Limited Access in Inheritance
 * - constructors are not inherited
 * - public and protected members are inherited
 * - private members are not inherited
 * - final methods can be inherited but not overridden
 * */
public class Square extends Rectangle {

    // Access Modifiers for Overridden Methods: can be same or less restrict
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    // Overload
    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
