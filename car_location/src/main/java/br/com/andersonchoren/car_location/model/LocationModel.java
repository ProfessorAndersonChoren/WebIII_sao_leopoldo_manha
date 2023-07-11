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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getLeaseDate() {
        return leaseDate;
    }

    public void setLeaseDate(LocalDate leaseDate) {
        this.leaseDate = leaseDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public EmployeeModel getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employee = employee;
    }

    public VehicleModel getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleModel vehicle) {
        this.vehicle = vehicle;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
