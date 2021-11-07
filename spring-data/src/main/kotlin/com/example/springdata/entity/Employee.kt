package com.example.springdata.entity

import javax.persistence.*

@Entity
@Table(name = "employee")
data class Employee(

    @Id
    @GeneratedValue
    @Column(name = "id")
    var id: Long? = null,

    @Column
    var name: String,

    @Column
    var salary: Int,

    @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.EAGER, mappedBy = "employee")
    var email: MutableList<Email> = mutableListOf(),

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organisations_ID")
    var organisation: Organisation? = null) {

    fun addEmail(email: Email){
        this.email.add(email)
    }

    fun addOrganisation(organisation: Organisation){
        this.organisation = organisation
    }

    override fun toString(): String {
        var emailString = ""

        for (email in email) {
            emailString += "[email=${email.email}] "
        }

        return "Employee(id=$id, name='$name', salary='$salary', organisation='$organisation', email='$emailString')"
    }
}