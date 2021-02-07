package com.codingwithme.recipeapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.codingwithme.recipeapp.entities.converter.MealListConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Meal")
class Meal(

    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "meals")
    @Expose
    @SerializedName("meals")
    @TypeConverters(MealListConverter::class)
    var mealsItem: List<MealsItems>? = null

)
