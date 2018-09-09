package ch.rey.mySql.auth.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank


@Entity
class TestData (
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        val id: Long = 0,


        val gpsData: Double =0.0,
        @get: NotBlank
        val gpslocal: String =""
)