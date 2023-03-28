import java.sql.SQLOutput;

public class Droid {
    String name;
    int batteryLevel;


    public Droid(String droidName){
       name = droidName;
       batteryLevel = 100;

    }

   public String toString(){
        return "Hello! I'm the Droid: " + name + " \nMy Battery Level is Currently at " + batteryLevel + "%";

   }

   public void performTask(String task){
       System.out.println(name + " Is Performing a task: " + task);
   }

   public void batteryUsage(){
        batteryLevel -= 10;

   }

   public void energyReport(){
       System.out.println("Performing tasks is hard work. My battery Level is now " + batteryLevel + "%");

   }
}
