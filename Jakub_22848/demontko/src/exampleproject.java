import java.util.Scanner;
public class exampleproject {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź wagę w kilogramach: ");
        double weight = sc.nextDouble();
        System.out.print(" Wprowadź wzrost w metrach: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.print(" Wskaźnik masy ciała (BMI) wynosi " + BMI + " kg/m2");
    }
}