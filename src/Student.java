import java.util.Date;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Student
 * @since 20.03.2021 - 17.44
 */
public class Student extends Person {

    private String studentId;
    private String faculty;
    private String department;
    private String groupName;
    private String major;
    private String specialty;
    private String formOfEducation;
    private Date dateOfAdmission;
    private Date dateOfGraduation;
    private String currentAcademicDegree;
    private boolean isGranted;
    private boolean hadAcademicLeave;
    private String personalAchievements;

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
                   Date dateOfAdmission, Date dateOfGraduation) {
        super(name);
        this.studentId = studentId;
        this.formOfEducation = formOfEducation;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfGraduation = dateOfGraduation;
    }

    public Student(String name, String studentId, String formOfEducation, String personalAchievements,
                   Date dateOfAdmission, Date dateOfGraduation, boolean hadAcademicLeave, int mark1Algebra,
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

    public Student(String name, String studentId, String faculty, String department, String groupName,
                   String major, String specialty, String formOfEducation, Date dateOfAdmission,
                   Date dateOfGraduation, String currentAcademicDegree, boolean isGranted,
                   boolean hadAcademicLeave, String personalAchievements) {
        super(name);
        this.studentId = studentId;
        this.faculty = faculty;
        this.department = department;
        this.groupName = groupName;
        this.major = major;
        this.specialty = specialty;
        this.formOfEducation = formOfEducation;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfGraduation = dateOfGraduation;
        this.currentAcademicDegree = currentAcademicDegree;
        this.isGranted = isGranted;
        this.hadAcademicLeave = hadAcademicLeave;
        this.personalAchievements = personalAchievements;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setFormOfEducation(String formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public void setDateOfGraduation(Date dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public void setCurrentAcademicDegree(String currentAcademicDegree) {
        this.currentAcademicDegree = currentAcademicDegree;
    }

    public void setGranted(boolean granted) {
        isGranted = granted;
    }

    public void setHadAcademicLeave(boolean hadAcademicLeave) {
        this.hadAcademicLeave = hadAcademicLeave;
    }

    public void setPersonalAchievements(String personalAchievements) {
        this.personalAchievements = personalAchievements;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + super.name + '\'' +
//                ", studentId='" + studentId + '\'' +
//                ", faculty='" + faculty + '\'' +
//                ", department='" + department + '\'' +
//                ", groupName='" + groupName + '\'' +
//                ", major='" + major + '\'' +
//                ", specialty='" + specialty + '\'' +
//                ", formOfEducation='" + formOfEducation + '\'' +
//                ", dateOfAdmission=" + dateOfAdmission +
//                ", dateOfGraduation=" + dateOfGraduation +
//                ", currentAcademicDegree='" + currentAcademicDegree + '\'' +
//                ", isGranted=" + isGranted +
//                ", hadAcademicLeave=" + hadAcademicLeave +
//                ", personalAchievements='" + personalAchievements + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Student{" + super.getName() + '\'' +
                "studentId='" + studentId + '\'' +
                ", faculty='" + faculty + '\'' +
                ", department='" + department + '\'' +
                ", groupName='" + groupName + '\'' +
                ", major='" + major + '\'' +
                ", specialty='" + specialty + '\'' +
                ", formOfEducation='" + formOfEducation + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                ", dateOfGraduation=" + dateOfGraduation +
                ", currentAcademicDegree='" + currentAcademicDegree + '\'' +
                ", isGranted=" + isGranted +
                ", hadAcademicLeave=" + hadAcademicLeave +
                ", personalAchievements='" + personalAchievements + '\'' +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGPA() {

        int gPA = (this.mark1Algebra + this.mark2Geometry + this.mark3Geography + this.mark4Physics
                + this.mark5Chemistry + this.mark6PhysicalTraining + this.mark7Astronomy
                + this.mark8Biology + this.mark9English + this.mark10Spanish) / 10;

        return gPA;

    }

    public static class Builder {
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        public Builder setName(String name) {

            studentToBuild.setName(name);
            return this;
        }

        public Builder setStudentId(String studentId) {
            studentToBuild.setStudentId(studentId);
            return this;
        }

        public Builder setFaculty(String faculty) {
            studentToBuild.setFaculty(faculty);
            return this;
        }

        public Builder setDepartment(String department) {
            studentToBuild.setDepartment(department);
            return this;
        }

        public Builder setGroupName(String groupName) {
            studentToBuild.setGroupName(groupName);
            return this;
        }

        public Builder setMajor(String major) {
            studentToBuild.setMajor(major);
            return this;
        }

        public Builder setSpecialty(String specialty) {
            studentToBuild.setSpecialty(specialty);
            return this;
        }

        public Builder setFormOfEducation(String formOfEducation) {
            studentToBuild.setFormOfEducation(formOfEducation);
            return this;
        }

        public Builder setDateOfAdmission(Date dateOfAdmission) {
            studentToBuild.setDateOfAdmission(dateOfAdmission);
            return this;
        }

        public Builder setDateOfGraduation(Date dateOfGraduation) {
            studentToBuild.setDateOfGraduation(dateOfGraduation);
            return this;
        }

        public Builder setCurrentAcademicDegree(String academicDegree) {
            studentToBuild.setCurrentAcademicDegree(academicDegree);
            return this;
        }

        public Builder setIsGranted(Boolean isGranted) {
            studentToBuild.setGranted(isGranted);
            return this;
        }

        public Builder setHadAcademicLeave(Boolean hadAcademicLeave) {
            studentToBuild.setHadAcademicLeave(hadAcademicLeave);
            return this;
        }

        public Builder setPersonalAchievements(String personalAchievements) {
            studentToBuild.setPersonalAchievements(personalAchievements);
            return this;
        }


        public Student build() {
            return studentToBuild;
        }
    }

    public static void main(String[] args) {

        Student st1 = new Student("Ivan Kotov", "FI236463", "daily", "",
                new Date(1472731200), new Date(1593518400), false, 75, 75,
                80, 69, 64, 95,
                80, 80, 90, 88);


        System.out.println("the GPA of student " + st1.getStudentId() + "is: " + st1.getGPA());

        Student st2 = new Student("Ivan Ivanov", "TYU473432", "CS", "Some Department",
                "CS-128", "Computer science", "CS and AI", "daily",
                new Date(1472731200), new Date(1593518400), "bachelor", true,
                false, "");

        System.out.println(st2.toString());

        Student Vlad1 = new Builder()
                .setName("Vlad ")
                .setStudentId("4y54757")
                .setFaculty("SE AM")
                .setDepartment("Applied mathematics")
                .setGroupName("AM-127")
                .setMajor("AM")
                .setSpecialty("Data analysis and applied mathematics")
                .setFormOfEducation("daily")
                .setDateOfAdmission(new Date(1472731200))
                .setDateOfGraduation(new Date(1593518400))
                .setCurrentAcademicDegree("Bachelor")
                .setIsGranted(true)
                .setHadAcademicLeave(false)
                .setPersonalAchievements("")
                .studentToBuild;

        System.out.println(Vlad1);


    }

//    the GPA of student FI236463is: 79.0
//    Student{Ivan Ivanov'studentId='TYU473432', faculty='CS', department='Some Department', groupName='CS-128',
//    major='Computer science', specialty='CS and AI', formOfEducation='daily',
//    dateOfAdmission=Sun Jan 18 03:05:31 GMT+02:00 1970, dateOfGraduation=Mon Jan 19 12:38:38 GMT+02:00 1970,
//    currentAcademicDegree='bachelor', isGranted=true, hadAcademicLeave=false, personalAchievements=''}
//     Student{Vlad'studentId='4y54757', faculty='SE AM', department='Applied mathematics', groupName='AM-127',
//     major='AM', specialty='Data analysis and applied mathematics', formOfEducation='daily',
//     dateOfAdmission=Sun Jan 18 03:05:31 GMT+02:00 1970, dateOfGraduation=Mon Jan 19 12:38:38 GMT+02:00 1970,
//     currentAcademicDegree='Bachelor', isGranted=true, hadAcademicLeave=false, personalAchievements=''}


}
