package ru.testtask.dao;

import ru.testtask.domain.Employee;

/**
 * Created by Artur on 01.06.2017.
 */
public interface EmployeeDao {
    public void addemployee (Employee employee);
    public void updateemployee (Employee employee);
    public void deleteemployee (Employee employee);
}
