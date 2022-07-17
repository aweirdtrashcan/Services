package com.aweirdtrashcan.services

import android.app.IntentService
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

//
//class ExampleService: IntentService("HelloIntentService") {
//
//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        Toast.makeText(this, "service starting", Toast.LENGTH_LONG).show()
//        return super.onStartCommand(intent, flags, startId)
//    }
//
//    override fun onHandleIntent(intent: Intent?) {
//        try {
//            Thread.sleep(5000)
//        } catch (e: InterruptedException) {
//            Thread.currentThread().interrupt()
//        }
//    }
//}