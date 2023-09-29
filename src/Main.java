import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);

        System.out.print("Massa (kg): ");
        float M = type.nextFloat();

        System.out.print("Altura (M): ");
        float A = type.nextFloat();

        float IMC = M / (A * A);
        System.out.println("IMC: " + String.format("%.2f", IMC));

        if (IMC < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (IMC >= 17 && IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Peso Ideal");
        } else if (IMC >= 25 && IMC < 30) {

            System.out.println("Sobrepeso");
        } else if (IMC >= 30 && IMC < 35) {

            System.out.println("Obesidade");
        } else if (IMC >= 35 && IMC < 40) {

            System.out.println("Obesidade severa");
        } else
            System.out.println("Obesidade Morbida");
    }
}