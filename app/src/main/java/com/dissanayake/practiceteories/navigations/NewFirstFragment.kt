package com.dissanayake.practiceteories.navigations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.dissanayake.practiceteories.R
import kotlinx.android.synthetic.main.fragment_new_first.view.*

class NewFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_new_first, container, false)

        view.textView1.setOnClickListener {

            // passing values to second fragment,A number is passed
            val action = NewFirstFragmentDirections.actionNewFirstFragmentToNavSecondFragment(1998)
            Navigation.findNavController(view).navigate(action)
        }

        return view
    }
}