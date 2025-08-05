package javapracticetopicwise;

public class MainDemo {
    public static void main(String[] args) {
        Abstraconcept ab = new Imple();  // ✅ No errors now
        ab.demoAbs();
        ab.demo2();
        
        // Downcasting to access Imple-specific methods
    
            Imple impl = (Imple) ab;
            impl.show();
        
    }
}

