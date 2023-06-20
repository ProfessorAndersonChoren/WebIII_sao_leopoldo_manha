package br.com.andersonchoren.car_location.model;

import java.time.LocalDate;
import java.util.UUID;

public class LocationModel {
    private UUID id;
    private LocalDate leaseDate;
    private LocalDate returnDate;
    private ClientModel client;
    private EmployeeModel employee;
    private VehicleModel vehicle;
    private float cost;
}
