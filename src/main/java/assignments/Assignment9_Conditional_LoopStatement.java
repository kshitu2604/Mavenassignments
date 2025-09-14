package assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment9_Conditional_LoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Step 1: Store employee data in parallel arrays
        String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
        double[] baseSalaries = {75000.0, 68000.0, 82000.0, 90000.0, 60000.0};
        double[] experiences = {5.1, 3.2, 7.1, 10.2, 2.4};
        double[] ratings = {4.2, 3.8, 4.5, 2.5, 3.5};

        // Step 2: Map to store hike percentage results
        Map<String, Double> hikePercentages = new LinkedHashMap<>();

        // Step 3: Loop over each employee (by index)
        for (int i = 0; i < names.length; i++) {
            double variablePayPercent = 0;
            double bonus = 0;
            int reward =0;

            // Conditional logic based on rating
            if (ratings[i] >= 4.0) {
                variablePayPercent = 15.0;
                bonus = 1500;
            } else if (ratings[i] >= 3.0 && ratings[i] < 4.0) {
                variablePayPercent = 10.0;
                bonus = 1200;
            } else {
                variablePayPercent = 3.0;
                bonus = 300;
            }
            
            // Extra reward if experience >= 5 years
            if (experiences[i] >= 5.0) {
                reward += 5000;
            }

            // Base hike
            double hike = (baseSalaries[i] * (variablePayPercent / 100.0)) + bonus+ reward;

           

            // Convert to percentage
            double hikePercent = (hike / baseSalaries[i]) * 100.0;

            // Store result in map
            hikePercentages.put(names[i], hikePercent);
        }

        // Step 4: Print results
        System.out.println("Employee Hike Percentages:");
        for (Map.Entry<String, Double> entry : hikePercentages.entrySet()) {
        	System.out.println(entry.getKey() + " -> " + entry.getValue() + "%");
        }
    }
	
}