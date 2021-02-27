package com.cooking.edit.food_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cooking.edit.R
import com.cooking.edit.adapters.FooditemsAdapter
import com.cooking.edit.model.FooditemsModel
import kotlinx.android.synthetic.main.fooditems_layout.view.*

class Soupf : Fragment() {
    private var recyclerView: RecyclerView? = null
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter


    //(第一發生)顯示breakfast_layout的介面
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fooditems_layout, container, false)
    }
    //(第三發生)initialize recyclerView and layout manager
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.my_recycler_view

        // design the gridlayout & set recyclerview
        gridLayoutManager = GridLayoutManager(
            requireContext(), 3,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        // design the gridlayout & set recyclerview

        foodList = ArrayList()      //將foodList作為一個arraylist
        foodList = addfood()        //foodList存放圖片及名稱

        foodiesAdapters = FooditemsAdapter(foodList)    //adapter按照位置擺放foodlist裡的所有物品
        recyclerView?.adapter = foodiesAdapters
    }

    fun addfood(): ArrayList<FooditemsModel> {
        foodList.add(FooditemsModel(R.drawable.soup1, "菇菇蘿蔔雞湯"))
        foodList.add(FooditemsModel(R.drawable.soup2, "金沙絲瓜湯"))
        foodList.add(FooditemsModel(R.drawable.soup3, "海帶芽豆腐味噌湯"))
        foodList.add(FooditemsModel(R.drawable.soup4, "鮮蔬豆腐味噌湯"))
        foodList.add(FooditemsModel(R.drawable.soup5, "洋蔥湯"))
        foodList.add(FooditemsModel(R.drawable.soup6, "麻油菇菇雞湯"))
        foodList.add(FooditemsModel(R.drawable.soup7, "豚汁蔬菜湯"))
        foodList.add(FooditemsModel(R.drawable.soup8, "蒜頭洋蔥雞湯"))
        foodList.add(FooditemsModel(R.drawable.soup9, "韓式海帶芽排骨湯"))
        foodList.add(FooditemsModel(R.drawable.soup10, "雞茸玉米羮"))

        return foodList
    }
}
