package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify3Screen() {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.onPrimary
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues = paddingValues),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            CustomTopBar()
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(start = 16.dp),
                content = {
                    item {
                        GalleryImage(
                            resId = R.drawable.img_qualify_3_photo_1,
                            borderColor = MaterialTheme.colorScheme.primary
                        )
                    }
                    item {
                        GalleryImage(
                            resId = R.drawable.img_qualify_3_photo_2,
                            borderColor = MaterialTheme.colorScheme.primaryContainer
                        )
                    }
                    item {
                        GalleryImage(
                            resId = R.drawable.img_qualify_3_photo_3,
                            borderColor = MaterialTheme.colorScheme.primaryContainer
                        )
                    }
                })
            Row(
                modifier = Modifier.padding(start = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                TagPill(text = "Tag 1", color = MaterialTheme.colorScheme.primary)
                TagPill(text = "Tag 2", color = MaterialTheme.colorScheme.outline)
                TagPill(text = "Tag 3", color = MaterialTheme.colorScheme.outline)
                TagPill(text = "Tag 4", color = MaterialTheme.colorScheme.outline)
            }
            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CustomCard("Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo consectetur. Sed congue blandit nibh.")
                CustomCard("Morbi sed sagittis justo, at pulvinar ipsum. Praesent massa metus, interdum at suscipit a, interdum vel orci. Pellentesque in sapien. Integer faucibus mauris ac luctus aliquam accumsan.")
                CustomCard("Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo.")
                CustomCard("Ut hendrerit neque nec accumsan hendrerit. Fusce lobortis rhoncus erat, a blandit nibh molestie vel. Cras commodo ligula ex, vitae venenatis lacus facilisis eget.")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar() = TopAppBar(
    colors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
    ),
    navigationIcon = {
        Icon(
            painter = painterResource(id = R.drawable.ic_qualify_3_back),
            contentDescription = ""
        )
    },
    title = {
        Text(text = "John Doe")
    },
    actions = {
        Icon(
            painter = painterResource(id = R.drawable.ic_qualify_3_copy),
            contentDescription = null
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_qualify_3_calendar),
            contentDescription = null
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_qualify_3_menu),
            contentDescription = null
        )
    }
)

@Composable
fun GalleryImage(resId: Int, borderColor: Color) {
    val roundedCornerShape = RoundedCornerShape(16.dp)
    return Image(
        modifier = Modifier
            .width(160.dp)
            .height(320.dp)
            .border(
                width = 2.dp,
                color = borderColor,
                shape = roundedCornerShape
            )
            .clip(roundedCornerShape),
        painter = painterResource(id = resId),
        contentDescription = null
    )
}

@Composable
fun TagPill(text: String, color: Color) = Box(
    modifier = Modifier
        .size(width = 68.dp, height = 32.dp)
        .border(
            width = 1.dp,
            color = color,
            shape = RoundedCornerShape(8.dp)
        )
        .padding(horizontal = 16.dp, vertical = 6.dp)
) {
    Text(
        text = text,
        color = color,
        style = MaterialTheme.typography.labelLarge
    )
}

@Composable
fun CustomCard(description: String) = Card(
    modifier = Modifier.height(96.dp),
    colors = CardDefaults.cardColors(
        containerColor = MaterialTheme.colorScheme.surface
    ),
    border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.surfaceVariant),
    shape = RoundedCornerShape(16.dp)
) {
    Row(
        modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            modifier = Modifier
                .size(48.dp)
                .clip(shape = CircleShape),
            painter = painterResource(id = R.drawable.img_qualify_3_sender),
            contentDescription = null
        )
        Column(
        ) {
            Text(
                text = "Lorem Ipsum",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface,
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify3ScreenPreview() = AppTheme {
    Qualify3Screen()
}
// endregion