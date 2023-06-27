package br.com.andersonchoren.car_location.repository;

import br.com.andersonchoren.car_location.model.LocationModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class LocationRepository implements IRepository<LocationModel> {
    private List<LocationModel> tLocations = new ArrayList<>();

    @Override
    public boolean insert(LocationModel object) {
        return tLocations.add(object);
    }

    @Override
    public List<LocationModel> findAll() {
        return tLocations;
    }

    @Override
    public Optional<LocationModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean update(LocationModel object) {
        return false;
    }

    @Override
    public void delete(int position) {
        tLocations.remove(position);
    }
}
