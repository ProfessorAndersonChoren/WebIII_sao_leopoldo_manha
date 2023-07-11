package br.com.andersonchoren.car_location.controller;

import br.com.andersonchoren.car_location.dto.ClientDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @PostMapping
    public boolean insert(@RequestBody ClientDTO client){
        return false;
    }
    @GetMapping
    public List<ClientDTO> findAll(){
        return null;
    }
    @GetMapping("/{id}")
    public ClientDTO findById(@PathVariable("id") int id){
        return null;
    }
    @PutMapping
    public boolean update(@RequestBody ClientDTO client){return false;}
}
