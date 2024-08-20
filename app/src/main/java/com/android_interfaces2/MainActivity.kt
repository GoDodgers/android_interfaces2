package com.android_interfaces2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddToQueue
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.Bookmarks
import androidx.compose.material.icons.filled.FormatListNumbered
import androidx.compose.material.icons.filled.Inbox
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.AccessibilityNew
import androidx.compose.material.icons.outlined.AccountBalance
import androidx.compose.material.icons.outlined.Android
import androidx.compose.material.icons.outlined.AssistWalker
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.outlined.Biotech
import androidx.compose.material.icons.outlined.Coffee
import androidx.compose.material.icons.outlined.CurrencyBitcoin
import androidx.compose.material.icons.outlined.LocalAirport
import androidx.compose.material.icons.rounded.CheckCircleOutline
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android_interfaces2.ui.theme.Android_interfaces2Theme
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_interfaces2Theme {
                InterestPage()
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InterestPage() {
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Interests",
                        fontSize = 40.sp
                    )
                },
                // The navigation icon is set to a menu icon.
                navigationIcon = {
                    IconButton(
                        onClick = { /* icon clicked */ }
                    ) {
                        Icon(Icons.Filled.Menu, contentDescription = "Navigation Icon")
                    }
                },
                // The action icon is set to a favorite icon.
                actions = {
                    IconButton(
                        onClick = { /* icon clicked */ })
                    {
                        Icon(Icons.Filled.Settings, contentDescription = "Action Icon")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Column (horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Filled.Inbox, contentDescription = "Action Icon")
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "for you")
                    }
                    Column (horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Filled.Bookmarks, contentDescription = "Action Icon")
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "save")
                    }
                    Column (horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Filled.Apps, contentDescription = "Action Icon")
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "more")
                    }
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { paddingValues ->
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Text("Something")
            Text("Something")
            Text("Something")
            Text("Something")

        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InterestPagePreview() {
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Interests",
                        fontSize = 40.sp
                    )
                },
                // The navigation icon is set to a menu icon.
                navigationIcon = {
                    IconButton(
                        onClick = { /* icon clicked */ }
                    ) {
                        Icon(Icons.Filled.Menu, contentDescription = "Navigation Icon")
                    }
                },
                // The action icon is set to a favorite icon.
                actions = {
                    IconButton(
                        onClick = { /* icon clicked */ })
                    {
                        Icon(Icons.Filled.Settings, contentDescription = "Action Icon")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Column (horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Filled.Inbox, contentDescription = "Action Icon")
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "for you")
                    }
                    Column (horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Filled.Bookmarks, contentDescription = "Action Icon")
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "save")
                    }
                    Column (horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Filled.Apps, contentDescription = "Action Icon")
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "more")
                    }
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) {  paddingValues ->

        var interests = mutableListOf("")
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Outlined.AccessibilityNew, contentDescription = "accessibiility")
                Text("Something")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.CheckCircleOutline, contentDescription = "check")
                }
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Outlined.AccountBalance, contentDescription = "account balance")
                Text("Something")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.CheckCircleOutline, contentDescription = "check")
                }
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Outlined.Android, contentDescription = "android")
                Text("Something")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.CheckCircleOutline, contentDescription = "check")
                }
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Outlined.AssistWalker, contentDescription = "assist")
                Text("Something")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.CheckCircleOutline, contentDescription = "check")
                }
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Outlined.Bedtime, contentDescription = "bedtime")
                Text("Something")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.CheckCircleOutline, contentDescription = "check")
                }
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Outlined.CurrencyBitcoin, contentDescription = "crypto")
                Text("Something")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.CheckCircleOutline, contentDescription = "check")
                }
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Outlined.Coffee, contentDescription = "coffee")
                Text("Something")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.CheckCircleOutline, contentDescription = "check")
                }
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Outlined.LocalAirport, contentDescription = "airport")
                Text("Something")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Rounded.CheckCircleOutline, contentDescription = "check")
                }
            }
        }
    }
}