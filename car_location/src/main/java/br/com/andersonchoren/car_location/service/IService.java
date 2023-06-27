package br.com.andersonchoren.car_location.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IService<E> {
    public boolean insert(E object);
    public List<E> findAll();
    public Optional<E> findById(UUID id);
    public boolean update(E object);
    public void delete(int position);
}
