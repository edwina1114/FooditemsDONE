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

class Sidedishf : Fragment() {
    private var recyclerView: RecyclerView? = null
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter

    //(第一發生)顯示sidedish_layout的介面
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
        foodList.add(FooditemsModel(R.drawable.sidedish1, "麻婆豆腐"))
        foodList.add(FooditemsModel(R.drawable.sidedish8, "醬燒嫩豆腐"))
        foodList.add(FooditemsModel(R.drawable.sidedish27 , "日式滑蛋豆腐"))
        foodList.add(FooditemsModel(R.drawable.sidedish2, "可樂肉醬"))
        foodList.add(FooditemsModel(R.drawable.sidedish7, "德式香腸炒洋芋佐芥末籽醬"))
        foodList.add(FooditemsModel(R.drawable.sidedish10, "醬燒南瓜"))
        foodList.add(FooditemsModel(R.drawable.sidedish11 , "香料鹽洋芋"))
        foodList.add(FooditemsModel(R.drawable.sidedish22, "馬鈴薯鮪魚煎餅"))
        foodList.add(FooditemsModel(R.drawable.sidedish23, "蔬菜煎餅"))
        foodList.add(FooditemsModel(R.drawable.sidedish24, "金針菇煎餅"))
        foodList.add(FooditemsModel(R.drawable.sidedish25 , "月見蔥爆豆芽菜蛋餅"))
        foodList.add(FooditemsModel(R.drawable.sidedish12 , "蔥油餅"))
        foodList.add(FooditemsModel(R.drawable.sidedish13 , "金沙春筍"))
        foodList.add(FooditemsModel(R.drawable.sidedish16 , "螞蟻上樹"))
        foodList.add(FooditemsModel(R.drawable.sidedish17 , "豆干肉絲"))
        foodList.add(FooditemsModel(R.drawable.sidedish18 , "紅燒豆干"))
        foodList.add(FooditemsModel(R.drawable.sidedish15 , "蔥蒜香炒豆皮"))
        foodList.add(FooditemsModel(R.drawable.sidedish19 , "醬燒豬肉豆皮捲"))
        foodList.add(FooditemsModel(R.drawable.sidedish20 , "肉末蒸蛋"))
        foodList.add(FooditemsModel(R.drawable.sidedish14 , "茄汁馬鈴薯"))
        foodList.add(FooditemsModel(R.drawable.sidedish29 , "奶油香煎馬鈴薯"))
        foodList.add(FooditemsModel(R.drawable.sidedish31 , "古早味碰皮白滷"))
        foodList.add(FooditemsModel(R.drawable.sidedish32 , "黑胡椒炒豆芽"))
        foodList.add(FooditemsModel(R.drawable.sidedish33 , "韓式雜菜"))
        foodList.add(FooditemsModel(R.drawable.sidedish26 , "咖哩炒三色"))
        foodList.add(FooditemsModel(R.drawable.sidedish21, "醬油金針煮"))
        foodList.add(FooditemsModel(R.drawable.sidedish3, "肉絲筍片"))
        foodList.add(FooditemsModel(R.drawable.sidedish5, "櫻花蝦炒蘿蔔絲"))
        foodList.add(FooditemsModel(R.drawable.sidedish28 , "日式涼拌小黃瓜豆腐"))
        foodList.add(FooditemsModel(R.drawable.sidedish30 , "涼拌豆皮蔬菜"))
        foodList.add(FooditemsModel(R.drawable.sidedish6, "涼拌干絲"))
        foodList.add(FooditemsModel(R.drawable.sidedish9, "涼拌黑木耳"))
        foodList.add(FooditemsModel(R.drawable.sidedish4, "涼拌菇菇醬"))
        return foodList
    }


}
