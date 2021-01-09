package com.codingwithme.recipeapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.codingwithme.recipeapp.entities.Recipes

@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM recipes ORDER BY id DESC")
    val allRecipes: List<Recipes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipies: Recipes)
}