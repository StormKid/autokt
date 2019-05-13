package com.stormkid.okhttpkt.asyc

import android.content.Context
import android.util.Log
import com.stormkid.okhttpkt.cache.FileCache
import com.stormkid.okhttpkt.rule.CallbackRule
import com.stormkid.okhttpkt.rule.ProGressRule
import com.stormkid.okhttpkt.utils.FileCallbackNeed
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException

/**

@author ke_li
@date 2018/7/18
 */
class DownloadManager(private val fileCallbackNeed: FileCallbackNeed,
                         private val proGressRule: ProGressRule) : Callback {
    override fun onFailure(call: Call?, e: IOException?) {

    }

    override fun onResponse(call: Call?, response: Response?) {
        if (null == response) return
        runBlocking {  launch (Dispatchers.Main){ proGressRule.onFinished() }}
    }




    /**
     * 断点续传
     */
    private fun writePerFile() {}


    private fun caculateProgress(current: Long) = let {
        val percent = current * 100 / fileCallbackNeed.initTotal
        percent.toInt()
    }

}