import java.util.Calendar;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Student
 * @since 20.03.2021 - 17.44
 */
public class Student extends Person {

    private String studentId;
    private String formOfEducation;
    private String personalAchievements;
    private String dateOfAdmission;
    private String dateOfGraduation;
    private boolean hadAcademicLeave;

    private int mark1Algebra;
    private int mark2Geometry;
    private int mark3Geography;
    private int mark4Physics;
    private int mark5Chemistry;
    private int mark6PhysicalTraining;
    private int mark7Astronomy;
    private int mark8Biology;
    private int mark9English;
    private int mark10Spanish;

    public Student() {
    }

    public Student(String name, String studentId, String formOfEducation,
                   String dateOfAdmission, String dateOfGraduation) {
        super(name);
        this.studentId = studentId;
        this.formOfEducation = formOfEducation;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfGraduation = dateOfGraduation;
    }

    public Student(String name, String studentId, String formOfEducation, String personalAchievements,
                   String dateOfAdmission, String dateOfGraduation, boolean hadAcademicLeave, int mark1Algebra,
                   int mark2Geometry, int mark3Geography, int mark4Physics, int mark5Chemistry,
                   int mark6PhysicalTraining, int mark7Astronomy, int mark8Biology,
                   int mark9English, int mark10Spanish) {
        super(name);
        this.studentId = studentId;
        this.formOfEducation = formOfEducation;
        this.personalAchievements = personalAchievements;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfGraduation = dateOfGraduation;
        this.hadAcademicLeave = hadAcademicLeave;
        this.mark1Algebra = mark1Algebra;
        this.mark2Geometry = mark2Geometry;
        this.mark3Geography = mark3Geography;
        this.mark4Physics = mark4Physics;
        this.mark5Chemistry = mark5Chemistry;
        this.mark6PhysicalTraining = mark6PhysicalTraining;
        this.mark7Astronomy = mark7Astronomy;
        this.mark8Biology = mark8Biology;
        this.mark9English = mark9English;
        this.mark10Spanish = mark10Spanish;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGPA() {

        double gPA = (this.mark1Algebra + this.mark2Geometry + this.mark3Geography + this.mark4Physics + this.mark5Chemistry +
                this.mark6PhysicalTraining + this.mark7Astronomy + this.mark8Biology + this.mark9English + this.mark10Spanish) / 10;

        return gPA;

    }

    public static void main(String[] args) {

        Student st1 = new Student("Ivan Kotov", "FI236463", "daily", "",
                "01.09.2016", "30.06.2020", false, 75, 75,
                80, 69, 64, 95,
                80, 80, 90, 88);


        System.out.println("the GPA of student " + st1.getStudentId() + "is: " + st1.getGPA());

    }

//    the GPA of student FI236463is: 79.0

}
