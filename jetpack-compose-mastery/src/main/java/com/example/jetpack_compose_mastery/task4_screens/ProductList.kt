package com.example.jetpack_compose_mastery.task4_screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_mastery.sampledata.json
import com.example.jetpack_compose_mastery.task4_models.ProductModel
import com.google.gson.Gson

val gson = Gson()
val data = gson.fromJson(json, ProductModel::class.java)


@Composable
fun ProductList(modifier: Modifier = Modifier) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp)
    ){
       items(data.products,key = { it.id }) { product ->
            Card(
                modifier = Modifier.padding(8.dp).shadow(8.dp).padding(16.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RectangleShape,
            ) {
                Row() {
                    Text("${product.id}", fontSize = 20.sp)
                    Spacer(modifier.width(8.dp))
                    Text(product.title, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
                Text(product.description, fontSize = 16.sp)
            }
        }
    }
}