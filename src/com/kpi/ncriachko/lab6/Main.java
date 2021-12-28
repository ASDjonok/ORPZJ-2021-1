package com.kpi.ncriachko.lab6;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline(

                new Airfreighter("kekw", 2, 650000,1900, "Clothes",
                        54342343, "tail hatch"),
                new Airfreighter("mria", 3, 780000,1800, "Animals",
                        777777777, "side hatch"),
                new Airfreighter("peepo", 2, 500000,2000, "Ammunition",
                        874646756, "side hatch"),

                new Warplane("steatlh", 75, 96000,650,
                        true, "rockets", 456),
                new Warplane("Noted", 25, 77000,850,
                        false, "laser", 100),
                new Warplane("f1ask0", 40, 56000,777,
                        false, "machine gun", 55),
                new Warplane("D:", 120, 99900,753,
                        true, "None", 0));

        System.out.println("Total lifting capacity: " + airline.getTotalLiftingCapacity());

        System.out.println("Find plane, which fuel consumption in this bounds [500;770]");
        System.out.println(airline.findPlaneThatFitsFuelConsumptionRange(500,770));

        System.out.println("Sorted list of planes by lift range: ");
        for (Plane plane : airline.sortByLiftRange()) {
            System.out.println(plane.toString());
        }


    }
}
