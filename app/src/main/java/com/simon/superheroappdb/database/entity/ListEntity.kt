package com.simon.superheroappdb.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.simon.superheroappdb.SuperheroItemResponse

@Entity(tableName = "list_table")
data class ListEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "image") val image: String
)

fun SuperheroItemResponse.toDatabase() = ListEntity(name = name, image = superheroImage.url)