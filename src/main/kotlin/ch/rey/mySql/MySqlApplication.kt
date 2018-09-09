package ch.rey.mySql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MySqlApplication

fun main(args: Array<String>) {
    runApplication<MySqlApplication>(*args)
}
