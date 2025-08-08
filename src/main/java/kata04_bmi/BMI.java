package kata04_bmi;

public class BMI {
    public static String bmi(double weight, double height) {
        double value = weight / (height * height);
        value = Math.round(value * 10.0) / 10.0;
        String result;

        if (value <= 18.5) {
            result = "Underweight";
        } else if (value <= 25.0) {
            result = "Normal";
        } else if (value <= 30.0) {
            result = "Overweight";
        } else {
            result = "Obese";
        }

        return result;
    }

}
