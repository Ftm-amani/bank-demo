package com.example.bank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.bank.datamodel.Card
import com.example.bank.datamodel.Operation
import com.example.bank.list.RecyclerAdapter
import com.example.bank.viewpager.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class   MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardList : List<Card> = getCardsList()
        view_pager.orientation = if(resources.getBoolean(R.bool.isViewPagerVertical)) ViewPager2.ORIENTATION_VERTICAL else ViewPager2.ORIENTATION_HORIZONTAL
        view_pager.adapter= ViewPagerAdapter(cardList, this)



        val operationList = getOperation()
        recycler_view.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        recycler_view.adapter = RecyclerAdapter(operationList,this)
    }

    private fun getOperation(): List<Operation> {
        return listOf(
            Operation(1,R.drawable.ic_transfer, "انتقال وجه"),
            Operation(2,R.drawable.ic_cash,"موجودی"),
            Operation(3,R.drawable.ic_bill,"پرداخت قبض"),
            Operation(4,R.drawable.ic_recent,"تراکنش های اخیر"),
            Operation(5,R.drawable.ic_charge,"شارژ"),
            Operation(6,R.drawable.ic_internet,"اینترنت")
        )
    }

    private fun getCardsList(): List<Card> {
        return listOf(

        Card(1, R.drawable.img_card, "6037 9918 2524 7789", "99/08"),
        Card(2, R.drawable.img_card2,"5720 8879 6478 7496", "98/08"),
        Card(3, R.drawable.img_card3,"6037 9914 7970 4558", "04/09"),
        Card(4, R.drawable.img_card4,"6037 9914 8798 1010", "02/08"),
        Card(5, R.drawable.img_card5,"6037 6895 7970 8585", "99/03"),
        Card(6, R.drawable.img_card6,"6037 9914 4454 9221", "97/01")
        )

    }


}
