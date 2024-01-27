package com.island.biologicalOrganism.fauna;
import com.island.biologicalOrganism.BiologicalOrganism;

public abstract class Fauna extends BiologicalOrganism {

    private boolean isAlive;
    private int maxValueOrganismLocation;
    private int weight;
    private int rangeOfMotion;
    private int foodForSatiety;

    public Fauna(boolean isAlive, int maxValueOrganismLocation, int weight, int rangeOfMotion, int foodForSatiety) {
        this.isAlive = isAlive;
        this.maxValueOrganismLocation = maxValueOrganismLocation;
        this.weight = weight;
        this.rangeOfMotion = rangeOfMotion;
        this.foodForSatiety = foodForSatiety;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getMaxValueOrganismLocation() {
        return maxValueOrganismLocation;
    }

    public void setMaxValueOrganismLocation(int maxValueOrganismLocation) {
        this.maxValueOrganismLocation = maxValueOrganismLocation;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRangeOfMotion() {
        return rangeOfMotion;
    }

    public void setRangeOfMotion(int rangeOfMotion) {
        this.rangeOfMotion = rangeOfMotion;
    }

    public int getFoodForSatiety() {
        return foodForSatiety;
    }

    public void setFoodForSatiety(int foodForSatiety) {
        this.foodForSatiety = foodForSatiety;
    }

    public abstract  void eat();
    public abstract void move();
}