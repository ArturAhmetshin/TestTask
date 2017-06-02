package ru.testtask.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.testtask.domain.Employee;

/**
 * Created by Artur on 01.06.2017.
 */
@Repository
public interface EmployeeRepositoty extends JpaRepository<Employee, Long> {

}
