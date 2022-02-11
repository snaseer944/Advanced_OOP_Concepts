public interface Diagnosable {
    double getTemperature();
    void setTemperature(double t);
    public default boolean hasFever(){
        return this.getTemperature() > 100.4 ;
    }
    int getSystolic();
    int getDiastolic();
    void setSystolic(int s);
    void setDiastolic(int d);
}
