package ru.ahmetshin.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ahmetshin.test.domain.Roles;

@Repository
public interface RoleRepository extends CrudRepository<Roles, Long>{
}
