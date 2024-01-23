package com.island.entity.biologicalOrganism.fauna;

import com.island.entity.biologicalOrganism.BiologicalOrganism;

public abstract class Fauna extends BiologicalOrganism {
    public abstract  void eat();
    public abstract void move();

    public int weight= 0;
    public int rangeOfMotion = 0;
    public int foodForSatiety = 0;
}
