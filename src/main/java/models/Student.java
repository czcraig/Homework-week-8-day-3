package models;

import javax.persistence.*;


@Entity
@Table(name ="students")
public class Student {

    private int id;
    private String name;
    private int age;
    private int enrollmentNumber;
    private Course course;
    private Mentor mentor;

    public Student(){}

    public Student(String name, int age, int enrollmentNumber, Course course, Mentor mentor) {
        this.name = name;
        this.age = age;
        this.enrollmentNumber = enrollmentNumber;
        this.course = course;
        this.mentor = mentor;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Column(name = "enrollment_number")
    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @OneToOne
    @JoinColumn(name = "mentor_id", nullable = false)
    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }
}
