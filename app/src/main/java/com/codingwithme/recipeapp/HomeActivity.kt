package com.codingwithme.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.codingwithme.recipeapp.adapter.MainCategoryAdapter
import com.codingwithme.recipeapp.adapter.SubCategoryAdapter
import com.codingwithme.recipeapp.entities.Recipes
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // temporary data
        arrMainCategory.add(Recipes(1,"Beef"))
        arrMainCategory.add(Recipes(2,"Chicken"))
        arrMainCategory.add(Recipes(3,"Dessert"))
        arrMainCategory.add(Recipes(4,"Lamb"))

        mainCategoryAdapter.setData(arrMainCategory)


        arrSubCategory.add(Recipes(1,"Beef and mustard pie"))
        arrSubCategory.add(Recipes(2,"Chicken and mushroom hotpot"))
        arrSubCategory.add(Recipes(3,"Banana pancakes"))
        arrSubCategory.add(Recipes(4,"kapsalon"))

        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_sub_category.adapter = subCategoryAdapter


    }
}