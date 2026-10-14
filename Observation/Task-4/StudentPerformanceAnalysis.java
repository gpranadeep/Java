import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks;

    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    int highestMark() {
        int highest = marks[0];
        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }
        return highest;
    }

    int lowestMark() {
        int lowest = marks[0];
        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }
        return lowest;
    }

    double calculatePercentage() {
        double percentage = (double) calculateTotal() / (marks.length * 100) * 100;
        return Math.round(percentage * 100.0) / 100.0;
    }

    String getGrade() {
        double per = calculatePercentage();

        if (per >= 90)
            return "A+";
        else if (per >= 80)
            return "A";
        else if (per >= 70)
            return "B";
        else if (per >= 60)
            return "C";
        else if (per >= 50)
            return "D";
        else
            return "F";
    }

    String getResult() {
        return calculatePercentage() >= 50 ? "PASS" : "FAIL";
    }

    String getRemark() {
        String grade = getGrade();

        switch (grade) {
            case "A+":
                return "Outstanding Performance";
            case "A":
                return "Excellent Performance";
            case "B":
                return "Very Good Performance";
            case "C":
                return "Good Performance";
            case "D":
                return "Average Performance";
            default:
                return "Needs Improvement";
        }
    }

    void displayReport() {
        String formattedName = name.trim().toUpperCase();

        System.out.println("\n========== STUDENT PERFORMANCE REPORT ==========");
        System.out.println("Roll Number        : " + rollNo);
        System.out.println("Student Name       : " + formattedName);
        System.out.println("Name Length        : " + formattedName.length());

        System.out.println("\nSubject Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("\nTotal Marks        : " + calculateTotal());
        System.out.println("Average Marks      : " + calculateAverage());
        System.out.println("Highest Mark       : " + highestMark());
        System.out.println("Lowest Mark        : " + lowestMark());
        System.out.println("Percentage         : " + calculatePercentage() + "%");
        System.out.println("Grade              : " + getGrade());
        System.out.println("Result             : " + getResult());
        System.out.println("Performance Remark : " + getRemark());
        System.out.println("===============================================");
    }
}

public class StudentPerformanceAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student student = new Student(rollNo, name, marks);
        student.displayReport();

        sc.close();
    }
}
