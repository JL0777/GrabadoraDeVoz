package com.jose.navigationcomponentexample.viewmodel

import androidx.lifecycle.ViewModel
import android.media.MediaRecorder
import android.os.Environment
import java.io.IOException

class RecordViewModel: ViewModel() {
    private var mediaRecorder: MediaRecorder? = null
    private val fileName = "${Environment.getExternalStorageDirectory().absolutePath}/recording.3gp"

    fun starRecording() {
        mediaRecorder = MediaRecorder().apply {
            setAudioSource(MediaRecorder.AudioSource.MIC)
            setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP)
            setOutputFile(fileName)
            setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB)

            try {
                prepare()
                start()
            } catch (e: IOException){
                e.printStackTrace()
            }
        }
    }

    fun stopRecording() {
        mediaRecorder?.apply {
            stop()
            release()
        }
        mediaRecorder = null
    }
}