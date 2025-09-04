//Constructors in Java
// Constructors are special methods used to initialize objects. 
// They are called when an object of a class is created.
// A constructor has the same name as the class and does not have a return type.
public class oop{
    int age;
    String name;

    oop(String name){
        this.name = name;
        this.age = 0;

    }
    oop(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }


    public static void main(String[] args) {
        oop p1 = new oop("John");
        p1.display(); // Output: Name: John, Age: 0
        oop p2 = new oop("Jane", 25);           
        p2.display(); // Output: Name: Jane, Age: 25
        oop p3 = new oop("Doe", 30);
        p3.display(); // Output: Name: Doe, Age: 30
    }
}