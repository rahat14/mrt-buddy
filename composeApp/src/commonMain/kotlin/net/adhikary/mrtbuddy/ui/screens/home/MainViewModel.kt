package net.adhikary.mrtbuddy.ui.screens.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow

class MainViewModel : ViewModel() {

    var state by mutableStateOf(MainScreenState())
        private set


    private val eventChannel = Channel<MainScreenEvent>()
    val events = eventChannel.receiveAsFlow()

    fun onAction(action: MainScreenAction) {
        when (action) {


            is MainScreenAction.OnInit -> {
                // nfc manager has  a composable function that returns a NfcManager
                // we will trigger a event to start the scanner


            }

            is MainScreenAction.UpdateCardState -> {
                // here state has been copied over new state
                state = state.copy(cardState = action.newState)

            }

            is MainScreenAction.UpdateTransactions -> {
                // here state has been copied over new state with new transactions
                // rest will not be updated
                // hence no ui will be redrawn
                state = state.copy(transaction = action.transactions)
            }
        }
    }


}