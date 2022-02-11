public class Task {
    Person[] patients = new Person[5];
    public static void main(String[] args) {
        Task t = new Task();
        t.run();
    }

    public void run(){
        Person bart = new ChildPatient();
        Diagnosable lisa = new ChildPatient();
        ChildPatient maggie = new ChildPatient();
        AdultPatient homer = new AdultPatient();
        Employable marge = new AdultPatient();
        //TODO
        ((ChildPatient) bart).setTemperature(101.2);
        maggie.setTemperature(100.1);
        lisa.setTemperature(100.6);
        //TODO
        homer.addJob("Nuclear Engineer" );
        homer.addJob("Major" );
        homer.addJob("Bar Owner" );
        marge.addJob("house keeper");

        patients[0] = bart;
        patients[1] = (ChildPatient) lisa;
        patients[2] = maggie;
        patients[3] = homer;
        patients[4] = (AdultPatient) marge;

    }

    public boolean isAdult(Person p){
        return p instanceof Employable;
    }
}