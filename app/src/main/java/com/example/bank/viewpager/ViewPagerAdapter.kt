package com.example.bank.viewpager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bank.R
import com.example.bank.datamodel.Card

class ViewPagerAdapter(val cardList: List<Card>, val context : Context) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.card, parent,false)
    return ViewPagerViewHolder(
        itemView
    )
    }


    override fun getItemCount(): Int {
        return cardList.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val item =cardList[position]
        holder.tvDate.text = item.date
        holder.tvCardNumber.text = item.cardNumber.toString()
        holder.imgBack.setImageResource(item.backImage)
    }


    class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        lateinit var imgBack : ImageView
        lateinit var tvCardNumber : TextView
        lateinit var tvDate :TextView
//        lateinit var constraintRoot : ConstraintLayout

        init {
            imgBack = itemView.findViewById(R.id.img_back)
            tvCardNumber = itemView.findViewById(R.id.tv_card_number)
            tvDate = itemView.findViewById(R.id.tv_date)
        }
    }


}