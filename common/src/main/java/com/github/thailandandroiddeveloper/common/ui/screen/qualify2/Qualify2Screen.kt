package com.github.thailandandroiddeveloper.common.ui.screen.qualify2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@Composable
fun Qualify2Screen() {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.onPrimary
    ) { paddingValues ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = paddingValues)
        ) {
            Column (modifier = Modifier.padding(bottom = 48.dp)) {
                RefineSkipButton()
                TutorialInfoSection()
            }
            NextButton()
        }
    }
}

@Composable
fun RefineSkipButton() = Row(
    modifier = Modifier
        .fillMaxWidth(),
    horizontalArrangement = Arrangement.End
) {
    SkipButton()
}

@Composable
fun SkipButton() = TextButton(
    modifier = Modifier.padding(top = 2.dp, end = 8.dp),
    onClick = {}
) {
    Text(
        text = "Skip",
        style = MaterialTheme.typography.labelLarge
    )
}

@Composable
fun TutorialInfoSection() = Column(
    modifier = Modifier
        .padding(horizontal = 32.dp)
        .padding(top = 16.dp),
    verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.CenterVertically),
) {
    TutorialTexts()
    Image(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp)
            ),
        painter = painterResource(id = R.drawable.img_qualify_2_onboard),
        contentDescription = null,
    )
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        IndicatorsGroup()
    }
}

@Composable
fun TutorialTexts() = Column(
    verticalArrangement = Arrangement.spacedBy(16.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
) {
    Text(
        text = "Lorem ipsum dolor sit amet",
        style = MaterialTheme.typography.headlineSmall,
    )
    Text(
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec egestas dictum lacinia. Integer arcu\nneque, porttitor ac metus quis, iaculis molestie magna. Vivamus molestie justo sed nulla lacinia,\nquis fringilla lorem imperdiet. Proin in quam vel odio iaculis fringilla",
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center
    )
}

@Composable
fun IndicatorsGroup() = Row(
    horizontalArrangement = Arrangement.spacedBy(8.dp)
) {
    Indicator()
    Indicator()
    Indicator()
    IndicatorCurrent()
    Indicator()
}

@Composable
fun NextButton() = Column(
    modifier = Modifier
        .fillMaxHeight()
        .background(
        color = MaterialTheme.colorScheme.primaryContainer
    ),
    verticalArrangement = Arrangement.Center
) {
    Button(
        modifier = Modifier
            .padding(horizontal = 80.dp)
            .fillMaxWidth()
            .height(40.dp),
        onClick = { },
        contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp)
    ) {
        Text(
            text = "Next",
            style = MaterialTheme.typography.labelLarge
        )
    }
}

@Composable
fun Indicator() = Box(
    modifier = Modifier
        .size(16.dp)
        .background(
            color = MaterialTheme.colorScheme.primaryContainer,
            shape = CircleShape
        )
)

@Composable
fun IndicatorCurrent() = Box(
    modifier = Modifier
        .size(width = 32.dp, height = 16.dp)
        .background(
            color = MaterialTheme.colorScheme.primary,
            shape = CircleShape
        )
)

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify2ScreenPreview() = AppTheme {
    Qualify2Screen()
}
// endregion