package de.jensklingenberg.jetpackcomposeplayground.cookbook

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.foundation.Text
import androidx.ui.foundation.TextField
import androidx.ui.layout.Column

@Composable
fun HandleTextFieldChanges() {
    Column {
        val state = state { "" }
        TextField(
            value = state.value,
            onValueChange = { state.value = it }
        )
        Text("The textfield has this text: "+state.value)
    }
}