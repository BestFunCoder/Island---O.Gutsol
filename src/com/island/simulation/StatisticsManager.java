package com.island.simulation;

import com.island.biologicalOrganism.fauna.herbivore.*;
import com.island.biologicalOrganism.fauna.predator.*;
import com.island.biologicalOrganism.flora.Grass;
import com.island.islandModel.IslandModel;
import com.island.islandModel.Location;

public class StatisticsManager {

    public static  void printAllStatistics(IslandModel islandModel){
        printPredatorStatistics(islandModel);
        printHerbivoreStatistics(islandModel);
        printFloraStatistics(islandModel);
    }

    public static void printPredatorStatistics(IslandModel islandModel) {
        int wolvesCount = 0;
        int boasCount = 0;
        int foxesCount = 0;
        int bearsCount = 0;
        int eaglesCount = 0;

        for (Location[] row : islandModel.getIsland()) {
            for (Location location : row) {
                wolvesCount = (int) location.getPredatorList().stream().filter(predator -> predator instanceof Wolf).count();
                boasCount = (int) location.getPredatorList().stream().filter(predator -> predator instanceof Boa).count();
                foxesCount = (int) location.getPredatorList().stream().filter(predator -> predator instanceof Fox).count();
                bearsCount = (int) location.getPredatorList().stream().filter(predator -> predator instanceof Bear).count();
                eaglesCount = (int) location.getPredatorList().stream().filter(predator -> predator instanceof Eagle).count();
            }
        }

        System.out.println("Predator Statistics: ");
        System.out.println("Wolves count: " + wolvesCount);
        System.out.println("Boas count: " + boasCount);
        System.out.println("Foxes count: " + foxesCount);
        System.out.println("Bears count: " + bearsCount);
        System.out.println("Eagles count: " + eaglesCount);
    }

    public static void printHerbivoreStatistics(IslandModel islandModel) {
        int horsesCount = 0;
        int deersCount = 0;
        int rabbitsCount = 0;
        int mousesCount = 0;
        int goatsCount = 0;
        int sheepsCount = 0;
        int boarsCount = 0;
        int buffalosCount = 0;
        int ducksCount = 0;
        int caterpillarsCount = 0;

        for (Location[] row : islandModel.getIsland()) {
            for (Location location : row) {
                horsesCount = (int) location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Horse).count();
                deersCount = (int) (deersCount + location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Deer).count());
                rabbitsCount = (int) (rabbitsCount + location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Rabbit).count());
                mousesCount = (int) (mousesCount + location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Mouse).count());
                goatsCount = (int) (goatsCount + location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Goat).count());
                sheepsCount = (int) (sheepsCount + location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Sheep).count());
                boarsCount = (int) (boarsCount + location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Boar).count());
                buffalosCount = (int) (buffalosCount + location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Buffalo).count());
                ducksCount = (int) (ducksCount + location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Duck).count());
                caterpillarsCount = (int) (caterpillarsCount + location.getHerbivoreList().stream().filter(herbivore -> herbivore instanceof Caterpillar).count());
            }
        }

        System.out.println("Herbivore Statistics: ");
        System.out.println("Horses count: " + horsesCount);
        System.out.println("Deers count: " + deersCount);
        System.out.println("Rabbits count: " + rabbitsCount);
        System.out.println("Mouses count: " + mousesCount);
        System.out.println("Goats count: " + goatsCount);
        System.out.println("Sheeps count: " + sheepsCount);
        System.out.println("Boars count: " + boarsCount);
        System.out.println("Buffalos count: " + buffalosCount);
        System.out.println("Ducks count: " + ducksCount);
        System.out.println("Caterpillars count: " + caterpillarsCount);
    }

    public static void printFloraStatistics(IslandModel islandModel) {
        int grassCount = 0;

        for (Location[] row : islandModel.getIsland()) {
            for (Location location : row) {
                grassCount = (int) (grassCount + location.getFloraList().stream().filter(flora -> flora instanceof Grass).count());
            }
        }

        System.out.println("Flora Statistics: ");
        System.out.println("Grass count: " + grassCount);
    }
}