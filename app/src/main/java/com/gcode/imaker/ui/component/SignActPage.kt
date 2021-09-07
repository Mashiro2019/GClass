package com.gcode.imaker.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults.textFieldColors
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

/**
 *作者:created by HP on 2021/9/7 19:37
 *邮箱:sakurajimamai2020@qq.com
 */

val mainColor:Color = Color(0xFF0652DD)

/**
 * 用户名输入栏
 * @return String
 */
@Composable
fun userNameOutlinedTextField():String{
    var userName by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = userName,
        onValueChange = { userName = it },
        label = {
            Text(
                text = if(userName == ""){
                    "请输入你的用户名"
                }
                else{
                    "你好,$userName!"
                }
            ) },
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
        colors = textFieldColors(
            focusedIndicatorColor = mainColor,
            focusedLabelColor = mainColor,
            cursorColor = mainColor
        )
    )

    return userName
}

/**
 * 密码输入栏
 * @return String
 */
@Composable
fun passWordOutlinedTextField():String{
    var passWord by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = passWord,
        onValueChange = { passWord = it },
        label = { Text("请输入密码") },
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
        colors = textFieldColors(
            focusedIndicatorColor = mainColor,
            focusedLabelColor = mainColor,
            cursorColor = mainColor
        )
    )

    return passWord
}


@Preview
@Composable
fun preview(){
    userNameOutlinedTextField()
}