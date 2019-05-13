package com.stormkid.autokt.plugins

import com.stardust.autojs.execution.ScriptExecution
import com.stardust.autojs.execution.ScriptExecutionListener

/**

@author ke_li
@date 2019/5/13
 */
class ExcutionCallback : ScriptExecutionListener {

    companion object {
        const val  EXCUTION_FLAG = "EXCUTION_FLAG"
    }


    override fun onStart(execution: ScriptExecution?) {
        execution?.engine?.setTag(EXCUTION_FLAG,System.currentTimeMillis())?:return
    }


    private fun idealExecution(execution: ScriptExecution?){
         execution?: return
    }

    override fun onSuccess(execution: ScriptExecution?, result: Any?) {
    }

    override fun onException(execution: ScriptExecution?, e: Exception?) {

    }
}