package javapracticetopicwise;

// Abstract class
abstract class Abstraconcept {
    abstract void demoAbs();
    
    public void demo2() {
        System.out.println("This is concrete method");
    }
    
    public Abstraconcept() {
        System.out.println("This is normal constructor");
    }
}

// Child class implementing abstract class
class Imple extends Abstraconcept {
    public void demoAbs() {
        System.out.println("This is abstract implemented method");
    }
    
    public void show() {
        System.out.println("This method is child class method");
    }
}

// Main class
