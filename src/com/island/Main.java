package com.island;

import com.island.islandModel.IslandModel;
import com.island.simulation.StatisticsManager;

import static com.island.simulation.SimulationManager.performTurns;

public class Main {
    public static void main(String[] args) {
        Accost accost = new Accost();
        Initialize initialize = accost.accost();



        // Ініціалізуємо острів та встановлюємо тварини
        IslandModel islandModel = new IslandModel();


        StatisticsManager.printAllStatistics(islandModel);

        // Викликаємо логіку тактів
        performTurns(islandModel, 10);

    }
}