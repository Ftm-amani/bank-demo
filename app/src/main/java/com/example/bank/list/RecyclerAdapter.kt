package com.example.bank.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.bank.R
import com.example.bank.datamodel.Operation
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class RecyclerAdapter(val operationList: List<Operation> , val context : Context) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.recycler_view_item,parent,false)
        return RecyclerViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return operationList.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item = operationList[position]
        holder.tv_item_title.text = item.title
        holder.imgPic.setImageResource(item.icon)

    }

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var imgPic: ImageView
        lateinit var tv_item_title: TextView

        init {
            imgPic = itemView.findViewById(R.id.img_pic)
            tv_item_title = itemView.findViewById(R.id.tv_item_title)
        }
    }



}