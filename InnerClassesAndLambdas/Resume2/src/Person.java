/* TODO */

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthdate;

    private class Position{
        protected String name;
        protected double salary;

        private Position(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        @Override
        public String toString(){
            return name+":"+salary;
        }

    }
    private Position position;
    public Person(String name, String birthdate){
        this.name = name;
        this.birthdate = LocalDate.parse(birthdate);

    }
    public int getAge(){
        return Math.abs( Period.between(LocalDate.now(),this.birthdate).getYears());
    }

    public void setPosition(String title, double salary){
        this.position = new Position(title, salary);

    }

    public Position getPosition(){
        return this.position;
    }

    @Override
    public String toString(){
        return this.name + " "+
                this.getAge()+ " "+
                this.position;
    }

}
