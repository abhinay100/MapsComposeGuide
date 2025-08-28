package com.plcoding.mapscomposeguide.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


/**
 * Created by Abhinay on 27/08/25.
 *
 *
 */
class MapsViewModel: ViewModel() {

    var state by mutableStateOf(MapState())

}