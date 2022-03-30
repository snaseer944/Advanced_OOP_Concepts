public class Car {
    public double miles; // number of miles left to travel
    public double odometer; // total miles travelled by the car
    public String name; // the name of the car
    public double maxMiles; // the maximum number of miles when full.

    public Car(String name,double miles){
        this.miles = miles;
        odometer = 0;
        this.name = name;
        this.maxMiles = miles;
    }

    public void move(double miles){
        if(this.miles - miles >= 0)
        {
            this.miles -= miles;
            this.odometer += miles;

        }else{
            this.odometer += this.miles;
            this.miles = 0;
        }
    }

    public void charge(){
        this.miles = maxMiles;
    }

    public String toString(){
        return name+": odo:"+odometer+" - miles left:"+miles;
    }

}
