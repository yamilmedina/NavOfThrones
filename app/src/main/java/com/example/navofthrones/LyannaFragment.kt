package com.example.navofthrones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.lyanna_fragment.*

class LyannaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lyanna_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        promiseMeButton.setOnClickListener {
            view?.let {
                val action = LyannaFragmentDirections.actionLyannaFragmentToJonSnowFragment()
                action.whoami = getString(R.string.jon_snow)
                Navigation.findNavController(it).navigate(action)
            }
        }
    }
}