studentAnalytices.java

import java.util.*;

class StudentAnalytics {
    // 1. Data Members
    String name;
    double m1, m2, m3; 
    double average, max, min;
    char grade;
    String feedback;
    
    Scanner in = new Scanner(System.in);

    // 2. Member Function: To input data
    void input() {
        System.out.println("Enter student name: ");
        name = in.nextLine();
        
        System.out.println("Enter marks for Subject 1: ");
        m1 = in.nextDouble();
        
        System.out.println("Enter marks for Subject 2: ");
        m2 = in.nextDouble();
        
        System.out.println("Enter marks for Subject 3: ");
        m3 = in.nextDouble();
    }

    // 3. Member Function: To calculate analytics
    void calculate() {
        average = (m1 + m2 + m3) / 3.0;

        max = m1;
        if (m2 > max) {
            max = m2;
        }
        if (m3 > max) {
            max = m3;
        }

        min = m1;
        if (m2 < min) {
            min = m2;
        }
        if (m3 < min) {
            min = m3;
        }

        if (average >= 90.0) {
            grade = 'A';
            feedback = "Outstanding performance! 🔥";
        } else if (average >= 75.0) {
            grade = 'B';
            feedback = "Great job! Strong analytics results. 👍";
        } else {
            grade = 'C';
            feedback = "Good effort! Keep learning and growing. 📈";
        }
    }

    // 4. Member Function: To display the final analytics report
    void display() {
        System.out.println("\n-------------------------------------------");
        System.out.println("📊 ANALYTICS REPORT FOR: " + name.toUpperCase());
        System.out.println("-------------------------------------------");
        System.out.println("Highest Score Secured: " + max + "%");
        System.out.println("Lowest Score Secured : " + min + "%");
        System.out.println("Calculated Average   : " + average + "%");
        System.out.println("Final Assigned Grade : " + grade);
        System.out.println("Performance Feedback : " + feedback);
        System.out.println("-------------------------------------------");
    }

    // 5. Main Method
    public static void main(String[] args) {
        System.out.println("=== Welcome to the School-Style Student Data Analytics System ===");
        
        StudentAnalytics obj = new StudentAnalytics();
        
        obj.input();
        obj.calculate();
        obj.display();
    }
}
