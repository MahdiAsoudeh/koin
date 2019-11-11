package com.mahdi20.koin


interface HelloRepository {

    fun giveHello(): String

}


class HelloRepositoryImpl() : HelloRepository {

    override fun giveHello() = "Hello Koin I Am Mahdi"

}


