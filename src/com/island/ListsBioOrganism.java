package com.island;
import com.island.biologicalOrganism.fauna.Fauna;
import com.island.biologicalOrganism.fauna.herbivore.Herbivore;
import com.island.biologicalOrganism.fauna.predator.Predator;
import com.island.biologicalOrganism.flora.Flora;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListsBioOrganism {

    private static  List<Class<? extends Herbivore>> HERBIVORE_TYPES;
    private static  List<Class<? extends Predator>> PREDATOR_TYPES;
    private static  List<Class<? extends Flora>> FLORA_TYPES;


    static {
        try {
            Set<Class<?>> herbivoreClasses = ClassFinder.find("com.island.biologicalOrganism.fauna.herbivore");
            HERBIVORE_TYPES = ClassFilter.filterConcreteClasses(herbivoreClasses, Herbivore.class);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Помилка при ініціалізації HERBIVORE_TYPES", e);
        }
    }

    static {
        try {
            Set<Class<?>> predatorClasses = ClassFinder.find("com.island.biologicalOrganism.fauna.predator");
            PREDATOR_TYPES = ClassFilter.filterConcreteClasses(predatorClasses, Predator.class);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Помилка при ініціалізації PREDATOR_TYPES", e);
        }
    }

    static {
        try {
            Set<Class<?>> floraClasses = ClassFinder.find("com.island.biologicalOrganism.flora");
            FLORA_TYPES = ClassFilter.filterConcreteClasses(floraClasses, Flora.class);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Помилка при ініціалізації FLORA_TYPES", e);
        }
    }
    public static Class<? extends Fauna> getHerbivoreTypes() {
        return HERBIVORE_TYPES;
    }

    public static Class<? extends Fauna> getPredatorTypes() {
        return PREDATOR_TYPES;
    }

    public static Class<? extends Flora> getFloraTypes() {
        return FLORA_TYPES;
    }


    public class ClassFilter {
        public static <T> List<Class<? extends T>> filterConcreteClasses(Set<Class<?>> classes, Class<T> superClass) {
            return classes.stream()
                    .filter(clazz -> !clazz.isInterface() && !clazz.isEnum() && !clazz.isAnnotation() && !java.lang.reflect.Modifier.isAbstract(clazz.getModifiers()))
                    .filter(superClass::isAssignableFrom)
                    .map(clazz -> (Class<? extends T>) clazz)
                    .collect(Collectors.toList());
        }
    }
}