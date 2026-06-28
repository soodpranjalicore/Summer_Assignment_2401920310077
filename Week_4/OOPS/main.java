class Outer {
    void display() {
        System.out.println("Outer class");
    }
     class Inner {
        void display() {
            System.out.println("Inner class");
        }
     }
}
public class main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
