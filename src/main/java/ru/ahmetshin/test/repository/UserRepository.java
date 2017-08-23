package ru.ahmetshin.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ahmetshin.test.domain.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

}
