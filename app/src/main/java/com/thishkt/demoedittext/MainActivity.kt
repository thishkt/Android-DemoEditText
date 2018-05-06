package com.thishkt.demoedittext

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.EditorInfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        //設定文字輸入框，獲取焦點，升起數字鍵盤
        et1.inputType = EditorInfo.TYPE_CLASS_NUMBER
        et2.inputType = EditorInfo.TYPE_CLASS_NUMBER

        btn_clac.setOnClickListener {

            if (et1.text.isNullOrEmpty() && et2.text.isNullOrEmpty()) {
                tv_result.text = "輸入資料有誤"
            } else {
                //獲取文字框內容，並轉成「整數」資料型態
                var val1 = et1.text.toString().toInt()
                var val2 = et2.text.toString().toInt()

                //將兩個變數相加
                var result_val = val1 + val2

                //文字框內容只能是字串，所以須將整數結果轉為字串
                tv_result.text = result_val.toString()
            }
        }
    }
}
