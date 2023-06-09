package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.ClientModel;
import br.com.andersonchoren.car_location.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ClientService implements IService<ClientModel>{
    private ClientRepository clientRepository;

    public ClientService(){
        clientRepository = new ClientRepository();
    }

    @Override
    public boolean insert(ClientModel object) {
        return clientRepository.insert(object);
    }

    @Override
    public List<ClientModel> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<ClientModel> findById(UUID id) {
        if(id == null)
            return Optional.empty();
        return clientRepository.findById(id);
    }

    @Override
    public boolean update(ClientModel object) {
        return clientRepository.update(object);
    }

    @Override
    public void delete(int position) {
        clientRepository.delete(position);
    }
}
