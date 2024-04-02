package com.zaid.heliverseassignment.ui.HomeScreen

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zaid.heliverseassignment.R
import com.zaid.heliverseassignment.ui.theme.HeliverseAssignmentTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = painterResource(id = R.drawable.platform),
            contentDescription = null,
            modifier = Modifier
                .width(400.dp)
                .height(100.dp)
                .align(alignment = Alignment.BottomCenter)
        )

        Column(
            modifier = Modifier
                .width(500.dp)
                .align(alignment = Alignment.BottomCenter)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .wrapContentSize()
                    .padding(20.dp),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .width(600.dp)
                    .padding(bottom = 60.dp)
            ) {

                Box(
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .width(360.dp)
                        .height(50.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.message_left),
                        contentDescription = null,
                        modifier = Modifier
                            .scale(scaleX = 1.5f, scaleY = 1f)
                            .align(alignment = Alignment.Center)
                    )
                    Text(
                        text = "Are U 14 Years Or Older?",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle(FontStyle.Italic.value),
                        color = Color(0xFFBA04B0),
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .align(alignment = Alignment.TopCenter)
                    )
                }

                Box(
                    modifier = Modifier
                        .padding(end = 5.dp)
                        .align(alignment = Alignment.CenterEnd)
                        .width(250.dp)
                        .height(300.dp)
                        .shadow(
                            elevation = 10.dp,
                            spotColor = Color(0xFFFFEB3B),
                            shape = RoundedCornerShape(35.dp)
                        )
                        .padding(20.dp)
                        .clip(RoundedCornerShape(35.dp)),
                ) {
                    Column(
                        modifier = Modifier
                            .border(
                                border = BorderStroke(width = 2.dp, color = Color(0xFFFFEB3B)),
                                shape = RoundedCornerShape(35.dp)
                            )
                            .fillMaxSize()
                            .background(Color(0xFFBA04B0)),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceAround
                    ) {

                        Text(
                            text = "By Clicking Continue, I\nAgree That I Am Least\n14 Years Old",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle(FontStyle.Italic.value),
                            color = Color.White,
                            modifier = Modifier.padding(8.dp)
                        )

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(50))
                                .width(160.dp)
                                .height(48.dp)
                                .clickable {
                                    Toast
                                        .makeText(context, "Yes", Toast.LENGTH_SHORT)
                                        .show()
                                }
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.gr_green_btn),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )
                            Text(
                                text = "Yes, Continue",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontStyle = FontStyle(FontStyle.Italic.value),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(50))
                                .width(160.dp)
                                .height(48.dp)
                                .clickable {
                                    Toast
                                        .makeText(context, "No", Toast.LENGTH_SHORT)
                                        .show()
                                }
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.bg_yellow_btn),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize(),
                            )
                            Text(
                                text = "No, I'm Not 14",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle(FontStyle.Italic.value),
                                modifier = Modifier.align(Alignment.Center),
                                color = Color(0xFF8E0285),
                            )
                        }
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.img_girl),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 100.dp)
                        .scale(-1f, 1f)
                        .width(170.dp)
                        .align(alignment = Alignment.BottomStart),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun HomeScreenPreview() {
    HeliverseAssignmentTheme {
        HomeScreen()
    }
}