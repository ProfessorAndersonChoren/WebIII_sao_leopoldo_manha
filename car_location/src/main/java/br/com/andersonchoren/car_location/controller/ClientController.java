package br.com.andersonchoren.car_location.controller;

import br.com.andersonchoren.car_location.dto.ClientDTO;
import br.com.andersonchoren.car_location.model.ClientModel;
import br.com.andersonchoren.car_location.service.ClientService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }
    @PostMapping
    public boolean insert(@RequestBody ClientDTO client) {
        var clientModel = new ClientModel();
        BeanUtils.copyProperties(client,clientModel);
        return clientService.insert(clientModel);
    }

    @GetMapping
    public List<ClientDTO> findAll() {
        List<ClientDTO> clients = new ArrayList<>();
        clientService.findAll().forEach(model -> {
            var dto = new ClientDTO();
            BeanUtils.copyProperties(model,dto);
            clients.add(dto);
        });
        return clients;
    }

    @GetMapping("/{id}")
    public ClientDTO findById(@PathVariable("id") UUID id) {
        var result = clientService.findById(id);
        if(result.isEmpty())
            return null;

        var clientDTO = new ClientDTO();
        var clientModel = result.get();
        BeanUtils.copyProperties(clientModel,clientDTO);
        return clientDTO;
    }

    @PutMapping
    public boolean update(@RequestBody ClientDTO client) {
        return false;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){

    }
}
