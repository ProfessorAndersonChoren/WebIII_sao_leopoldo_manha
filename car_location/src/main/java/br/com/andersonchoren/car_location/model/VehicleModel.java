package br.com.andersonchoren.car_location.model;

import java.util.List;
import java.util.UUID;

public class VehicleModel {
    public UUID id;
    public String plate;
    public String model;
    public String brand;
    public String color;
    public short ageProduction;
    public short ageModel;
    public int mileage;
    public List<LocationModel> locations;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getAgeProduction() {
        return ageProduction;
    }

    public void setAgeProduction(short ageProduction) {
        this.ageProduction = ageProduction;
    }

    public short getAgeModel() {
        return ageModel;
    }

    public void setAgeModel(short ageModel) {
        this.ageModel = ageModel;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public List<LocationModel> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationModel> locations) {
        this.locations = locations;
    }
}
