package com.example.springdata

import com.example.springdata.entity.Employee
import com.example.springdata.repository.EmailRepository
import com.example.springdata.repository.EmployeeRepository
import com.example.springdata.repository.OrganisationRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataApplication(
    private val employeeRepository: EmployeeRepository,
    private val organisationRepository: OrganisationRepository,
    private val emailRepository: EmailRepository

) : CommandLineRunner {
    override fun run(vararg args: String?) {
        val employee1 = Employee(name = "ivan", salary = 10000)
        val employee2 = Employee(name = "max", salary = 2362)
        val employee3 = Employee(name = "kirill", salary = 4574854)
        val employee4 = Employee(name = "dim", salary = 1246426)

        employeeRepository.saveAll(listOf(employee1, employee2, employee3, employee4))

        val found = employeeRepository.findByName("ivan")
        println(found)

        val resultAll = employeeRepository.findAll()
        println(resultAll)
    }
}

fun main(args: Array<String>) {
    runApplication<SpringDataApplication>(*args)
}
