package javapracticetopicwise;


	public class MethodOverriding2 extends MethodOverriding{
		public void display() {
			System.out.println("This is child method");
		}
		public static void main(String[] args) {
			MethodOverriding mr=new MethodOverriding2();
			mr.display();
		}
	}

/*MethodOverriding mr=new MethodOverriding();---only parent class method can accessible*/
/*MethodOverriding2 mr=new MethodOverriding2();---both parent and child class methods can accessible*/
/*MethodOverriding mr=new MethodOverriding2();---Rule1=Only parent class methods can accessible*/
/*Rule2=If methods are overridden ie same method in both parent and child class, then child class methods can accessible*/
/*Rule3= If methods in parent class is private and method in child class is public which having same name, it considered as two independent 
 * methods ie We can called it method hiding , since overriding is not possible if the method in parent class is private,
 *  we can access parent class methods*/	
	/*class Parent {
    private void display() {
        System.out.println("Parent's private display method");
    }
}

class Child extends Parent {
    // This does NOT override Parent's display method
    public void display() {
        System.out.println("Child's display method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Calls Parent's display method

        Child child = new Child();
        child.display(); // Calls Child's display method

        Parent polyRef = new Child();
        polyRef.display(); // Calls Parent's display method due to no polymorphism
    }
}
*/
	
	