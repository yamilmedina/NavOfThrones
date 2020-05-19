package com.example.navofthrones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.jonsnow_fragment.*
import kotlinx.android.synthetic.main.lyanna_fragment.*
import kotlinx.android.synthetic.main.rhaegar_fragment.*

class RhaegarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.rhaegar_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        aegonButton.setOnClickListener {
            view?.let {
                val action = RhaegarFragmentDirections.actionRhaegarFragmentToJonSnowFragment()
                action.whoami = getString(R.string.prince)
                Navigation.findNavController(it).navigate(action)
            }
        }
    }
}