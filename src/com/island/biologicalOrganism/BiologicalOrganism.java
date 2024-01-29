package com.island.biologicalOrganism;

public abstract class BiologicalOrganism {

    private boolean isAlive;
    private double weight;
    private int maxValueOrganism;

    // Конструктор
    public BiologicalOrganism(boolean isAlive, double weight, int maxValueOrganism) {
        this.isAlive = isAlive;
        this.weight = weight;
        this.maxValueOrganism = maxValueOrganism;
    }

    // Геттери та сеттери для полів
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxValueOrganism() {
        return maxValueOrganism;
    }

    public void setMaxValueOrganism(int maxValueOrganism) {
        this.maxValueOrganism = maxValueOrganism;
    }

}
