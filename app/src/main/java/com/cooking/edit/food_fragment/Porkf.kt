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

class Porkf : Fragment() {
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

    fun addfood(): ArrayList<FooditemsModel>{
        foodList.add(FooditemsModel(R.drawable.pork13 , "照燒金針菇漢堡排"))
        foodList.add(FooditemsModel(R.drawable.pork6 , "蜂蜜醬燒五花肉"))
        foodList.add(FooditemsModel(R.drawable.pork8 , "蜂蜜芥末籽嫩煎豬排"))
        foodList.add(FooditemsModel(R.drawable.pork11 , "番茄燉肉"))
        foodList.add(FooditemsModel(R.drawable.pork12 , "韓式燒肉"))
        foodList.add(FooditemsModel(R.drawable.pork9 , "打拋豬"))
        foodList.add(FooditemsModel(R.drawable.pork1 ,  "櫛瓜炒肉末"))
        foodList.add(FooditemsModel(R.drawable.pork2 , "肉末蒸豆腐"))
        foodList.add(FooditemsModel(R.drawable.pork10 , "金針菇味噌肉燥"))
        foodList.add(FooditemsModel(R.drawable.pork3 , "古早味肉燥"))
        foodList.add(FooditemsModel(R.drawable.pork4 , "咖哩洋蔥炒肉片"))
        foodList.add(FooditemsModel(R.drawable.pork5 , "泰式風味炒肉片"))
        foodList.add(FooditemsModel(R.drawable.pork7 , "味噌野菜炒肉片"))
        foodList.add(FooditemsModel(R.drawable.pork14 , "薑汁豬肉"))
        foodList.add(FooditemsModel(R.drawable.pork15 , "泰式拌肉"))

        return foodList
    }
}