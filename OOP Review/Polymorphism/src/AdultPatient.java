import java.util.ArrayList;

public class AdultPatient extends Person implements Diagnosable, Employable {
    double temperature;
    int systolic;
    int diastolic;
    ArrayList<String> job = new ArrayList<String>();

    @Override
    public double getTemperature() {
        return this.temperature;
    }
    @Override
    public void setTemperature(double t) {
        this.temperature = t;
    }
    @Override
    public int getSystolic() {
        return this.systolic;
    }
    @Override
    public void setSystolic(int s) {
        this.systolic = s;
    }
    @Override
    public int getDiastolic() {
        return this.diastolic;
    }
    @Override
    public void setDiastolic(int d) {
        this.diastolic = d;
    }
    @Override
    public ArrayList<String> getPreviousJobs() {
        return this.job;
    }
    @Override
    public void addJob(String j){
        this.job.add(j); }

}