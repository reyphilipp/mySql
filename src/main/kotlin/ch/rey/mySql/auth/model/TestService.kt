package ch.rey.mySql.auth.model

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class TestService(@Autowired val repository: ITestRepository) {

    fun setData(testData:TestData):TestData{
        repository.save(testData)
        return testData
    }

    fun getAllTestData():List<TestData>{
        return repository.findAll().toList()
    }

    fun updateData(testData: TestData):TestData{
        repository.save(testData)
        return testData
    }
}