package net.adhikary.mrtbuddy.ui.screens.home

import net.adhikary.mrtbuddy.model.CardState

data class MainScreenState(
    val isLoading: Boolean = false,
    val cardState: CardState = CardState.WaitingForTap,
    val error: String? = null
)