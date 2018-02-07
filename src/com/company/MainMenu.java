package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void createCar() {


        System.out.println("What kind of car would you like to create?");
        System.out.println("1 Custom Car \n2.Ready to go \n3.Exit ");

        try {
            switch (input.nextInt()) {

                case 1:
                    Car car = new Car();
                    car.getCarInfo();
                    menu(car);
                    break;
                case 2:
                    Corvette corvette = new Corvette(2018, "Corvette", "Z06", 0, 100, " Black");
                    corvette.getCorvetteInfo();
                    menu(corvette);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
                    createCar();


            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("please enter a number between 1 and 4.");
            createCar();
        }
    }


    public void menu(Car car) {
        System.out.println("What would you like to do with the " + car.getMake() + " " + car.getModel() + "?");
        System.out.println("1.Accelerate \n2.Decelerate \n3.Fill up with gas \n4.Exit ");

        try {
            switch (input.nextInt()) {

                case 1:
                    car.driveCar(car);
                    break;
                case 2:
                    car.StopCar(car);
                    break;
                case 3:
                    car.addGas(car);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
                    menu(car);


            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("please enter a number between 1 and 4.");
            menu(car);
        }
        MainMenu mainMenu = new MainMenu();
        mainMenu.menu(car);
    }

}
