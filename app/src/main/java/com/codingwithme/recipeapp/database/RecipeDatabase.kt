package com.codingwithme.recipeapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.codingwithme.recipeapp.dao.RecipeDao
import com.codingwithme.recipeapp.entities.Recipes

@Database(entities = [Recipes::class],version = 1,exportSchema = false)
abstract class RecipeDatabase: RoomDatabase() {

    companion object{

        var recipesDatabase:RecipeDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase{
            if (recipesDatabase != null){
                recipesDatabase = Room.databaseBuilder(
                        context,
                        RecipeDatabase::class.java,
                        "recipe.db"
                ).build()
            }
            return recipesDatabase!!
        }
    }

    abstract fun recipeDao():RecipeDao
}