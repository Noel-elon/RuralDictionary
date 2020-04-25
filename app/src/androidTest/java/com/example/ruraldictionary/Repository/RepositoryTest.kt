package com.example.ruraldictionary.Repository

import org.junit.Assert.*
import org.junit.Test

class RepositoryTest {

    @Test
    fun testReponse(){
        val repository = Repository()
        val response = repository.getWordObject()

        assertNotEquals(response, null)


    }

}