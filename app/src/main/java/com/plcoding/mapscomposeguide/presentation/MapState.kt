package com.plcoding.mapscomposeguide.presentation

import com.google.maps.android.compose.MapProperties


/**
 * Created by Abhinay on 27/08/25.
 *
 *
 */
data class MapState(
    val properties: MapProperties = MapProperties(),
    val isFalloutMap: Boolean = false
)
