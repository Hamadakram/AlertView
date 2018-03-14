package com.irozon.alertsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.irozon.alertview.*
import com.irozon.alertview.objects.AlertAction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btShow.setOnClickListener({
            val alert = AlertView("", "What do you want to do with the file?", AlertStyle.DIALOG)
            alert.addAction(AlertAction("Delete it", AlertActionStyle.NEGATIVE, { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            }))
            alert.addAction(AlertAction("Copy", AlertActionStyle.DEFAULT, { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            }))
            alert.addAction(AlertAction("Move", AlertActionStyle.DEFAULT, { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            }))
            alert.addAction(AlertAction("Duplicate", AlertActionStyle.DEFAULT, { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            }))


            alert.setTheme(AlertTheme.DARK)
            alert.show(this)
        })
    }
}
