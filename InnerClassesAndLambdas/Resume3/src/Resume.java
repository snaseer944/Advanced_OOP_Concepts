import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
    public  class Education{
        String school;
        String major;
        public Education(String school, String major){
            this.school = school;
            this.major = major;
        }

        public String getSchool() {
            return school;
        }

        public String getMajor() {
            return major;
        }
        public String toString(){
            return this.major +" at " + this.school;
        }
    }

    public static class Experience{
        String title;
        int fromYear;
        int toYear;

        public Experience(String title, int fromyear, int toyear){
            this.title = title;
            this.fromYear = fromyear;
            this.toYear = toyear;

        }

        public String toString() {
            return toYear+ "-" +
                    fromYear + ":" + title;

        }
    }
    private Person person;
    private List<Education> eduList;
    private PriorityQueue<Experience> exp;
    public Resume(Person p){
        this.person = p;
        this.eduList = new ArrayList<>();
        this.exp = new PriorityQueue<>((exp1, exp2) -> exp2.fromYear - exp1.fromYear);
    }
    public PriorityQueue getExperience() {
        return exp;
    }
    public void addExperience(Experience exp){
        this.exp.add(exp);
    }
    public void addEducation(Education edu){
        this.eduList.add(edu);
    }

    public String toString(){
        String str = this.person.toString();
        str += "\nExperience";
        for (Experience exp: exp) {
            str += "\n" + exp;

        }
        str += "\nEducation";
        for (Education edu: eduList) {
            str += "\n" + edu;
        }

        return str;
    }



}
