package com.simon.superheroappdb.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.simon.superheroappdb.database.dao.DetailDao
import com.simon.superheroappdb.database.dao.ListDao
import com.simon.superheroappdb.database.entity.DetailEntity
import com.simon.superheroappdb.database.entity.ListEntity

@Database(entities = [ListEntity::class, DetailEntity::class], version = 1)
abstract class SuperHeroDatabase: RoomDatabase() {

    abstract fun getListDao(): ListDao
    abstract fun getDetailDao(): DetailDao
}
