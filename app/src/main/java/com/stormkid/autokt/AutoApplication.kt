package com.stormkid.autokt

import androidx.multidex.MultiDexApplication
import com.stardust.app.GlobalAppContext
import org.litepal.LitePal

/**

@author ke_li
@date 2019/5/10
 */
class AutoApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        LitePal.initialize(this)
        GlobalAppContext.set(this)

    }


    private fun initTool(){


    }
}