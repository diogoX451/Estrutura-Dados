package QuickSort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String gender;
    private String race;
    private String parental;
    private String lunch;
    private String test;
    private String preparationCourse;
    private String mathScore;
    private String readingScore;
    private String writingScore;

    public Student(String gender, String race, String parental, String lunch, String test, String preparationCourse,
            String mathScore, String readingScore, String writingScore) {
        this.gender = gender;
        this.race = race;
        this.parental = parental;
        this.lunch = lunch;
        this.test = test;
        this.preparationCourse = preparationCourse;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;

    }

    private static List<String> load() {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("StudentsPerformance.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lines;
    }

    public static Student[] loadStudents() {
        List<String> lines = load();

        System.out.println(lines.get(0));
        Student[] students = new Student[lines.size()];

        for (int i = 0; i <= lines.size(); i++) {
            String[] line = lines.get(i).split(",");
            System.out.println(i);
            students[i] = new Student(line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7], line[8]);
        }

        return students;
    }

    public String getRace() {
        return this.race;
    }

    public String getGender() {
        return this.gender;
    }

    public String getParental() {
        return this.parental;
    }

    public String getLunch() {
        return this.lunch;
    }

    public String getTest() {
        return this.test;
    }

    public String getPreparationCourse() {
        return this.preparationCourse;
    }

    public String getMathScore() {
        return this.mathScore;
    }

    public String getReadingScore() {
        return this.readingScore;
    }

    public String getWritingScore() {
        return this.writingScore;
    }

}
