package ch.rey.mySql.auth.controller

import ch.rey.mySql.auth.model.ICrudRepository
import ch.rey.mySql.auth.model.TestData
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/crud")
class CrudController(val iCrudRepository: ICrudRepository) {
    @PostMapping
    fun saveEmployee(@RequestBody testData: TestData): TestData
    {
        return iCrudRepository.save(testData)
    }

    @GetMapping("/{id}")
    fun getEmployee(@PathVariable id: Long): Optional<TestData>
    {
        return iCrudRepository.findById(id)
    }

    @GetMapping
    fun getAllEmployees(): MutableIterable<TestData>
    {
        return iCrudRepository.findAll()
    }

    @PutMapping
    fun updateEmployee(@RequestBody testData: TestData)
    {
        iCrudRepository.save(testData)
    }

    @DeleteMapping("/{id}")
    fun deleteEmployee(@PathVariable id: Long)
    {
        iCrudRepository.deleteById(id)
    }
}