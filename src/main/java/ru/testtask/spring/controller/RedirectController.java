package ru.testtask.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.testtask.spring.repository.EmployeeRepositoty;

/**
 * Created by Artur on 01.06.2017.
 */
@Controller
public class RedirectController {
    @Autowired
    private EmployeeRepositoty employeeRepositoty;


}
