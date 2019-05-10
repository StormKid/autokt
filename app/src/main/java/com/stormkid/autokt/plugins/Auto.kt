package com.stormkid.autokt.plugins

import android.app.Application
import com.stardust.autojs.AutoJs

/**

@author ke_li
@date 2019/5/10
 */
class Auto private constructor(application: Application) : AutoJs(application) {


    companion object {
        fun getInstance(application: Application) = let {
            Auto(application)
        }
    }

    override fun ensureAccessibilityServiceEnabled() {
    }

    override fun waitForAccessibilityServiceEnabled() {
    }
}