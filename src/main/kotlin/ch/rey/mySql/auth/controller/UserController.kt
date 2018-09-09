package ch.rey.mySql.auth.controller

import ch.rey.mySql.auth.model.AuthService
import ch.rey.mySql.auth.model.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/mysql-api")
class UserController(val authService: AuthService) {
    @PostMapping("/registration")
    fun registerUser(@Valid @RequestBody user: User):ResponseEntity<User>{
        val user:User=authService.registUser(user)
        return ResponseEntity.ok(user)


    }

    @GetMapping("/users")
    fun getAllUsers():List<User>{
        return authService.getAllUsers()
    }


    //test mit Int
    @GetMapping("/int")
    fun getInt():Int{
        return 6
    }
}