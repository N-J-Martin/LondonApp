package com.example.londonapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.londonapp.R
import com.example.londonapp.data.Categories

class AttractionHomeScreen {

    @Composable
    fun CategoryCard(
        category: Categories,
        selected: Boolean,
        onCardClick: () -> Unit,
        modifier: Modifier = Modifier
    ) {
        Card (
            modifier = modifier,
            colors = CardDefaults.cardColors(
                containerColor = if (selected) {
                    MaterialTheme.colorScheme.primaryContainer
                } else {
                    MaterialTheme.colorScheme.secondaryContainer
                }
            ),
            onClick = onCardClick
        ){
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                val iconResource = when(category) {
                    Categories.PARKS -> R.drawable.park
                    Categories.MUSEUMS -> R.drawable.museum
                    Categories.FILM_LOCATIONS -> R.drawable.film_loc
                    Categories.LANDMARKS -> R.drawable.landmark
                }
                Icon(
                    painter = painterResource(id = iconResource),
                    contentDescription = "",
                )

                Text(
                    text = category.name,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface,
                )
                
                Icon(
                    painter = painterResource(id = iconResource),
                    contentDescription = "",
                )
            }
        }
    }

    @Composable
    @Preview
    fun CategoryCardPreview(){
        CategoryCard(category = Categories.PARKS, selected = false, onCardClick = { /*TODO*/ })
    }


}