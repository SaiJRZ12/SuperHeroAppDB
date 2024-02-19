package com.simon.superheroappdb.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.simon.superheroappdb.database.entity.ListEntity

@Dao
interface ListDao {
    @Query("SELECT * FROM list_table")
    suspend fun getAllQuotes():List<ListEntity>

    @Query("SELECT * FROM list_table WHERE name LIKE :query")
    suspend fun getnames(query: String):List<ListEntity>

    @Query("SELECT * FROM list_table WHERE id LIKE :id")
    suspend fun getid(id: Int):List<ListEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(quotes:List<ListEntity>)

    @Query("DELETE FROM list_table")
    suspend fun deleteAllQuotes()
}
