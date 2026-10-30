package com.robtub.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.setBackgroundColor(Color.WHITE)

        val header = TextView(this)
        header.text = "RobTub"
        header.textSize = 28f
        header.setTextColor(Color.WHITE)
        header.setPadding(20, 25, 20, 25)
        header.setBackgroundColor(Color.rgb(35, 140, 230))

        root.addView(header)

        val welcome = TextView(this)
        welcome.text = "Добро пожаловать в RobTub ❤️"
        welcome.textSize = 20f
        welcome.gravity = Gravity.CENTER
        welcome.setPadding(10, 40, 10, 40)

        root.addView(welcome)

        val chats = TextView(this)
        chats.text = "💬  Пока нет сообщений\n\nТвои чаты появятся здесь."
        chats.textSize = 18f
        chats.setPadding(20, 20, 20, 20)

        root.addView(chats)

        setContentView(root)
    }
}
