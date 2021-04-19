package com.irozon.alertview.objects

import com.irozon.alertview.enums.AlertActionStyle
import com.irozon.alertview.interfaces.AlertActionListener

/**
 * Created by hammad.akram on 3/14/18.
 */
class AlertAction {
    var title: String
    var style: AlertActionStyle
    var action: ((AlertAction) -> Unit)?
    var actionListener: AlertActionListener?

    constructor(title: String, style: AlertActionStyle, action: (AlertAction) -> Unit) {
        this.title = title
        this.style = style
        this.action = action
        this.actionListener = null
    }

    constructor(title: String, style: AlertActionStyle, actionListener: AlertActionListener) {
        this.title = title
        this.style = style
        this.actionListener = actionListener
        this.action = null
    }


}