package jp.ac.asojuku.st.coolalways

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //次へボタンを押したら
        //bt_1.setOnClickListener{onLoginButtonTapped(it)}
        //iBtn_0.setOnClickListener { onReturnButtonTapped(it) }

    }
        //次へが押された時のコールバックメソッド
        //fun onLoginButtonTapped(view: View) {
            //画面遷移スタート
          //  this.startActivity(intent);

        }

    //次へが押された時のコールバックメソッド
    //fun onReturnButtonTapped(view: View) {
        //画面遷移スタート
       // this.startActivity(intent);

    //}

    //}