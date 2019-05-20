package com.stormkid.oktool.rule

import java.io.File

/**

@author ke_li
@date 2018/11/19
 */
interface DownLoadRule {
    fun onFinished(file:File)

    fun onNetErr()
}