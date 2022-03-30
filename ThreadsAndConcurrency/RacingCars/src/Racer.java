public class Racer implements Runnable{
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    public Racer(Car c){
        this.c = c;
    }

    @Override
    public void run(){
        try{
            while(this.c.odometer <= distance) {
                if (c.miles == 0) {
                    System.out.println(this.c.name + "Charging");
                    this.c.charge();
                    Thread.sleep((long) this.c.maxMiles);
                }
                else
                    this.c.move(1);
            }System.out.println("Finished:" + c);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
