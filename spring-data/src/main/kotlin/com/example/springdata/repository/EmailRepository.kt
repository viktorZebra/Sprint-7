package com.example.springdata.repository

import com.example.springdata.entity.Email
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EmailRepository : CrudRepository<Email, Long> {
}