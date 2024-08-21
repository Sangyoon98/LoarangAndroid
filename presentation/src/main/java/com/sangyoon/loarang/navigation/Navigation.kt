package com.sangyoon.loarang.navigation

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.sangyoon.loarang.Const.CHARACTER
import com.sangyoon.loarang.Const.HOMEWORK
import com.sangyoon.loarang.Const.INFORMATION
import com.sangyoon.loarang.Const.SCHEDULE
import com.sangyoon.loarang.Const.SETTING
import com.sangyoon.loarang.R
import com.sangyoon.loarang.view.character.Character
import com.sangyoon.loarang.view.homework.Homework
import com.sangyoon.loarang.view.information.Information
import com.sangyoon.loarang.view.schedule.Schedule
import com.sangyoon.loarang.view.setting.Setting
import com.sangyoon.loarang.ui.theme.LoarangTheme

// Navigation Host
@Composable
fun MainNavigationView(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavigationItem.Character.screenRoute
    ) {
        composable(NavigationItem.Character.screenRoute) { Character(name = stringResource(id = NavigationItem.Character.title)) }
        composable(NavigationItem.Homework.screenRoute) { Homework(name = stringResource(id = NavigationItem.Homework.title)) }
        composable(NavigationItem.Schedule.screenRoute) { Schedule(name = stringResource(id = NavigationItem.Schedule.title)) }
        composable(NavigationItem.Information.screenRoute) { Information(name = stringResource(id = NavigationItem.Information.title)) }
        composable(NavigationItem.Setting.screenRoute) { Setting(name = stringResource(id = NavigationItem.Setting.title)) }
    }
}

// Navigation Bar
@Composable
fun MainNavigationBar(navController: NavController) {
    val items = listOf(
        NavigationItem.Character,
        NavigationItem.Homework,
        NavigationItem.Schedule,
        NavigationItem.Information,
        NavigationItem.Setting
    )

    NavigationBar {
        items.forEach { item ->
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            NavigationBarItem(
                selected = currentRoute == item.screenRoute,
                onClick = {
                    navController.navigate(item.screenRoute) {
                        navController.graph.startDestinationRoute?.let {
                            popUpTo(it) { saveState = true }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = stringResource(id = item.title),
                        modifier = Modifier
                            .width(26.dp)
                            .height(26.dp)
                    )
                },
                label = {
                    Text(stringResource(id = item.title), fontSize = 9.sp)
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainNavigationPreview() {
    LoarangTheme {
        MainNavigationBar(navController = rememberNavController())
    }
}

// Navigation Routes
sealed class NavigationItem(val title: Int, val icon: Int, val screenRoute: String) {
    data object Character : NavigationItem(R.string.navigation_character, R.drawable.icon_character, CHARACTER)

    data object Homework : NavigationItem(R.string.navigation_homework, R.drawable.icon_homework, HOMEWORK)

    data object Schedule : NavigationItem(R.string.navigation_schedule, R.drawable.icon_schedule, SCHEDULE)

    data object Information : NavigationItem(R.string.navigation_information, R.drawable.icon_information, INFORMATION)

    data object Setting : NavigationItem(R.string.navigation_setting, R.drawable.icon_settings, SETTING)
}