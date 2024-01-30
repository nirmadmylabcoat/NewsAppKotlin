package com.example.newsapp

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(val songs: List<song>):RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater= LayoutInflater.from(parent.context) //makes viewholder and stores views in it, takes xml file and convert to java obj
        val view = inflater.inflate(R.layout.item_view, parent, false) //passing of item_view file as parameter
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int)
    {
        holder.textTitle.text = songs[position].title
        holder.textDescription.text = songs[position].description
        var color = "#CCCCCC"
        if (position%2==0)
        {
            color = "#DDDDDD"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var textTitle=itemView.findViewById<TextView>(R.id.textTitle)
        var textDescription=itemView.findViewById<TextView>(R.id.textDescription)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
    }
}

