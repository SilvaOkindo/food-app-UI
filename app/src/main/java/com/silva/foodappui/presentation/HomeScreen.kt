package com.silva.foodappui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.silva.foodappui.R

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    Column {
        Menu()
        TextQuestion()
        BuyCard()
        Popular()
        HomePopular()
        TopWeek()
        TopOfTheWeek()
    }
}

@Composable
fun TopOfTheWeek() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(160.dp),
        backgroundColor = colorResource(id = R.color.orange)
    ) {
        Row(modifier = Modifier.fillMaxWidth().padding(8.dp), horizontalArrangement = Arrangement.SpaceAround) {
            Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "")
            Column {
                Text(
                    text = "Chicken Fiesta",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                )
                Text(text = "Hot Chicken Pizza with Fries", style = MaterialTheme.typography.body1)
                Row{
                    Text(text = "$", fontWeight = FontWeight.Bold, color = colorResource(id = R.color.dark_orange))
                    Text(text = "9.85", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Composable
fun TopWeek() {
    Text(
        modifier = Modifier.padding(16.dp),
        text = "Top of the week",
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun HomePopular() {
    Row(modifier = Modifier.padding(16.dp)) {
        PopularFood()
        Column(modifier = Modifier.padding(top = 16.dp)) {
            PopularFoods(foodTitle = "Panner Tikka", imageBitmap = painterResource(id = R.drawable.pizza), amount = "4.75", foodDescription = "Hot Panner Pizza", btnText = "+")
            Spacer(modifier = Modifier.height(10.dp))
            PopularFoods(foodTitle = "Panner Capsicum", imageBitmap = painterResource(id = R.drawable.pizza), amount = "5.15", foodDescription = "Hot Panner Pizza", btnText = "+")
        }
    }
}

@Composable
fun PopularFoods(
    foodTitle: String,
    imageBitmap: Painter,
    amount: String,
    foodDescription: String,
    btnText: String

) {
    Card(
        modifier = Modifier
            .height(103.dp)
            .width(200.dp),
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = foodTitle,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                text = foodDescription,
                style = MaterialTheme.typography.body2,
                fontSize = 12.sp
            )
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), horizontalArrangement = Arrangement.SpaceAround) {
                Image(painter = imageBitmap, contentDescription = "")
                Column {
                    Row {
                        Text(
                            text = "$",
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.dark_orange)
                        )
                        Text(
                            text = amount,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(
                                width = 32
                                    .dp, height = 17.dp
                            ),
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.dark_orange))
                    ) {
                        Text(text = btnText)
                    }
                }
            }
        }
    }
}

@Composable
fun PopularFood() {
    Card(
        modifier = Modifier
            .height(250.dp)
            .width(200.dp)
            .padding(16.dp),
    backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Tandoori Paneer",
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                text = "Hot Paneer Pizza",
                style = MaterialTheme.typography.body2,
                fontSize = 12.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "Pizza")
        }
        Row(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 6.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(text = "$", fontWeight = FontWeight.Bold, color = colorResource(id = R.color.orange))
            Text(text = "6.85", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(80.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .clip(CircleShape)
                    .size(
                        width = 32
                            .dp, height = 17.dp
                    ),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.dark_orange))
            ) {
                Text(
                    text = "+",
                    modifier = Modifier.padding(6.dp),
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    fontSize = 8.sp
                )
            }
        }
    }
}

@Composable
fun Popular() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Popular",
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "See all",
            modifier = Modifier
                .clickable { },
            color = Color.Gray,
            fontSize = 24.sp
        )
    }
}


@Composable
fun BuyCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(160.dp),
        backgroundColor = colorResource(id = R.color.orange)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                //modifier = Modifier.padding(start = 30.dp, top = 30.dp)
            ) {
                Text(
                    text = "Eat quality food",
                    fontStyle = FontStyle.Normal,
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "from your favorite",
                    fontStyle = FontStyle.Normal,
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "restaurant",
                    fontStyle = FontStyle.Normal,
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold
                )
                Button(
                    modifier = Modifier.clip(CircleShape),
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                ) {
                    Text(
                        text = "Buy Now",
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.orange)
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.burger),
                contentDescription = "burger",
                //modifier = Modifier.padding(top = 30.dp, end = 30.dp)
            )
        }
    }
}

@Composable
fun TextQuestion() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "What would you like",
            fontStyle = FontStyle.Normal,
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "like to eat?",
            fontStyle = FontStyle.Normal,
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Menu() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Menu",
            modifier = Modifier.clickable {  }
        )
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search",
            modifier = Modifier.clickable {  }
        )
    }
}
