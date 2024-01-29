package com.island.islandModel;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
       /* private static final String CONFIG_FILE_PATH = "com/island/islandModel/config.properties";

        private Properties properties;

        public ConfigReader() {
            properties = new Properties();
            try (FileInputStream input = new FileInputStream(CONFIG_FILE_PATH)) {
                properties.load(input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        private Properties properties;

        public ConfigReader() {
                try {
                        // Отримуємо InputStream для config.properties
                        InputStream inputStream = getClass().getResourceAsStream("config.properties");

                        // Завантажуємо властивості з InputStream
                        properties = new Properties();
                        properties.load(inputStream);
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }



        public int getMaxWolf() {
            return Integer.parseInt(properties.getProperty("maxWolf", "0"));
        }

        public int getMaxBoa() {
            return Integer.parseInt(properties.getProperty("maxBoa", "0"));
        }

        public int getMaxFox() {
            return Integer.parseInt(properties.getProperty("maxFox", "0"));
        }

        public int getMaxBear() {
        return Integer.parseInt(properties.getProperty("maxBear", "0"));
        }
        public int getMaxEagle() {
        return Integer.parseInt(properties.getProperty("maxEagle", "0"));
        }
        public int getMaxHorse() {
        return Integer.parseInt(properties.getProperty("maxHorse", "0"));
        }

        public int getMaxDeer() {
        return Integer.parseInt(properties.getProperty("maxDeer", "0"));
        }

        public int getMaxRabbit() {
        return Integer.parseInt(properties.getProperty("maxRabbit", "0"));
        }
        public int getMaxMouse() {
        return Integer.parseInt(properties.getProperty("maxMouse", "0"));
        }
        public int getMaxGoat() {
        return Integer.parseInt(properties.getProperty("maxGoat", "0"));
        }
        public int getMaxSheep() {
        return Integer.parseInt(properties.getProperty("maxSheep", "0"));
        }

        public int getMaxBoar() {
        return Integer.parseInt(properties.getProperty("maxBoar", "0"));
        }

        public int getMaxBuffalo() {
        return Integer.parseInt(properties.getProperty("maxBuffalo", "0"));
        }

        public int getMaxDuck() {
        return Integer.parseInt(properties.getProperty("maxDuck", "0"));
        }

        public int getMaxCaterpillar() {
        return Integer.parseInt(properties.getProperty("maxCaterpillar", "0"));
        }

        public int getMaxGrass() {
        return Integer.parseInt(properties.getProperty("maxGrass", "0"));
        }

}