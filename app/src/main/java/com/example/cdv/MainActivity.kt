package com.example.cdv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val CDV_LOG_CAT: String = "CDV_LOGCAT_TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Iniciando cdv completo
        Log.v(CDV_LOG_CAT, "onCreate: Iniciando ciclo COMPLETO")
    }

    override fun onStart() {
        super.onStart()
        Log.v(CDV_LOG_CAT, "onStart: Iniciando ciclo VISÍVEL")
    }

    override fun onResume() {
        super.onResume()
        Log.v(CDV_LOG_CAT, "onResume: Iniciando ciclo em PRIMEIRO PLANO")
    }

    override fun onPause() {
        super.onPause()
        Log.v(CDV_LOG_CAT, "onPause: Finalizando ciclo em PRIMEIRO PLANO")
    }

    override fun onStop() {
        super.onStop()
        Log.v(CDV_LOG_CAT, "onStop: Finalizando o ciclo VISÍVEL")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(CDV_LOG_CAT, "onDestroy: Finaliza o ciclo de vida COMPLETO")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(CDV_LOG_CAT, "onRestart: Preparando chamada do onStart")
    }
}