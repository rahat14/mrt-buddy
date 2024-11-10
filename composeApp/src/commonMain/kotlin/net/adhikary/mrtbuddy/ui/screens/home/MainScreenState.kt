package net.adhikary.mrtbuddy.ui.screens.home

import net.adhikary.mrtbuddy.model.CardState
import net.adhikary.mrtbuddy.model.Transaction

data class MainScreenState(
    val isLoading: Boolean = false,
    val cardState: CardState = CardState.WaitingForTap,
    val transaction: List<Transaction> = emptyList(),
    val error: String? = null
)