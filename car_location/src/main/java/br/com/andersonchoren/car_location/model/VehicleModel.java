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
}
