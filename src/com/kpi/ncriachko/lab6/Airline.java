package com.kpi.ncriachko.lab6;

import java.util.Arrays;

public class Airline {
    private Plane[] planes;
    public Airline(Plane ...planes) {
        this.planes = planes;
    }



    public Plane findPlaneThatFitsFuelConsumptionRange(int from, int to) {
        for (Plane plane : planes) {
            if (plane.getFuelConsumption() >= from &&
                plane.getFuelConsumption() < to) {
                return plane;
            }
        }
        return null;
    }
    public Plane[] sortByLiftRange() {
        Plane[] arr = new Plane[planes.length];
        System.arraycopy(planes, 0,arr,0,planes.length);
        Arrays.sort(arr);
        return arr;
    }
    public int getTotalPassengerCapacity() {
        int total = 0;
        for (Plane plane: planes) {
            total += plane.getPassengerCapacity();
        }
        return total;
    }

    public int getTotalLiftingCapacity() {
        int total = 0;
        for (Plane plane: planes) {
            total += plane.getLiftingCapacity();
        }
        return total;
    }
}
