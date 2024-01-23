package com.island;

import com.island.islandModel.IslandModel;

public class Main {
    public static void main(String[] args) {
        Accost accost = new Accost();
        Initialize initialize = accost.accost();

        IslandModel islandModel= new IslandModel();
        islandModel.setRows(initialize);


    }
}