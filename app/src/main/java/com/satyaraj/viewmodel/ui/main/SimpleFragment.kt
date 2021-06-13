package com.satyaraj.viewmodel.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.satyaraj.viewmodel.R

class SimpleFragment : Fragment() {

    companion object {
        fun newInstance() = SimpleFragment()
    }

    private val viewModel: SimpleViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.simple_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val message = view.findViewById<TextView>(R.id.message)

        viewModel.getDisplayString().observe(viewLifecycleOwner, {
            message.text = it
        })
    }

}