package com.codingwithme.recipeapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codingwithme.recipeapp.R
import com.codingwithme.recipeapp.entities.Recipes
import kotlinx.android.synthetic.main.item_rv_main_category.view.*

class MainCategoryAdapter: RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>() {

    var arrMainCategory = ArrayList<Recipes>()
    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    fun setData(arrData : List<Recipes>){
        arrMainCategory = arrData as ArrayList<Recipes>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_main_category,parent,false))
    }

    override fun getItemCount(): Int {
        return arrMainCategory.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        holder.itemView.tv_dish_name.text = arrMainCategory[position].dishName
    }
}