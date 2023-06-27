package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.VehicleModel;
import br.com.andersonchoren.car_location.repository.VehicleRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class VehicleService implements IService<VehicleModel>{
    private VehicleRepository vehicleRepository;

    public VehicleService(){
        vehicleRepository = new VehicleRepository();
    }

    @Override
    public boolean insert(VehicleModel object) {
        // TODO Validar os dados
        return vehicleRepository.insert(object);
    }

    @Override
    public List<VehicleModel> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<VehicleModel> findById(UUID id) {
        // TODO Validar os dados
        return vehicleRepository.findById(id);
    }

    @Override
    public boolean update(VehicleModel object) {
        // TODO Validar os dados
        return vehicleRepository.update(object);
    }

    @Override
    public void delete(int position) {
        // TODO Validar os dados
        vehicleRepository.delete(position);
    }
}
