
public class StudentMarkTracker {
    private static final double EXCELLENT_THRESHOLD = 9.0;
    private static final double GOOD_THRESHOLD = 7.0;
    private static final double PASSING_THRESHOLD = 4.0;

    private static final String[] STUDENT_NAMES = {
            "Ricards", "Nauris", "Dace", "Talis"
    };

    private static final int[][] studentMarks = {
            {9, 10, 10, 7},
            {6, 9, 8, 9},
            {5, 4, 6, 10},
            {4, 2, 2, 1},

    };

    public static void main(String[] args) {
        for (int i = 0; i < studentMarks.length; i++) {
            double average = calculateAverage(studentMarks[i]);
            String result = classifyAverage(average);

            System.out.println (STUDENT_NAMES[i] +":" + average + "-" + result
            );
        }
    }

    private static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    private static String classifyAverage(double average) {
        if (average >= EXCELLENT_THRESHOLD) {
            return "Excellent";
        } else if (average >= GOOD_THRESHOLD) {
            return "Good";
        } else if (average >= PASSING_THRESHOLD) {
            return "Passing";
        } else {
            return "Failed";
        }
    }
}

