package com.ex.datademo.dao;

import com.ex.datademo.model.Droid;
import com.ex.datademo.model.DroidType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DroidRepo extends CrudRepository<Droid, Integer> {

    List<Droid> findAllByDroidType(DroidType type);

    Optional<Droid> findByName(String name);


}
