package example.watarusuzuki.playstoreupdateobservser

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        println("action:" + intent.action)
        println("dataString:" + intent.dataString)
    }
}
