public class Task {
    public static void main(String[] args){
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        Resume.Education education = r.new Education("NEIU", "Computer Science");
        r.addEducation(education);
        Resume.Experience experience = new Resume.Experience("Barista", 2017,2018);
        r.addExperience(experience);

        r.addExperience(new Resume.Experience("Cashier",2018,2019));
        r.addExperience(new Resume.Experience("Associate",2019,2021));
        //r.addExperience(new Resume.Experience("Engineer", 2018, 2020));

        System.out.println(r); //watch the resume print.
    }
}