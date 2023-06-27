package br.com.andersonchoren.car_location.repository;

import br.com.andersonchoren.car_location.model.VehicleModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class VehicleRepository implements IRepository<VehicleModel>{
    private List<VehicleModel> tVehicles = new ArrayList<>();

    @Override
    public boolean insert(VehicleModel object) {
        return tVehicles.add(object);
    }

    @Override
    public List<VehicleModel> findAll() {
        return tVehicles;
    }

    @Override
    public Optional<VehicleModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean update(VehicleModel object) {
        return false;
    }

    @Override
    public void delete(int position) {
        tVehicles.remove(position);
    }

    public VehicleModel findByPlate(String plate){
        return null;
    }
}
