
package school;

/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 7
 */
public class Student {
    //declare instance variables
    private String name;
    private int age;
    
    //declare constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //declare instance methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
