package com.example.springdata.entity

import javax.persistence.*

@Entity
@Table(name = "organisations")
data class Organisation(
    @Id
    @GeneratedValue
    @Column(name = "id")
    var id: Long? = null,

    @Column
    var name: String,

    @Column
    var address: String
)