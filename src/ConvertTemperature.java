import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in degree Celsius");
        int c = sc.nextInt();
        int f = (c*9/6)+32;
        System.out.println("The Temperature in Fahrenheit is" + f);
    }
}
