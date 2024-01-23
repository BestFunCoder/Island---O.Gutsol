package com.island.islandModel;

import com.island.entity.biologicalOrganism.fauna.Fauna;
import com.island.entity.biologicalOrganism.flora.Flora;

import java.util.ArrayList;
import java.util.List;

public class Location {
        List<Fauna> faunaList;
        List<Flora> floraList;

        public Location() {
            faunaList = new ArrayList<>();
            floraList = new ArrayList<>();
        }

        public void addAnimal(Fauna animal) {
            faunaList.add(animal);
        }

        public void addPlant(Flora plant) {
        floraList.add(plant);
    }
}
