package com.island.biologicalOrganism.fauna;
import com.island.biologicalOrganism.BiologicalOrganism;

public abstract class Fauna extends BiologicalOrganism {

    private int rangeOfMotion;
    private double foodForSatiety;

    // Конструктор для ініціалізації полів Fauna та BiologicalOrganism
    public Fauna(boolean isAlive, double weight, int maxValueOrganism, int rangeOfMotion, double foodForSatiety) {
        super(isAlive, weight, maxValueOrganism);
        this.rangeOfMotion = rangeOfMotion;
        this.foodForSatiety = foodForSatiety;
    }

    // Геттери та сеттери для полів Fauna
    public int getRangeOfMotion() {
        return rangeOfMotion;
    }

    public void setRangeOfMotion(int rangeOfMotion) {
        this.rangeOfMotion = rangeOfMotion;
    }

    public double getFoodForSatiety() {
        return foodForSatiety;
    }

    public void setFoodForSatiety(double foodForSatiety) {
        this.foodForSatiety = foodForSatiety;
    }
}