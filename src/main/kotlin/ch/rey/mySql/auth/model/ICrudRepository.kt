package ch.rey.mySql.auth.model

import org.springframework.data.repository.CrudRepository

interface ICrudRepository : CrudRepository<TestData, Long> {
}