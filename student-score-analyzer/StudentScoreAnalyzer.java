
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + marks + ")";
    }
}

public class StudentScoreAnalyzer {

    public static void main(String[] args) {
        List<Student> students = readCSV("students.csv");

        if (students.isEmpty()) {
            System.out.println("No data found!");
            return;
        }

        // 1️⃣ Average marks
        double average = students.stream()
                                 .mapToInt(s -> s.marks)
                                 .average()
                                 .orElse(0);

        // 2️⃣ Topper
        Student topper = students.stream()
                                 .max(Comparator.comparingInt(s -> s.marks))
                                 .orElse(null);

        // 3️⃣ Students with marks > 80
        List<Student> topStudents = students.stream()
                                            .filter(s -> s.marks > 80)
                                            .collect(Collectors.toList());

        // 4️⃣ Print on console
        System.out.println("Average Marks: " + average);
        System.out.println("Topper: " + topper.name + " (" + topper.marks + ")");
        System.out.println("Students > 80: " + topStudents);

        // 5️⃣ Write to report.txt
        writeReport("report.txt", students, average, topper, topStudents);
        System.out.println("\n✅ Report generated → report.txt");
    }

    // Read CSV file into List<Student>
    private static List<Student> readCSV(String fileName) {
        List<Student> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int marks = Integer.parseInt(parts[2]);
                    list.add(new Student(id, name, marks));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return list;
    }

    // Write summary report
    private static void writeReport(String fileName, List<Student> students,
                                    double average, Student topper, List<Student> topStudents) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("===== Student Score Report =====");
            pw.println("Total Students: " + students.size());
            pw.println("Average Marks: " + average);
            pw.println("Topper: " + topper.name + " (" + topper.marks + ")");
            pw.println("\nStudents with Marks > 80:");
            topStudents.forEach(s -> pw.println(s.name + " - " + s.marks));
        } catch (IOException e) {
            System.out.println("Error writing report: " + e.getMessage());
        }
    }
}
