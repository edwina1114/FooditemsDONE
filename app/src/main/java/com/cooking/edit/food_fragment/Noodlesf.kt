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

class Noodlesf : Fragment() {
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

    //(第二發生)initialize recyclerView and layout manager
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
        foodList.add(FooditemsModel(R.drawable.noodles1, "日式豬肉炒麵"))
        foodList.add(FooditemsModel(R.drawable.noodles2, "日式烏龍麵佐洋蔥燉雞"))
        foodList.add(FooditemsModel(R.drawable.noodles3, "XO醬炒泡麵"))
        foodList.add(FooditemsModel(R.drawable.noodles4, "酸辣泰式打拋豬拌炒泡麵"))
        foodList.add(FooditemsModel(R.drawable.noodles5, "絲瓜蛋麵線"))
        foodList.add(FooditemsModel(R.drawable.noodles6, "媽媽私房炒米粉"))
        foodList.add(FooditemsModel(R.drawable.noodles7, "肉絲炒麵"))
        foodList.add(FooditemsModel(R.drawable.noodles8, "雞絲燜米粉"))
        foodList.add(FooditemsModel(R.drawable.noodles9, "培根蛋奶義大利麵"))
        foodList.add(FooditemsModel(R.drawable.noodles10, "番茄雞蛋麵"))
        foodList.add(FooditemsModel(R.drawable.noodles11, "中日海陸烏龍乾麵"))
        foodList.add(FooditemsModel(R.drawable.noodles12, "家常肉末蛋米線"))
        foodList.add(FooditemsModel(R.drawable.noodles13, "冬日雨季小資男暖心湯麵"))
        foodList.add(FooditemsModel(R.drawable.noodles14, "越式涼拌米粉"))
        foodList.add(FooditemsModel(R.drawable.noodles15, "肉末冬粉"))
        return foodList
    }

}
