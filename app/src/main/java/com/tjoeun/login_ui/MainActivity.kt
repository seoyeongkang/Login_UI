package com.tjoeun.login_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

//            입력된 이메일 / 비번 가져오기
            val inputEmail = editEm.text.toString()
            val inputPw = editPw.text.toString()

//            가져온 이메일/비번 값 검사

            if(inputEmail == "admin@test.com" && inputPw == "qwer"){
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인에 실패했습니다..", Toast.LENGTH_SHORT).show()
            }
        }
    }
}