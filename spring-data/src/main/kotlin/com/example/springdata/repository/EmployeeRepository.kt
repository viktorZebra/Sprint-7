package com.example.springdata.repository

import com.example.springdata.entity.Employee
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : CrudRepository<Employee, Long> {
    fun findByName(name: String): List<Employee>
}