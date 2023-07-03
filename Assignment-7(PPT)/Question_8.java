package Assignment_7_PPT;

public class Question_8 {
	    public static boolean checkStraightLine(int[][] coordinates) {
	        if (coordinates.length < 2) {
	            return true;
	        }

	        int x1 = coordinates[0][0];
	        int y1 = coordinates[0][1];
	        int x2 = coordinates[1][0];
	        int y2 = coordinates[1][1];

	        double slope = (double) (y2 - y1) / (x2 - x1);

	        for (int i = 2; i < coordinates.length; i++) {
	            int xi = coordinates[i][0];
	            int yi = coordinates[i][1];

	            double currentSlope = (double) (yi - y1) / (xi - x1);

	            if (currentSlope != slope) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
	        System.out.println(checkStraightLine(coordinates));
	    }
}