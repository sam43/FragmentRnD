package com.example.sayem.fragmentrnd

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentOne : Fragment() {
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_one, container, false)

        Log.d("FragmentOne", "onCreateView")

        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentOne", "onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentOne", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentOne", "onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("FragmentOne", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FragmentOne", "onStop")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d("FragmentOne", "onAttach $context")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("FragmentOne", "onDetach")
    }
}
