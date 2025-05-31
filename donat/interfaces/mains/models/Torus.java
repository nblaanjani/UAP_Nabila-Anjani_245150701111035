package donat.models;

import donat.bases.Shape;
import donat.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, PIRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;

    public Torus() {}

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
        setName("Donat dengan lubang");
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        double kg = gramToKilogram();
        int roundedKg = (int) Math.ceil(kg);
        return roundedKg * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume           : " + getVolume());
        System.out.println("Luas permukaan   : " + getSurfaceArea());
        System.out.println("Massa            : " + getMass());
        System.out.println("Massa dalam kg   : " + gramToKilogram());
        System.out.println("Biaya kirim      : Rp" + calculateCost());
    }
}
