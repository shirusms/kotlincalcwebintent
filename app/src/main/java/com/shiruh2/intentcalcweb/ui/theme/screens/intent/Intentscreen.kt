package com.shiruh2.intentcalcweb.ui.theme.screens.intent

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.core.net.toUri

@Composable
fun Intent_Screen(navController: NavHostController) {
    val context= LocalContext.current
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Text(text = "Intent Screen",
            color= Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace)
        OutlinedButton(onClick = {
            val intent = Intent(Intent.ACTION_CALL, ("tel:" + "+254713064651").toUri())

            if (ContextCompat.checkSelfPermission(
                    context,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                context.startActivity(intent)
            }
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp))
        { Text(text = "Call",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif)}

        OutlinedButton(onClick = {

            val simToolKitLaunchIntent =
                context.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { context.startActivity(it) }
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)) { Text(text = "Stk",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif)}

        OutlinedButton(onClick = {
            val phone = "+254713064651"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)) { Text(text = "Dial",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif)}

        OutlinedButton(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            context.startActivity(shareIntent)
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)) { Text(text = "Share",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif)}

        OutlinedButton(onClick = {
            val emailIntent=
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","abc@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Body")
            context.startActivity(emailIntent)


        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)) { Text(text = "Email",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif)}

        OutlinedButton(onClick = {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(context as Activity,takePictureIntent,1,null)},
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)) { Text(text = "Camera",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif)}

        OutlinedButton(onClick = {
            val uri = "smsto:+254713064651".toUri()

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "I miss you")

            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.width(300.dp)) { Text(text = "Sms",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif)}


    }


    
}

@Preview
@Composable
private fun Intent_prev() {
    Intent_Screen(rememberNavController())
    
}