package com.github.thailandandroiddeveloper.common.ui.screen.qualify1

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify1Screen() {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.onPrimary,
    ) {padding ->
        Column (modifier = Modifier.padding(padding)) {
            CustomTopAppBar()
            Box(
                modifier = Modifier.padding(all = 16.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_qualify_1_profile),
                    contentDescription = "",
                    modifier = Modifier
                        .width(379.dp)
                        .height(762.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
                Box(
                    modifier = Modifier
                        .alpha(0.75f)
                        .background(
                            color = MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(
                                bottomStart = 16.dp, bottomEnd = 16.dp
                            )
                        )
                ) {
                    Box(
                        modifier = Modifier.padding(
                            start = 20.dp, top = 20.dp, bottom = 40.dp, end = 20.dp
                        )
                    ) {
                        Column (verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                text = "John Doe",
                                style = MaterialTheme.typography.headlineMedium,
                                color = MaterialTheme.colorScheme.onPrimary
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .padding(end = 8.dp)
                                        .size(16.dp),
                                    painter = painterResource(id = R.drawable.ic_qualify_1_gender_male),
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.onPrimary
                                )
                                Text(
                                    text = "Male",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = MaterialTheme.colorScheme.onPrimary
                                )
                            }
                            Text(
                                text = "Lorem ipsum dolor sit amet, cd nulla lacinia, quis fringilla lorem imperdiet. Proin in quam vel odio iaculis fringilla.",
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onPrimary
                            )
                        }
                    }
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 48.dp)
                        .offset(y = 24.dp)
                    ,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    CustomButton(color = MaterialTheme.colorScheme.errorContainer, resId = R.drawable.ic_qualify_1_thumb_down)
                    CustomButton(color = MaterialTheme.colorScheme.primaryContainer, resId = R.drawable.ic_qualify_1_thumb_up)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar() = TopAppBar(
    colors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ),
    title = {},
    navigationIcon = {
        Image(
            painter = painterResource(id = R.drawable.ic_qualify_1_menu),
            contentDescription = ""
        )
    },
    actions = {
        Image(
            painter = painterResource(id = R.drawable.ic_qualify_1_profile),
            contentDescription = ""
        )
    }
)

@Composable
fun CustomButton(color: Color, resId: Int) = Button(
    colors = ButtonDefaults.buttonColors(
        containerColor = color
    ),
    contentPadding = PaddingValues(horizontal = 48.dp, vertical = 12.dp),
    onClick = {  },
) {
    Image(
        modifier = Modifier.size(24.dp),
        painter = painterResource(id = resId),
        contentDescription = null)
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify1ScreenPreview() = AppTheme {
    Qualify1Screen()
}
// endregion