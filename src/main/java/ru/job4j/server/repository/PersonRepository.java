package ru.job4j.server.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.server.domain.Person;


public interface PersonRepository extends CrudRepository<Person, Integer> {
}
