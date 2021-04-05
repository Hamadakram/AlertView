package com.irozon.alertsample

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.irozon.alertview.AlertView
import com.irozon.alertview.enums.AlertActionStyle
import com.irozon.alertview.enums.AlertStyle
import com.irozon.alertview.enums.AlertTheme
import com.irozon.alertview.objects.AlertAction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        normal_dialog_button.setOnClickListener {
            val alert = AlertView("The Post", "What do you want to do with this post?", AlertStyle.DIALOG)

            alert.addAction(AlertAction("Bookmark", AlertActionStyle.POSITIVE) { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            })
            alert.addAction(AlertAction("Report", AlertActionStyle.DEFAULT) { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            })
            alert.addAction(AlertAction("Share", AlertActionStyle.DEFAULT) { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            })
            alert.addAction(AlertAction("Cancel", AlertActionStyle.DEFAULT) { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            })

            if (switchButton.isChecked) {
                alert.setTheme(AlertTheme.DARK)
            }

            alert.show(this)
        }

        bottom_sheet_dialog_button.setOnClickListener {
            val alert = AlertView("Sort By", "Select a field to sort the list", AlertStyle.BOTTOM_SHEET)

            alert.addAction(AlertAction("A to Z", AlertActionStyle.DEFAULT) { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            })
            alert.addAction(AlertAction("New to Old", AlertActionStyle.DEFAULT) { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            })
            alert.addAction(AlertAction("Old to New", AlertActionStyle.DEFAULT) { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            })
            alert.addAction(AlertAction("Last Modified", AlertActionStyle.DEFAULT) { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            })
            if (switchButton.isChecked) {
                alert.setTheme(AlertTheme.DARK)
            }

            alert.show(this)
        }

        ios_dialog_button.setOnClickListener {
            val alert = AlertView("The Post", "Do you want to discard this post?", AlertStyle.IOS)

            alert.addAction(AlertAction("Discard", AlertActionStyle.NEGATIVE) { action ->
                Toast.makeText(this, action.title, Toast.LENGTH_SHORT).show()
            })

            if (switchButton.isChecked) {
                alert.setTheme(AlertTheme.DARK)
            }
            alert.setCancelButtonText("Keep writing")
            alert.show(this)
        }
    }
}
