package com.tutorial.repositories

interface Repository<T> {
    suspend fun create(t: T): Int
    suspend fun update(t: T): Int
    suspend fun findOne(id: Int): T
    suspend fun find(bsq: String): List<T>
}