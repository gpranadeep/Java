// Demonstration of inheritance and implementation cases in Java

// Case 1: C1 extends C2
class C2 {
    void printParentMessage() {
        System.out.println("Case 1: Hello from C2");
    }
}

class C1 extends C2 {
    void printChildMessage() {
        System.out.println("Case 1: Hello from C1");
    }
}

// Case 2: C1 extends C2, C3 - Invalid
// class C1 extends C2, C3 { }
// Compilation error: multiple class inheritance is not allowed.

class C3 {
}

// Case 3: C1 implements I1
interface I1 {
    void sayHello();
}

class C1ImplI1 implements I1 {
    public void sayHello() {
        System.out.println("Case 3: Hello from I1 implementation");
    }
}

// Case 4: C1 implements I1, I2
interface I2 {
    void sendMessage();
}

class C1ImplI1I2 implements I1, I2 {
    public void sayHello() {
        System.out.println("Case 4: Greeting from I1");
    }

    public void sendMessage() {
        System.out.println("Case 4: Message from I2");
    }
}

// Case 5: C1 extends C2 and implements I1
class C1ExtC2ImplI1 extends C2 implements I1 {
    public void sayHello() {
        System.out.println("Case 5: Greeting with inherited C2 behavior");
    }
}

// Case 6: I1 extends I2
interface I2Base {
    void showBaseFeature();
}

interface I1ExtI2 extends I2Base {
    void showGreeting();
}

class C1ImplI1ExtI2 implements I1ExtI2 {
    public void showBaseFeature() {
        System.out.println("Case 6: Base feature from I2");
    }

    public void showGreeting() {
        System.out.println("Case 6: Greeting from I1");
    }
}

// Case 7: I1 implements C1 - Invalid
// interface I1Bad implements C1 { }
// Compilation error: interfaces cannot implement classes.

// Case 8: I1 extends I2, I3
interface I3 {
    void showExtraFeature();
}

interface I1ExtI2I3 extends I2Base, I3 {
    void showGreeting();
}

class C1ImplI1ExtI2I3 implements I1ExtI2I3 {
    public void showBaseFeature() {
        System.out.println("Case 8: Base feature from I2");
    }

    public void showExtraFeature() {
        System.out.println("Case 8: Extra feature from I3");
    }

    public void showGreeting() {
        System.out.println("Case 8: Greeting from I1");
    }
}

// Main driver class
public class Inheritance_Implementation{

    public static void main(String[] args) {

        // Case 1
        C1 object1 = new C1();
        object1.printParentMessage();
        object1.printChildMessage();

        // Case 2
        System.out.println(
                "Case 2: Invalid in Java - multiple class inheritance is not allowed"
        );

        // Case 3
        C1ImplI1 object3 = new C1ImplI1();
        object3.sayHello();

        // Case 4
        C1ImplI1I2 object4 = new C1ImplI1I2();
        object4.sayHello();
        object4.sendMessage();

        // Case 5
        C1ExtC2ImplI1 object5 = new C1ExtC2ImplI1();
        object5.printParentMessage();
        object5.sayHello();

        // Case 6
        C1ImplI1ExtI2 object6 = new C1ImplI1ExtI2();
        object6.showBaseFeature();
        object6.showGreeting();

        // Case 7
        System.out.println(
                "Case 7: Invalid in Java - interfaces cannot implement classes"
        );

        // Case 8
        C1ImplI1ExtI2I3 object8 = new C1ImplI1ExtI2I3();
        object8.showBaseFeature();
        object8.showExtraFeature();
        object8.showGreeting();
    }
}
