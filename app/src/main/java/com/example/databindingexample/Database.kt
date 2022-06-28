package com.example.databindingexample

object Database {
    const val TYPE_HEADER = 0
    const val TYPE_ITEM = 1

    fun getItems(): ArrayList<Any>{
        val itemList = arrayListOf<Any>()
        itemList.add(DataItem.Header("08.00"))
        itemList.add(DataItem.Item(1, "Drink coffee"))
        itemList.add(DataItem.Item(2, "Meeting"))
        itemList.add(DataItem.Item(3, "Make a roadmap"))


        itemList.add(DataItem.Header("10.00"))
        itemList.add(DataItem.Item(4, "Finish project"))
        itemList.add(DataItem.Item(5, "Take a break"))
        itemList.add(DataItem.Item(6, "Start article"))

        itemList.add(DataItem.Header("12.00"))
        itemList.add(DataItem.Item(7, "Lunch"))
        itemList.add(DataItem.Item(8, "Movie"))
        itemList.add(DataItem.Item(9, "Read book"))

        itemList.add(DataItem.Header("14.00"))
        itemList.add(DataItem.Item(7, "Article"))
        itemList.add(DataItem.Item(8, "Clean dest"))
        itemList.add(DataItem.Item(9, "Meeting"))


        return itemList



    }
}