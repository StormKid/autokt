package com.stormkid.oktool.rule

import java.io.File

interface ProGressRule{
    suspend fun getProgress(progress:Int)

    suspend fun onFinished()

    suspend fun onStartRequest()

    suspend fun onOpenFile(file:File)
}