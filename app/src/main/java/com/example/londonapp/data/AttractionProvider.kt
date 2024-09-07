package com.example.londonapp.data

import androidx.compose.ui.res.stringResource
import com.example.londonapp.R

object AttractionProvider {
    private val park_attractions = listOf(
        Attraction (
            name = R.string.hyde_park,
            image = R.drawable.hyde_park,
            rating = 3,
            category = Categories.PARKS
        ),
        Attraction (
            name = R.string.st_james_park,
            image = R.drawable.st_jamess,
            rating = 5,
            category = Categories.PARKS
        ),
        Attraction (
            name = R.string.regents_park,
            image = R.drawable.regents,
            rating = 4,
            category = Categories.PARKS
        ),
        Attraction (
            name = R.string.kensington_gardens,
            image = R.drawable.kensington,
            rating = 4,
            category = Categories.PARKS
        )
    )

    private val landmark_attractions = listOf(
        Attraction (
            name = R.string.st_pauls,
            image = R.drawable.st_pauls,
            rating = 4,
            category = Categories.LANDMARKS
        ),
        Attraction (
            name = R.string.gherkin,
            image = R.drawable.gherkin,
            rating = 3,
            category = Categories.LANDMARKS
        ),
        Attraction (
            name = R.string.shard,
            image = R.drawable.shard,
            rating = 3,
            category = Categories.LANDMARKS
        )
    )

    private val film_location_attractions = listOf(
        Attraction (
            name = R.string.leadenhall_market,
            image = R.drawable.leadenhall,
            rating = 4,
            category = Categories.FILM_LOCATIONS
        ),
        Attraction (
            name = R.string.royal_naval_college,
            image = R.drawable.old_naval,
            rating = 4,
            category = Categories.FILM_LOCATIONS
        ),
        Attraction (
            name = R.string.notting_hill,
            image = R.drawable.notting_hill,
            rating = 3,
            category = Categories.FILM_LOCATIONS
        ),
        Attraction (
            name = R.string.paddington,
            image = R.drawable.paddington,
            rating = 2,
            category = Categories.FILM_LOCATIONS
        )
    )

    private val museum_attractions = listOf(
        Attraction (
            name = R.string.british_museum,
            image = R.drawable.british_museum,
            rating = 4,
            category = Categories.MUSEUMS
        ),
        Attraction (
            name = R.string.madame_tussauds,
            image = R.drawable.tussauds,
            rating = 4,
            category = Categories.FILM_LOCATIONS
        ),
        Attraction (
            name = R.string.transport_museum,
            image = R.drawable.transport,
            rating = 4,
            category = Categories.FILM_LOCATIONS
        )
    )
}