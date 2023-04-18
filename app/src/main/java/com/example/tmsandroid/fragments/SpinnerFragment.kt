package com.example.tmsandroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.example.tmsandroid.R


class SpinnerFragment : Fragment() {

    private lateinit var spinner: Spinner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        spinner = (view?.findViewById(R.id.spinner) ?: "") as Spinner
        val languages = resources.getStringArray(R.array.Languages)

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            languages
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        return inflater.inflate(R.layout.fragment_spinner, container, false)
    }


    companion object {

        @JvmStatic
        fun newInstance() = SpinnerFragment()
    }
}