package net.adhikary.mrtbuddy.ui.screens.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import net.adhikary.mrtbuddy.model.CardState

class MainViewModel : ViewModel() {

    var state by mutableStateOf(MainScreenState())
        private set


    private val eventChannel = Channel<MainScreenEvent>()
    val events = eventChannel.receiveAsFlow()

    fun onAction(action: MainScreenAction) {
        when (action) {
            MainScreenAction.OnCardTap -> {


            }
            is MainScreenAction.OnInit -> {
                // nfc manager has  a composable function that returns a NfcManager
                // we will trigger a event to start the scanner
                eventChannel.trySend(MainScreenEvent.StartScaning)

            }

            MainScreenAction.StartScanning -> {

            }
        }
    }


}