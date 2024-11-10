package net.adhikary.mrtbuddy.ui.screens.home

sealed interface MainScreenAction {
    data object OnCardTap : MainScreenAction
    data object OnInit : MainScreenAction
    data object StartScanning : MainScreenAction
}