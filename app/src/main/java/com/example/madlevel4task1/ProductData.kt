package com.example.madlevel4task1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reminderTable")
data class ProductData(

    @ColumnInfo(name = "name")
    var productName: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null,

    @ColumnInfo(name = "quantity")
    var productQuantity: Int

)