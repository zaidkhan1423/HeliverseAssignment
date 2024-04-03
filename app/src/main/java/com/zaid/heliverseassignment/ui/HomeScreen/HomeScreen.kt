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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zaid.heliverseassignment.R
import com.zaid.heliverseassignment.ui.theme.HeliverseAssignmentTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val screenWidth = LocalConfiguration.current.screenWidthDp
    val screenHeight = LocalConfiguration.current.screenHeightDp
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
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .align(alignment = Alignment.BottomCenter)
        )

        Column(
            modifier = Modifier
                .padding(bottom = (screenHeight / 15).dp)
                .fillMaxSize()
                .align(alignment = Alignment.BottomCenter)

        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.14f)
                    .padding((screenWidth / 15).dp),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxHeight()
            ) {
                Box(
                    modifier = Modifier
                        .padding(top = (screenHeight / 18).dp)
                        .fillMaxWidth(1.2f)
                        .fillMaxHeight(0.07f)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.message_left),
                        contentDescription = null,
                        modifier = Modifier
                            .scale(scaleX = 1.9f, scaleY = 1.3f)
                            .align(alignment = Alignment.Center)
                    )

                    AutoResizedText(
                        text = "Are U 14 Years Or Older?",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle.Italic
                        ),
                        color = Color(0xFFBA04B0),
                        modifier = Modifier
                            .padding(top = (screenHeight / 250).dp)
                            .align(alignment = Alignment.TopCenter)
                    )
                }

                Box(
                    modifier = Modifier
                        .padding(end = (screenWidth / 80).dp)
                        .align(alignment = Alignment.CenterEnd)
                        .fillMaxWidth(0.65f)
                        .fillMaxHeight(0.46f)
                        .shadow(
                            elevation = 9.dp,
                            spotColor = Color(0xFFFFEB3B),
                            shape = RoundedCornerShape(20)
                        )
                        .padding(top = 10.dp, start = 10.dp, end = 10.dp)
                        .clip(RoundedCornerShape(20)),
                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20))
                            .border(
                                border = BorderStroke(width = 2.dp, color = Color(0xFFFFEB3B)),
                                shape = RoundedCornerShape(20)
                            )
                            .fillMaxSize()
                            .background(Color(0xFFBA04B0)),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        AutoResizedText(
                            text = "By Clicking Continue, I\nAgree That I Am Least\n14 Years Old",
                            style = TextStyle(
                                lineHeight = 18.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic
                            ),
                            color = Color.White,
                            modifier = Modifier.padding(8.dp)
                        )
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(50))
                                .fillMaxWidth(0.7f)
                                .fillMaxHeight(0.3f)
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
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontStyle = FontStyle(FontStyle.Italic.value),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(50))
                                .fillMaxWidth(0.7f)
                                .fillMaxHeight(0.4f)
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
                                fontSize = 14.sp,
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
                        .padding(top = (screenHeight / 8.8).dp)
                        .scale(-1f, 1f)
                        .fillMaxWidth(0.45f)
                        .fillMaxHeight(1f)
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