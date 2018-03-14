package com.irozon.alertview.interfaces

import com.irozon.alertview.objects.AlertAction

/**
 * Created by hammad.akram on 3/14/18.
 */

interface AlertActionListener {
    fun onActionClick(action: AlertAction)
}
