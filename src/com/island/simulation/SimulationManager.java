package com.island.simulation;

import com.island.islandModel.IslandModel;

public class SimulationManager {


    public static void performTurns(IslandModel islandModel, int numOfTurns) {
        for (int turn = 1; turn <= numOfTurns; turn++) {
            System.out.println("=== Turn " + turn + " ===");

            // Виклик методу для виконання одного такту в кожній локації
           // islandModel.forEachLocation(location -> location.performTurn());

            // Додайте інші логічні етапи такту (розмноження, переміщення і т. д.)
        }
    }

   }
