package com.example.tmsandroid

abstract class Person constructor( // знаю, что необязательно объявлять конструктор без модифакатора видимости
    val workerName: String,
    val position: String,
    val workExperience: Int,
    val isBlueWorker: Boolean
) {
    abstract fun workerInfo()
    abstract fun isBlueWorker()
    abstract fun isLoveJob()
}


open class Loader constructor(
    workerName: String,
    position: String,
    workExperience: Int,
    isBlueWorker: Boolean
) : Person(workerName, position, workExperience, isBlueWorker) {
    override fun workerInfo() {
        println("$workerName is $position, him work experience is: $workExperience years. ")
    }

    override fun isBlueWorker() {
        if (isBlueWorker) {
            print("He`s blue worker.")
        } else print("He`s white worker.")
    }

    override fun isLoveJob() {
        println(" He`s hate his job)))")
    }
}

open class Director(
    workerName: String,
    position: String,
    workExperience: Int,
    isBlueWorker: Boolean
) : Loader(workerName, position, workExperience, isBlueWorker) {
    override fun workerInfo() {
        println("$workerName is $position, him work experience is: $workExperience years. ")
    }

    override fun isBlueWorker() {
        if (isBlueWorker) {
            print("He`s blue worker.")
        } else print("He`s white worker.")
    }

    override fun isLoveJob() {
        println(" He`s love his job")
    }
}

fun main(){
    val loader = Loader("Sergey", "loader", 9, true)
    val director = Director("Archil", "Director", 25, false)

    loader.workerInfo()
    loader.isBlueWorker()
    loader.isLoveJob()
    println()
    director.workerInfo()
    director.isBlueWorker()
    director.isLoveJob()
}
