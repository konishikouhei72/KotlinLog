package jp.techacademy.kouhei.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val man = Human("小西", 25,"映画鑑賞")      // 名前をXX、年齢nn歳で、Humanのインスタンスを作る

        man.say()
        man.think()
    }
}