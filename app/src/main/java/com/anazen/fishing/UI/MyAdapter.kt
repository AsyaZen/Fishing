package com.anazen.fishing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var list: MutableList<FishinGrounds>, val fragment: ListFragment) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_layout, parent, false)
        val holder = MyViewHolder(itemView)

        holder.itemView.setOnClickListener{
            fragment.showDetails(holder.adapterPosition)
        }
        return holder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.textViewName).text = list[position].name
        holder.itemView.findViewById<TextView>(R.id.textViewRegion).text = list[position].region
        holder.itemView.findViewById<TextView>(R.id.textViewDistrict).text = list[position].district
        holder.itemView.findViewById<ImageView>(R.id.imageView).setImageResource(
            holder.itemView.context.getResourceID(list[position].image.toString()))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun Context.getResourceID(name:String): Int {
        val resID = this.resources.getIdentifier(name , "drawable", this.packageName)
        return resID
    }
}