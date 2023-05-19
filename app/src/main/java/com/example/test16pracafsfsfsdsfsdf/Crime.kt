package com.example.test16pracafsfsfsdsfsdf
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID
import java.util.Date

@Entity
data class Crime (@PrimaryKey val id:UUID = UUID.randomUUID(),
                  var data:Date=Date(),
                  var isSolved: Boolean = false,
                  var title: String= ""
)

