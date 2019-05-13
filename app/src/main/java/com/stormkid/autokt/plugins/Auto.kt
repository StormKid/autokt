package com.stormkid.autokt.plugins

import android.app.Application
import com.stardust.autojs.AutoJs
import com.stardust.autojs.core.console.GlobalStardustConsole
import com.stardust.autojs.runtime.api.Console

/**

@author ke_li
@date 2019/5/10
 */
class Auto private constructor(application: Application) : AutoJs(application) {

    companion object {
        private var auto:Auto? = null
        fun setInstance(application: Application) = let {
            auto = Auto(application)
            auto
        }
        fun getInstance() = auto

    }

    override fun ensureAccessibilityServiceEnabled() {
    }

    override fun waitForAccessibilityServiceEnabled() {
    }

    /**
     * 全局创建控制器
     */
    override fun createGlobalConsole(): Console {
        return object : GlobalStardustConsole(uiHandler) {
            override fun println(level: Int, charSequence: CharSequence): String? {
                val log = super.println(level, charSequence)
//                DevPluginService.getInstance().log(log)
                return log
            }
        }
    }
}