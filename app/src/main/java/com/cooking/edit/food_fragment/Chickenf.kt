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

class Chickenf : Fragment() {
    private var recyclerView: RecyclerView? = null
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter

    //(第一發生)顯示easy_layout的介面
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
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

        foodList = ArrayList()
        foodList = addfood()
        foodiesAdapters = FooditemsAdapter(foodList)
        recyclerView?.adapter = foodiesAdapters

    }

    fun addfood(): ArrayList<FooditemsModel> {
        foodList.add(FooditemsModel(R.drawable.ch1, alphaChar = "蔥香味噌雞"))
        foodList.add(FooditemsModel(R.drawable.ch21, alphaChar = "三杯菇菇雞"))
        foodList.add(FooditemsModel(R.drawable.ch23, alphaChar = "安東燉雞"))
        foodList.add(FooditemsModel(R.drawable.ch2, alphaChar = "醬燒雞腿杏鮑菇"))
        foodList.add(FooditemsModel(R.drawable.ch3, alphaChar = "迷迭香黑胡椒馬鈴薯雞"))
        foodList.add(FooditemsModel(R.drawable.ch8, alphaChar = "豉汁彩椒雞球"))
        foodList.add(FooditemsModel(R.drawable.ch25, alphaChar = "洋蔥雞丁"))
        foodList.add(FooditemsModel(R.drawable.ch24, alphaChar = "泰式涼拌柚香雞絲"))
        foodList.add(FooditemsModel(R.drawable.ch6, alphaChar = "豆芽雞絲"))
        foodList.add(FooditemsModel(R.drawable.ch5, alphaChar = "酥炸雞皮"))
        foodList.add(FooditemsModel(R.drawable.ch4, alphaChar = "啤酒燒雞腿"))
        foodList.add(FooditemsModel(R.drawable.ch13, alphaChar = "蔥燒雞腿"))
        foodList.add(FooditemsModel(R.drawable.ch17, alphaChar = "香滷棒棒腿"))
        foodList.add(FooditemsModel(R.drawable.ch9, alphaChar = "蜜汁雞翅"))
        foodList.add(FooditemsModel(R.drawable.ch7, alphaChar = "蠔油雞翅"))
        foodList.add(FooditemsModel(R.drawable.ch10, alphaChar = "美乃茄醬烤雞翅"))
        foodList.add(FooditemsModel(R.drawable.ch11, alphaChar = "咖哩生薑燒雞腿"))
        foodList.add(FooditemsModel(R.drawable.ch12, alphaChar = "咖哩優格烤雞翅"))
        foodList.add(FooditemsModel(R.drawable.ch14, alphaChar = "青檸可樂雞翅腿"))
        foodList.add(FooditemsModel(R.drawable.ch22, alphaChar = "甜辣醬烤雞翅"))
        foodList.add(FooditemsModel(R.drawable.ch18, alphaChar = "咖哩烤雞翅腿"))
        foodList.add(FooditemsModel(R.drawable.ch15, alphaChar = "黑胡椒檸檬醬烤雞翅腿"))
        foodList.add(FooditemsModel(R.drawable.ch19, alphaChar = "起司嫩雞塊"))
        foodList.add(FooditemsModel(R.drawable.ch20, alphaChar = "咖哩美乃滋嫩雞塊"))
        foodList.add(FooditemsModel(R.drawable.ch16, alphaChar = "檸香鹽麴醬烤雞腿排"))
        foodList.add(FooditemsModel(R.drawable.ch26, alphaChar = "嫩煎香料雞胸"))
        foodList.add(FooditemsModel(R.drawable.ch27, alphaChar = "塔香味噌鹽麴烤雞腿排"))
        foodList.add(FooditemsModel(R.drawable.ch28, alphaChar = "紅糟醬烤雞腿排"))

        return foodList
    }
}
