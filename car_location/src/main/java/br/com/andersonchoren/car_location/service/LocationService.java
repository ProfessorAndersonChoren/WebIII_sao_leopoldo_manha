package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.LocationModel;
import br.com.andersonchoren.car_location.repository.LocationRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class LocationService implements IService<LocationModel>{
    private LocationRepository locationRepository;

    public LocationService(){
        locationRepository = new LocationRepository();
    }

    @Override
    public boolean insert(LocationModel object) {
        // TODO Validar os dados
        return locationRepository.insert(object);
    }

    @Override
    public List<LocationModel> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public Optional<LocationModel> findById(UUID id) {
        // TODO Validar os dados
        return locationRepository.findById(id);
    }

    @Override
    public boolean update(LocationModel object) {
        // TODO Validar os dados
        return locationRepository.update(object);
    }

    @Override
    public void delete(int position) {
        // TODO Validar os dados
        locationRepository.delete(position);
    }
}
