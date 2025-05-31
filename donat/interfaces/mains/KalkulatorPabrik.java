package donat.mains;

import java.util.Scanner;
import donat.models.Sphere;
import donat.models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("===============================================");
            System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
            System.out.println("Nabila Anjani");
            System.out.println("245150701111035");
            System.out.println("===============================================");

            // Torus
            System.out.println("Donat dengan lubang");
            System.out.println("===============================================");
            System.out.print("Isikan Radius (R) : ");
            double R = input.nextDouble();
            System.out.print("Isikan radius (r) : ");
            double r = input.nextDouble();

            Torus torus = new Torus(R, r);
            System.out.println("===============================================");
            torus.printInfo();

            // Sphere
            System.out.println("===============================================");
            System.out.println("Donat tanpa lubang");
            System.out.println("===============================================");
            System.out.print("Isikan radius : ");
            double radius = input.nextDouble();

            Sphere sphere = new Sphere(radius);
            System.out.println("===============================================");
            sphere.printInfo();

            System.out.println("===============================================");
        }
    }
}
