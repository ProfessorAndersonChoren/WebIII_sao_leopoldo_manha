package br.com.andersonchoren.car_location.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IRepository<E> {
    public boolean insert(E object);
    public List<E> findAll();
    public Optional<E> findById(UUID id);
    public boolean update(E object);
    public void delete(int position);
}
