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

class Ricef : Fragment() {
    private var recyclerView: RecyclerView? = null
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter

    //(第一發生)顯示rice_layout的介面
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
        foodList.add(FooditemsModel(R.drawable.rice1, "雞肉親子丼"))
        foodList.add(FooditemsModel(R.drawable.rice2, "豆芽雞肉蓋飯"))
        foodList.add(FooditemsModel(R.drawable.rice3, "雞肉豆腐漢堡排"))
        foodList.add(FooditemsModel(R.drawable.rice4, "味噌炊飯"))
        foodList.add(FooditemsModel(R.drawable.rice5, "和風白菜雞蛋丼"))
        foodList.add(FooditemsModel(R.drawable.rice6, "鮭魚五穀米炒飯"))
        foodList.add(FooditemsModel(R.drawable.rice7, "麻油菇菇雞飯"))
        foodList.add(FooditemsModel(R.drawable.rice8, "空心菜梗炒飯"))
        foodList.add(FooditemsModel(R.drawable.rice9, "海鮮泡飯"))
        foodList.add(FooditemsModel(R.drawable.rice10, "豆腐飯"))
        foodList.add(FooditemsModel(R.drawable.rice11, "日式豆腐丼"))
        foodList.add(FooditemsModel(R.drawable.rice12, "泰式排骨湯泡飯"))
        foodList.add(FooditemsModel(R.drawable.rice13, "沙茶豬肉燴飯"))
        foodList.add(FooditemsModel(R.drawable.rice14, "低熱量花椰菜炒飯"))
        foodList.add(FooditemsModel(R.drawable.rice15, "高蛋白便當"))
        foodList.add(FooditemsModel(R.drawable.rice16, "雞肉蔬菜健康餐"))
        foodList.add(FooditemsModel(R.drawable.rice17, "香芹皮芋粥"))
        return foodList
    }

}
