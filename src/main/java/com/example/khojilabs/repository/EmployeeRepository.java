/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.khojilabs.repository;


import com.example.khojilabs.tables.Employee;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Service;

/**
 *
 * @author Valame
 */
@Service
public interface EmployeeRepository extends CrudRepository<Employee, Long> {


}
