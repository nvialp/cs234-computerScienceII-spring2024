
/**
 *
 * @author rhett
 */

public class Trainers {
     // Private instance variables
    private String name;
    private int startTime;
    private int endTime;

    // Constructor with default 9-5 times
    public Trainers(String name) {
        this.name = name;
        this.startTime = 9;
        this.endTime = 17;
    }
    
    public Trainers(String name, int start, int end) {
        this.name = name;
        this.startTime = start;
        this.endTime = end;
    }

    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getStartTime() {
        return startTime;
    }
    
    public int getEndTime() {
        return endTime;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setStartTime(int start) {
        this.startTime = start;
    }
    
    public void setEndTime(int end) {
        this.endTime = end;
    }
    
    //method to set class time given starting and ending hours
    public int getClassTime(){
        int classTime;
        int range = this.startTime - this.endTime + 1;
        classTime = (int)(Math.random() * range) + this.endTime;        
        return classTime;
    }
}