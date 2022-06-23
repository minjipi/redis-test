package com.minji.redistest.repository;

import com.minji.redistest.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRedisRepository extends CrudRepository<Person, String> {
}