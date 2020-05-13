package jp.techacademy.kouhei.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val man1 = Human("小西", 25,"映画鑑賞")      // 名前をXX、年齢nn歳で、Humanのインスタンスを作る

        man1.say()
        man1.think()

        val man2 = Human("", 25,"映画鑑賞")      // 名前をXX、年齢nn歳で、Humanのインスタンスを作る

        man2.say()
        man2.think()
    }
}