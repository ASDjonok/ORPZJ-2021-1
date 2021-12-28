package com.kpi.ncriachko.lab7;

import com.kpi.ncriachko.lab6.Airfreighter;
import com.kpi.ncriachko.lab6.Plane;
import com.kpi.ncriachko.lab6.Warplane;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CustomList<Plane> planes = new CustomList<>();

        planes.add(new Airfreighter("kekw", 2, 650000,1900, "Clothes",
                54342343, "tail hatch"));
        planes.add(new Airfreighter("mria", 3, 780000,1800, "Animals",
                77777777, "side hatch"));
        planes.add(new Airfreighter("peepo", 2, 500000,2000, "Ammunition",
                87464656, "side hatch"));
        planes.add( new Warplane("steatlh", 75, 96000,650,
                true, "rockets", 456));
        planes.add(new Warplane("Noted", 25, 77000,850,
                false, "laser", 100));
        planes.add(new Warplane("f1ask0", 40, 56000,777,
                false, "machine gun", 55));
        planes.add(new Warplane("D:", 120, 99900,753,
                true, "None", 0));


        for (Object plane : planes) {
            System.out.println(plane);
        }

        Iterator itr = planes.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
