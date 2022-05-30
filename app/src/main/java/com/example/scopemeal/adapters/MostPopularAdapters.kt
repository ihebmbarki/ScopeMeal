package com.example.scopemeal.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.scopemeal.databinding.PopularItemsBinding
import com.example.scopemeal.pojo.MealsByCategory

class MostPopularAdapters() : RecyclerView.Adapter<MostPopularAdapters.PopularMealViewHolder>() {

    private var mealsList = ArrayList<MealsByCategory>()
    lateinit var onItemClick:((MealsByCategory) -> Unit)

    fun setMeals(mealsByCategoryList:ArrayList<MealsByCategory>){
        this.mealsList = mealsByCategoryList
        //everytime you set a new list you need to refresh the adapter to update the views
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularMealViewHolder {
        return PopularMealViewHolder(PopularItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: PopularMealViewHolder, position: Int) {
        Glide.with(holder.itemView)
            .load(mealsList[position].strMealThumb)
            .into(holder.binding.popularMealItem)

        holder.itemView.setOnClickListener {
            onItemClick.invoke(mealsList[position])
        }
    }

    override fun getItemCount(): Int {
        return mealsList.size
    }

    class PopularMealViewHolder(val binding:PopularItemsBinding):RecyclerView.ViewHolder(binding.root)
}