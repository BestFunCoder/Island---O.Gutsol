package com.island.islandModel;

import com.island.Initialize;


public class IslandModel {
    public int rows = 0;
    public int columns = 0;

    public IslandModel(Initialize initialize) {
    }

    public void initIsland() {

        Location[][] island = new Location[rows][columns];

        // Ініціалізація острова
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                island[i][j] = new Location();

               /* // Додавання рослин і тварин для початку
                island[i][j].addPlant(new Fauna());
                island[i][j].addAnimal(new Flora()); */
            }
        }
    }
}
