package com.simon.superheroappdb.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.simon.superheroappdb.database.entity.DetailEntity

@Dao
interface DetailDao {
    @Query("SELECT * FROM detail_table ORDER BY id DESC")
    suspend fun getAllQuotes():List<DetailEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(quotes:List<DetailEntity>)

    @Query("DELETE FROM detail_table")
    suspend fun deleteAllQuotes()
}