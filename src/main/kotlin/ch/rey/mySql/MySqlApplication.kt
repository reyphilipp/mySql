package ch.rey.mySql

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication




@SpringBootApplication
@EnableEncryptableProperties
//@EncryptablePropertySource
class MySqlApplication

fun main(args: Array<String>) {
    runApplication<MySqlApplication>(*args)
    println("**** Philipp's CRUD Example!! ****")
}
