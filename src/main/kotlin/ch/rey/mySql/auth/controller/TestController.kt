package ch.rey.mySql.auth.controller

import ch.rey.mySql.auth.model.TestData
import ch.rey.mySql.auth.model.TestService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/mysql-api")
class TestController(val testService: TestService) {



    @PostMapping("/testdata")
    fun setData(@Valid @RequestBody testData:TestData):ResponseEntity<TestData>{
        val testData:TestData=testService.setData(testData)
        return ResponseEntity.ok(testData)
    }

    @GetMapping("/data")
    fun getAllData():List<TestData>{
        return testService.getAllTestData()
    }

    @PutMapping("/dataUpdate")
    @ResponseStatus(HttpStatus.OK)
    fun updateData(@Valid @RequestBody testData: TestData){
        testService.updateData(testData)
    }
}