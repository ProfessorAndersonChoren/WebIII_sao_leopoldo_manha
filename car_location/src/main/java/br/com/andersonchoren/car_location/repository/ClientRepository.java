package br.com.andersonchoren.car_location.repository;

import br.com.andersonchoren.car_location.model.ClientModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClientRepository implements IRepository<ClientModel>{
    private List<ClientModel> tClients = new ArrayList<>();

    @Override
    public boolean insert(ClientModel object) {
        return tClients.add(object);
    }

    @Override
    public List<ClientModel> findAll() {
        return null;
    }

    @Override
    public Optional<ClientModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean update(ClientModel object) {
        return false;
    }

    @Override
    public void delete(int position) {
        tClients.remove(position);
    }
    public ClientModel findByName(String name){
        return null;
    }
}
