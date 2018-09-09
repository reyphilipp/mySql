package ch.rey.mySql.auth.model

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ITestRepository : JpaRepository<TestData, Long>