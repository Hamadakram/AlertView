package com.irozon.alertview

import androidx.appcompat.app.AppCompatActivity
import com.irozon.alertview.enums.AlertStyle
import com.irozon.alertview.enums.AlertTheme
import com.irozon.alertview.fragments.BottomSheetFragment
import com.irozon.alertview.fragments.DialogFragment
import com.irozon.alertview.fragments.IosSheetFragment
import com.irozon.alertview.objects.AlertAction

/**
 * Created by hammad.akram on 3/14/18.
 */
class AlertView(private var title: String, private var message: String,
                private var style: AlertStyle) {

    private var cancelButtonText: String = ""
    private var theme: AlertTheme = AlertTheme.LIGHT
    private var actions: ArrayList<AlertAction> = ArrayList()

    /**
     * Add Actions to AlertView
     * @param action: AlertAction
     */
    fun addAction(action: AlertAction) {
        actions.add(action)
    }

    /**
     * Add Actions to AlertView
     * @param string: String
     */
    fun setCancelButtonText(string: String) {
        this.cancelButtonText = string
    }

    /**
     * Show AlertView
     * @param activity: AppCompatActivity
     */
    fun show(activity: AppCompatActivity) {
        when (style) {
            AlertStyle.BOTTOM_SHEET -> {
                val bottomSheet = BottomSheetFragment(title, message, actions, theme)
                bottomSheet.show(activity.supportFragmentManager, bottomSheet.tag)
            }
            AlertStyle.IOS -> {
                val bottomSheet = IosSheetFragment(title, message, actions, theme, cancelButtonText)
                bottomSheet.show(activity.supportFragmentManager, bottomSheet.tag)
            }
            AlertStyle.DIALOG -> {
                val bottomSheet = DialogFragment(title, message, actions, theme)
                bottomSheet.show(activity.supportFragmentManager, bottomSheet.tag)
            }
        }
    }

    /**
     * Set theme for the AlertView
     * @param theme: AlertTheme
     */
    fun setTheme(theme: AlertTheme) {
        this.theme = theme
    }
}