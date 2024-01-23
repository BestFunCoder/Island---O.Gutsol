package com.island;

import java.util.Scanner;

public class Accost {
    Scanner scanner = new Scanner(System.in);
    Initialize initial = new Initialize();

    public Initialize accost(){
        System.out.println("""
                === Вітаю в симуляторі "Island" ! ===
                Даний симулятор імітує життя тварин на острові.
                Для початку пропоную обрати режим або із дефолтними налаштуваннями,
                або з кастомними налаштуваннями розміру острова та кількістю тварин.
                 Зроби свій вибір, натисни відповідну цифру та "Enter"
                 1. З дефолтними значеннями.
                 2. З кастомними налаштуваннями.
                 """);
        int numChoice = choice();
            if (numChoice == 2){
                System.out.println("""
                        Зроби свій вибір,натисни відповідну цифру та "Enter"
                        (Вибір іншої цифри запустить острів з дефолтними налаштуваннями)
                        1. Вказуємо розміри острова та кількість тварин.
                        2. Вказуємо лише розмір острова.
                        3. Вказуємо лише кількість тварин.
                        """);
                numChoice = choice();
                if (numChoice == 1){
                    setIsland();
                    setBioOrganizm();
                } else if (numChoice == 2) {
                    setIsland();
                } else if (numChoice == 3) {
                    setBioOrganizm();
                }
            }

        // Завершення роботи Scanner
        scanner.close();
            return initial;
    }

    private int choice(){
        // Перевіряємо, чи користувач ввів цифру
        while (!scanner.hasNextInt()) {
            System.out.print("Будь ласка, введіть цифру: ");
            scanner.next(); // зчитуємо неправильне значення, щоб уникнути зациклення
        }
        int number = scanner.nextInt();
        System.out.println("Ви ввели цифру: " + number);
        return number;
    }
     private void setIsland(){
        System.out.println(" Введіть кількість рядків поля (10-1000) ");
        initial.setRows(choice());
        System.out.println(" Введіть кількість колонок поля (10-1000)");
        initial.setColumns(choice());
    }
    private void setBioOrganizm(){
        System.out.println(" Введіть кількість особин коней (10-40.000) ");
        initial.setHorsePopulation(choice());
        System.out.println(" Введіть кількість особин оленів (10-40.000) ");
        initial.setDeerPopulation(choice());
        System.out.println(" Введіть кількість особин кролів (10-300.000) ");
        initial.setRabbitPopulation(choice());
        System.out.println(" Введіть кількість особин мишей (10-1.000.000) ");
        initial.setMousePopulation(choice());
        System.out.println(" Введіть кількість особин кіз (10-280.000) ");
        initial.setGoatPopulation(choice());
        System.out.println(" Введіть кількість особин овець (10-280.000) ");
        initial.setSheepPopulation(choice());
        System.out.println(" Введіть кількість особин кабанів (10-100.000) ");
        initial.setBoarPopulation(choice());
        System.out.println(" Введіть кількість особин буйволів (10-20.000) ");
        initial.setBuffaloPopulation(choice());
        System.out.println(" Введіть кількість особин качок (10-400.000) ");
        initial.setDuckPopulation(choice());
        System.out.println(" Введіть кількість особин гусениць (10-2.000.000) ");
        initial.setCaterpillarPopulation(choice());
        System.out.println(" Введіть кількість особин вовків (10-60.000) ");
        initial.setWolfPopulation(choice());
        System.out.println(" Введіть кількість особин удавів (10-60.000) ");
        initial.setGoaPopulation(choice());
        System.out.println(" Введіть кількість особин лис (10-60.000) ");
        initial.setFoxPopulation(choice());
        System.out.println(" Введіть кількість особин ведмедів (10-10.000) ");
        initial.setBearPopulation(choice());
        System.out.println(" Введіть кількість особин орлів (10-40.000) ");
        initial.setEaglePopulation(choice());
        System.out.println(" Введіть кількість рослин (10-400.000) ");
        initial.setGrassPopulation(choice());
    }
}