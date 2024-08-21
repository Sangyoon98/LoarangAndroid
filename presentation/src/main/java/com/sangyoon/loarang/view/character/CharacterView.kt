package com.sangyoon.loarang.view.character

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sangyoon.loarang.ui.theme.LoarangTheme

@Composable
fun Character(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoarangTheme {
        Character("Android")
    }
}