package com.example.tmsandroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.tmsandroid.R


class LanguagesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_languages, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spinnerInitializing()
        listViewInitializing()
        changeFragmentButton()
    }

    private fun listViewInitializing() {
        val listView =
            view?.findViewById<ListView>(R.id.list_view_of_languages) //initialize listView
        val languages = resources.getStringArray(R.array.Languages) //initialize elements


        //initialize adapter for listView
        val listViewAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            languages
        )
        listViewAdapter.setDropDownViewResource(android.R.layout.list_content)
        listView?.adapter = listViewAdapter


        //creating toast of selected element from listview
        listView?.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val selectedItem =
                    parent.getItemAtPosition(position) as String
                Toast.makeText(context, selectedItem, Toast.LENGTH_SHORT).show()
            }
    }


    private fun spinnerInitializing() {
        val spinner = view?.findViewById<Spinner>(R.id.spinner_of_languages) //initialize spinner
        val languages = resources.getStringArray(R.array.Languages) //initialize elements


        //initialize adapter for spinner
        val spinnerAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            languages
        )
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner?.adapter = spinnerAdapter


        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                Toast.makeText(
                    context,
                    selectedItem,
                    Toast.LENGTH_LONG
                ).show()
            } // to close the onItemSelected

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    private fun changeFragmentButton() {
        val button = view?.findViewById<Button>(R.id.to_fragment_button)
        val fragmentManager = requireActivity().supportFragmentManager

        button?.setOnClickListener {
            val fragment = NewsFragment.newInstance()
            val transaction = fragmentManager.beginTransaction()

            transaction.replace(R.id.fragment_container_view, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = LanguagesFragment()
    }
}