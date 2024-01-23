package com.island.islandModel;
import com.island.Initialize;


public class IslandModel {
    public int rows = 20;
    public int columns = 100;

    public void setRows(Initialize initialize) {
        this.rows = initialize.getRows();
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
