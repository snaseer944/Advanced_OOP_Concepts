import java.util.ArrayList;
import java.util.List;

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
           this.toYear = toyear;
           this.fromYear = fromyear;

       }

        public String toString() {
            return toYear+ "-" +
                    fromYear + ":" + title;

        }
    }

    private Person person;
    private List<Education> eduList;
    private List<Experience> expList;

    public Resume(Person p) {
        this.person = p;
        this.eduList = new ArrayList<>();
        this.expList = new ArrayList<>();

    }
    public void addExperience(Experience exp){
        this.expList.add(exp);
    }
    public void addEducation(Education edu){
        this.eduList.add(edu);
    }

    public String toString(){
        String str = this.person.toString();
        str += "\nExperience";
        for (Experience exp: expList) {
           str += "\n" + exp;

        }
        str += "\nEducation";
        for (Education edu: eduList) {
            str += "\n" + edu;
        }

            return str;
        }
    }




