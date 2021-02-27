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


class Breakfastf : Fragment() {
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
        foodList.add(FooditemsModel(R.drawable.breakfast1, "燕麥優格杯"))
        foodList.add(FooditemsModel(R.drawable.breakfast2, "草莓蛋吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast11, "培根蛋早餐燕麥粥"))
        foodList.add(FooditemsModel(R.drawable.breakfast7, "全麥鮪魚蛋吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast8, "法式吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast6, "蔥花蛋捲"))
        foodList.add(FooditemsModel(R.drawable.breakfast9, "帕瑪森花椰菜煎餅"))
        foodList.add(FooditemsModel(R.drawable.breakfast10, "酪梨豆腐青醬吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast12, "五分鐘咖哩優格鮮蔬三明治"))
        foodList.add(FooditemsModel(R.drawable.breakfast13, "3分鐘微波法式吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast14, "5分鐘舒芙蕾起司蛋"))
        foodList.add(FooditemsModel(R.drawable.breakfast15, "太陽蛋吐司佐辣味焦糖奶油醬"))
        foodList.add(FooditemsModel(R.drawable.breakfast5, "起士菇菇炒蛋盒子"))
        foodList.add(FooditemsModel(R.drawable.breakfast3, "煎蛋吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast4, "起司煎蛋"))

        return foodList
    }

}
