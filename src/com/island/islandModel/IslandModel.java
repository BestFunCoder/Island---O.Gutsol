package com.island.islandModel;

import com.island.Initialize;

import java.util.Properties;


public class IslandModel {

            private Location[][] island;

            public IslandModel() {
                initializeIsland();
            }

            // Геттер та сеттер для поля класу IslandModel
            public Location[][] getIsland() {
                return island;
            }

            public void setIsland(Location[][] island) {
                this.island = island;
            }

            // Метод для ініціалізації острова та розміщення об'єктів Location в кожній комірці
            public void initializeIsland() {
                int rows = 20;  // Замініть на ваші потреби
                int columns = 100;  // Замініть на ваші потреби

                island = new Location[rows][columns];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        island[i][j] = new Location();
                    }
                }
            }


        }