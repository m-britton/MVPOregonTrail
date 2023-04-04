package com.example.mvpfororegontrail;

public class Wagon {
    private int food;
    private int clothing;
    private int weapons;
    private int oxen;
    private int spareWagonWheel;
    private int spareWagonAxel;
    private int spareWagonTongues;
    private int medicalSupplyBox;
    private int sewingKit;
    private int fireStartingKit;
    private int kidsToys;
    private int familyKeepsakes;
    private int seedPackages;
    private int shovel;
    private int cookingItems;

    public Wagon(){}

    public Wagon(int food, int clothing, int weapons, int oxen, int spareWagonWheel, int spareWagonAxel, int spareWagonTongues, int medicalSupplyBox, int sewingKit, int fireStartingKit, int kidsToys, int familyKeepsakes, int seedPackages, int shovel, int cookingItems) {
        this.food = food;
        this.clothing = clothing;
        this.weapons = weapons;
        this.oxen = oxen;
        this.spareWagonWheel = spareWagonWheel;
        this.spareWagonAxel = spareWagonAxel;
        this.spareWagonTongues = spareWagonTongues;
        this.medicalSupplyBox = medicalSupplyBox;
        this.sewingKit = sewingKit;
        this.fireStartingKit = fireStartingKit;
        this.kidsToys = kidsToys;
        this.familyKeepsakes = familyKeepsakes;
        this.seedPackages = seedPackages;
        this.shovel = shovel;
        this.cookingItems =cookingItems;
    }


    //Setters
    public void setFood(int food) {
        this.food = food;
    }

    public void setClothing(int clothing) {
        this.clothing = clothing;
    }

    public void setWeapons(int weapons) {
        this.weapons = weapons;
    }

    public void setOxen(int oxen) {
        this.oxen = oxen;
    }

    public void setSpareWagonWheel(int spareWagonWheel) {
        this.spareWagonWheel = spareWagonWheel;
    }

    public void setSpareWagonAxel(int spareWagonAxel) {
        this.spareWagonAxel = spareWagonAxel;
    }

    public void setSpareWagonTongues(int spareWagonTongues) {
        this.spareWagonTongues = spareWagonTongues;
    }

    public void setMedicalSupplyBox(int medicalSupplyBox) {
        this.medicalSupplyBox = medicalSupplyBox;
    }

    public void setSewingKit(int sewingKit) {
        this.sewingKit = sewingKit;
    }

    public void setFireStartingKit(int fireStartingKit) {
        this.fireStartingKit = fireStartingKit;
    }

    public void setKidsToys(int kidsToys) {
        this.kidsToys = kidsToys;
    }

    public void setFamilyKeepsakes(int familyKeepsakes) {
        this.familyKeepsakes = familyKeepsakes;
    }

    public void setSeedPackages(int seedPackages) {
        this.seedPackages = seedPackages;
    }

    public void setShovel(int shovel) {
        this.shovel = shovel;
    }

    public void setCookingItems(int cookingItems) {
        this.cookingItems = cookingItems;
    }


    //Getters
    public int getFood() {
        return food;
    }

    public int getClothing() {
        return clothing;
    }

    public int getWeapons() {
        return weapons;
    }

    public int getOxen() {
        return oxen;
    }

    public int getSpareWagonWheel() {
        return spareWagonWheel;
    }

    public int getSpareWagonAxel() {
        return spareWagonAxel;
    }

    public int getSpareWagonTongues() {
        return spareWagonTongues;
    }

    public int getMedicalSupplyBox() {
        return medicalSupplyBox;
    }

    public int getSewingKit() {
        return sewingKit;
    }

    public int getFireStartingKit() {
        return fireStartingKit;
    }

    public int getKidsToys() {
        return kidsToys;
    }

    public int getFamilyKeepsakes() {
        return familyKeepsakes;
    }

    public int getSeedPackages() {
        return seedPackages;
    }

    public int getShovel() {
        return shovel;
    }

    public int getCookingItems() {
        return cookingItems;
    }


}
