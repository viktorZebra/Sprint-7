package com.example.springdata.repository

import com.example.springdata.entity.Organisation
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OrganisationRepository : CrudRepository<Organisation, Long> {
}