package com.example.tmsandroid.app.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import com.example.tmsandroid.R
import com.example.tmsandroid.app.presentation.view_models.TestCoroutineViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

class TestCoroutineFragment : Fragment(R.layout.test_coroutine_fragment) {

    private lateinit var binding: TestCoroutineFragment
    private val viewModel: TestCoroutineViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initCoroutines()
    }

    private fun initCoroutines() {
        viewModel.viewModelScope.launch {
            Log.d("COROUTINES", "Start working with coroutines...")
            launchDownloadFiles()
            asyncDownloadFiles()
            Log.d("COROUTINES", "all files have been downloaded")
        }
    }


    private suspend fun launchDownloadFiles() = withContext(IO) {
        coroutineScope {
            launch { launchFirstFile() }
            launch { launchSecondFile() }
            launch { launchThirdFile() }
            launch { launchForthFile() }
            launch { launchFifthFile() }
        }
    }

    private suspend fun asyncDownloadFiles() = withContext(IO) {
        coroutineScope {
            async {asyncFirstFile()}
            async {asyncSecondFile()}
            async {asyncThirdFile()}
            async {asyncForthFile()}
            async {asyncFifthFile()}
        }
    }

    // ============================== Launch download ================================

    private suspend fun launchFirstFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading FIRST file with launch ....")
        delay(3000)
        Log.d("COROUTINES", "FIRST file have been downloaded")
    }

    private suspend fun launchSecondFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading SECOND file with launch ....")
        delay(3000)
        Log.d("COROUTINES", "SECOND file have been downloaded")
    }

    private suspend fun launchThirdFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading Third file with launch ....")
        delay(3000)
        Log.d("COROUTINES", "Third file have been downloaded")
    }

    private suspend fun launchForthFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading Forth file with launch ....")
        delay(3000)
        Log.d("COROUTINES", "Forth file have been downloaded")
    }

    private suspend fun launchFifthFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading Fifth file with launch ....")
        delay(3000)
        Log.d("COROUTINES", "Fifth file have been downloaded")
    }

    // ============================== Async download ================================

    private suspend fun asyncFirstFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading FIRST file with async ....")
        delay(3000)
        Log.d("COROUTINES", "FIRST file have been downloaded (async)!")
    }

    private suspend fun asyncSecondFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading SECOND file with async ....")
        delay(3000)
        Log.d("COROUTINES", "SECOND file have been downloaded (async)")
    }

    private suspend fun asyncThirdFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading Third file with async ....")
        delay(3000)
        Log.d("COROUTINES", "Third file have been downloaded (async)")
    }

    private suspend fun asyncForthFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading Forth file with async ....")
        delay(3000)
        Log.d("COROUTINES", "Forth file have been downloaded (async)")
    }

    private suspend fun asyncFifthFile() = withContext(IO) {
        Log.d("COROUTINES", "... Starting downloading Fifth file with async ....")
        delay(3000)
        Log.d("COROUTINES", "Fifth file have been downloaded (async)")
    }

}

