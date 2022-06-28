package com.example.databindingexample

sealed class DataItem {
    data class Item(val id: Int, val text: String): DataItem()
    data class Header(val text: String): DataItem()
}
