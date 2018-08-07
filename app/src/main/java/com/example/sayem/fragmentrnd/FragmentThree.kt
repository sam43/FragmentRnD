package com.example.sayem.fragmentrnd


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentThree : Fragment() {

    private var listener: OnFragmentInteractionListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_one, container, false)
        Log.d("FragmentThree", "onCreateView")
        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentThree", "onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentThree", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentThree", "onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("FragmentThree", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FragmentThree", "onStop")
    }

}
