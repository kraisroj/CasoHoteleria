package com.Hotelera.persistance.crud;

import com.Hotelera.persistance.entity.Habitacion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HabitacionCrudRepository extends CrudRepository<Habitacion, Integer> {


}
