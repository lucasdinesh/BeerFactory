package com.example.BeerFactory.repository;

import com.example.BeerFactory.model.BeerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends CrudRepository<BeerEntity, Long> {

}
