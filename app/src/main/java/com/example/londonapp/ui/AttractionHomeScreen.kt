package com.example.londonapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.londonapp.R
import com.example.londonapp.data.Categories
import com.example.londonapp.data.Categories as Categories1


@Composable
fun CategoryCard(
    category: Categories1,
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
                .padding(dimensionResource(id = R.dimen.list_item_vertical_spacing))
        ) {
            val iconResource = when(category) {
                Categories1.PARKS -> R.drawable.park
                Categories1.MUSEUMS -> R.drawable.museum
                Categories1.FILM_LOCATIONS -> R.drawable.film_loc
                Categories1.LANDMARKS -> R.drawable.landmark
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
fun CategoryList(
    onCategoryPressed: (Categories1) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = WindowInsets.safeDrawing.asPaddingValues(),
        verticalArrangement = Arrangement.spacedBy(
            dimensionResource(R.dimen.list_item_vertical_spacing)
        ),
    ) {
        val categoryList = Categories.entries
        items(categoryList.size) {
            index -> CategoryCard(
                category = categoryList[index],
                selected = false,
                onCardClick = {onCategoryPressed(categoryList[index])}
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen( modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                )
            )
        }
    ){
          innerPadding ->
            Column (verticalArrangement = Arrangement.Center){
                CategoryList(onCategoryPressed = {/*TODO*/}, modifier = Modifier.padding(innerPadding))
            }
    }

}

@Composable
@Preview
fun CategoryCardPreview() {
    CategoryCard(category = Categories1.PARKS, selected = false, onCardClick = { /*TODO*/ })
}

@Composable
@Preview
fun CategoryListPreview() {
    CategoryList(onCategoryPressed = {})
}

@Composable
@Preview(showBackground = true)
fun CategoryScreenPreview() {
    CategoryScreen()
}
