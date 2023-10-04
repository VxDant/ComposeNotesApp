package com.example.composeapp

import android.graphics.Color.red
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.outlined.Category
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material3.*
import androidx.compose.material3.TextFieldDefaults.textFieldColors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.data.TabRowItem
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tabItems = listOf(
            TabRowItem(
                title = "All Notes",
                selectedIcon = Icons.Filled.Category,
                unselectedIcon = Icons.Outlined.Category

            ),

            TabRowItem(
                title = "Create Note",
                selectedIcon = Icons.Filled.Create,
                unselectedIcon = Icons.Outlined.Create

            )
        )
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EmptyNote()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun EmptyNote(){

    val mcontext = LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(1.dp)

    ){

        Box(
            modifier = Modifier
                .paint(
                    painterResource(id = R.drawable.paper)
                )
        ){

            Column {

                var text by remember{
                    mutableStateOf("")
                }

                Text(
                    text = "Note",
                    fontSize = 24.sp,
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                )

                TextField(value = text,
                    onValueChange = {
                                    text = it
                    },
                    placeholder = {
                                  Text("pls write a note...")
                    },
                    colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent),
                    modifier = Modifier
                        .height(400.dp)
                        .width(400.dp)
                        .padding(41.dp)
                )
            }

        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            Button(
                onClick = {Toast.makeText(
                    mcontext,
                    "trying to save", Toast.LENGTH_SHORT).show()},
                modifier = Modifier
                    .padding(10.dp)
            ){
                Text(text = "save")

            }

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(10.dp)
            ){
                Text(text = "clear all")
            }

        }

    }

}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EmptyNote()
}