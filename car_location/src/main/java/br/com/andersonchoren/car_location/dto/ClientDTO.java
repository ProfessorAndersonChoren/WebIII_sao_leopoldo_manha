package br.com.andersonchoren.car_location.dto;

import br.com.andersonchoren.car_location.model.LocationModel;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class ClientDTO {
    private UUID id;
    private String name;
    private String phone;
    private String email;
    private LocalDate birthday;
    private List<LocationModel> locations;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<LocationModel> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationModel> locations) {
        this.locations = locations;
    }
}
