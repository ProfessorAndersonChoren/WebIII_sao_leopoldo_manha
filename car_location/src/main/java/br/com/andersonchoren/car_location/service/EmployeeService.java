package br.com.andersonchoren.car_location.service;

import br.com.andersonchoren.car_location.model.EmployeeModel;
import br.com.andersonchoren.car_location.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EmployeeService implements IService<EmployeeModel>{
    private EmployeeRepository employeeRepository;

    public EmployeeService(){
        employeeRepository = new EmployeeRepository();
    }

    @Override
    public boolean insert(EmployeeModel object) {
        return employeeRepository.insert(object);
    }

    @Override
    public List<EmployeeModel> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeModel> findById(UUID id) {
        return employeeRepository.findById(id);
    }

    @Override
    public boolean update(EmployeeModel object) {
        return employeeRepository.update(object);
    }

    @Override
    public void delete(int position) {
        employeeRepository.delete(position);
    }
}
