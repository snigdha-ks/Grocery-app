package com.snigdha.groceryapp

import androidx.lifecycle.ViewModel
import com.snigdha.groceryapp.GroceryItems
import com.snigdha.groceryapp.GroceryRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repository: GroceryRepository):ViewModel() {
    fun insert(items: GroceryItems) = GlobalScope.launch {
        repository.insert(items)
    }
    fun delete(items: GroceryItems) = GlobalScope.launch {
        repository.delete(items)
    }
    fun getAllGroceryItems() = repository.getAllItems()
}