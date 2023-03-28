public class Main {

    public static void main(String[] args){
        Droid codey = new Droid("Codey");

        System.out.println(codey);

        codey.performTask("Dancing");
        codey.batteryUsage();
        codey.performTask("Running");
        codey.batteryUsage();
        codey.energyReport();




    }

}

