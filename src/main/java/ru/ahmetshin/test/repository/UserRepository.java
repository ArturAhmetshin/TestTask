package ru.ahmetshin.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ahmetshin.test.domain.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}
