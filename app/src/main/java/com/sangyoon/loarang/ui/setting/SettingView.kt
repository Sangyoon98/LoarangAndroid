package com.sangyoon.loarang.ui.setting

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sangyoon.loarang.ui.theme.LoarangTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Setting(name: String, modifier: Modifier = Modifier) {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            LargeTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        name,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },
    ) { innerPadding ->
        DeepView(innerPadding)
    }
}

@Composable
fun DeepView(innerPadding: PaddingValues) {
    LazyColumn {
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { Text("토스뱅크") }
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { Text("토스뱅크") }
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { Text("토스뱅크") }
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { Text("토스뱅크") }
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { Text("토스뱅크") }
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { Text("토스뱅크") }
        item { Spacer(modifier = Modifier.height(100.dp)) }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoarangTheme {
        Setting("설정")
    }
}