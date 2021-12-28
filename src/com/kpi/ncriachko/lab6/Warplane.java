package com.kpi.ncriachko.lab6;

public class Warplane extends Plane{
    private boolean hasStealth;
    private String militaryEquipmentType;
    private int ammunitionAmount;

    public Warplane(String name, int passengerCapacity, double liftingCapacity, double fuelConsumption,
                    boolean hasStealth, String militaryEquipmentType, int ammunitionAmount) {
        super(name, passengerCapacity, liftingCapacity, fuelConsumption);
    }

    public boolean isHasStealth() {
        return hasStealth;
    }

    public String getMilitaryEquipmentType() {
        return militaryEquipmentType;
    }

    public int getAmmunitionAmount() {
        return ammunitionAmount;
    }

    public void setHasStealth(boolean hasStealth) {
        this.hasStealth = hasStealth;
    }

    public void setMilitaryEquipmentType(String militaryEquipmentType) {
        this.militaryEquipmentType = militaryEquipmentType;
    }

    public void setAmmunitionAmount(int ammunitionAmount) {
        this.ammunitionAmount = ammunitionAmount;
    }
}
