package com.island.islandModel;

import com.island.biologicalOrganism.fauna.herbivore.*;
import com.island.biologicalOrganism.fauna.predator.*;
import com.island.biologicalOrganism.flora.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Location {
    private List<Predator> predatorList;

    public List<Predator> getPredatorList() {
        return predatorList;
    }

    public List<Herbivore> getHerbivoreList() {
        return herbivoreList;
    }

    public List<Flora> getFloraList() {
        return floraList;
    }

    private List<Herbivore> herbivoreList;
    private List<Flora> floraList;

    private ConfigReader config = new ConfigReader();
    Random random = new Random();

    public Location() {
        predatorList = new ArrayList<>();
        herbivoreList = new ArrayList<>();
        floraList = new ArrayList<>();

        populatePredatorsRandomly();
        populateHerbivoresRandomly();
        populateFlorasRandomly();
    }

    private void populatePredatorsRandomly() {
        addPredatorsRandomly(Wolf.class,config.getMaxWolf() );
        addPredatorsRandomly(Boa.class, config.getMaxBoa());
        addPredatorsRandomly(Fox.class, config.getMaxFox());
        addPredatorsRandomly(Bear.class, config.getMaxBear());
        addPredatorsRandomly(Eagle.class, config.getMaxEagle());
    }

    private void populateHerbivoresRandomly() {
        addHerbivoresRandomly(Horse.class, config.getMaxHorse());
        addHerbivoresRandomly(Deer.class, config.getMaxDeer());
        addHerbivoresRandomly(Rabbit.class, config.getMaxRabbit());
        addHerbivoresRandomly(Mouse.class, config.getMaxMouse());
        addHerbivoresRandomly(Goat.class, config.getMaxGoat());
        addHerbivoresRandomly(Sheep.class, config.getMaxSheep());
        addHerbivoresRandomly(Boar.class, config.getMaxBoar());
        addHerbivoresRandomly(Buffalo.class, config.getMaxBuffalo());
        addHerbivoresRandomly(Duck.class, config.getMaxDuck());
        addHerbivoresRandomly(Caterpillar.class, config.getMaxCaterpillar());
    }

    private void populateFlorasRandomly() {
        addFlorasRandomly(Grass.class, config.getMaxGrass());
    }


    private void addPredatorsRandomly(Class<? extends Predator> predatorClass, int maxCount) {
        int count = random.nextInt(maxCount + 1);

        try {
            for (int i = 0; i < count; i++) {
                Predator predator = predatorClass.getDeclaredConstructor().newInstance();
                predatorList.add(predator);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addHerbivoresRandomly(Class<? extends Herbivore> herbivoreClass, int maxCount) {
        int count = random.nextInt(maxCount + 1);

        try {
            for (int i = 0; i < count; i++) {
                Herbivore herbivore = herbivoreClass.getDeclaredConstructor().newInstance();
                herbivoreList.add(herbivore);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addFlorasRandomly(Class<? extends Flora> floraClass, int maxCount) {
        int count = random.nextInt(maxCount + 1);

        try {
            for (int i = 0; i < count; i++) {
                Flora flora = floraClass.getDeclaredConstructor().newInstance();
                floraList.add(flora);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}