package com.example.learnkmm.android.translate.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learnkmm.translate.domain.history.HistoryDataSource
import com.example.learnkmm.translate.domain.translate.Translate
import com.example.learnkmm.translate.presentation.TranslateEvent
import com.example.learnkmm.translate.presentation.TranslateViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AndroidTranslateViewModel @Inject constructor(
    private val translate: Translate,
    private val historyDataSource: HistoryDataSource
): ViewModel() {

    private val viewModel by lazy {
        TranslateViewModel(
            translate = translate,
            historyDataSource = historyDataSource,
            coroutineScope = viewModelScope
        )
    }

    val state = viewModel.state

    fun event(event: TranslateEvent) = viewModel.onEvent(event)
}