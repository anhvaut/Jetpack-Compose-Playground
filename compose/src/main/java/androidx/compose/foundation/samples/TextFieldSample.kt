/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.compose.foundation.samples


import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue

import androidx.ui.foundation.Text
import androidx.ui.foundation.TextField
import androidx.ui.input.TextFieldValue
import androidx.ui.layout.Stack
import androidx.ui.savedinstancestate.savedInstanceState


@Composable

fun TextFieldSample() {
    var value by savedInstanceState(saver = TextFieldValue.Saver) { TextFieldValue() }
    TextField(
        value = value,
        onValueChange = { value = it }
    )
}


@Composable
fun PlaceholderTextFieldSample() {
    val state = savedInstanceState(saver = TextFieldValue.Saver) { TextFieldValue() }
    Stack {
        TextField(
            value = state.value,
            onValueChange = { state.value = it }
        )
        if (state.value.text.isEmpty()) {
            Text(
                text = "Placeholder"
            )
        }
    }
}