package com.example.springdata.entity

import com.example.springdata.entity.Employee
import javax.persistence.*

@Entity
@Table(name = "emails")
data class Email(

    @Id
    @GeneratedValue
    @Column(name = "id")
    var id: Long? = null,

    @Column
    var email: String,

    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "employee_ID")
    var employee: Employee? = null
){
    fun addEmployee(employee: Employee){
        this.employee = employee
    }
}