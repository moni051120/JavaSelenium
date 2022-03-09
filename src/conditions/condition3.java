package conditions;

public class condition3 {

    public static void main(String[] args) {

        int marks = 700;

        if (marks < 35) {
            System.out.println("FAIL");
        } else if (marks >= 35 && marks < 45) {
            System.out.println("PASS CLASS");
        } else if (marks >= 45 && marks < 60) {
            System.out.println("Second CLASS");
        } else if (marks >= 60 && marks < 85) {
            System.out.println("First Class");
        } else if (marks >= 85 && marks <= 100) {
            System.out.println("Top Class");
        } else {
            System.out.println("Contact admin");
        }

    }
}