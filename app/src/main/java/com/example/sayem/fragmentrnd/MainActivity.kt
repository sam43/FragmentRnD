package com.example.sayem.fragmentrnd

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var frag: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.container, FragmentOne()).commit()
        }
        btn1.setOnClickListener{
            frag = FragmentOne()
            enterNextFragment()
        }
        btn2.setOnClickListener{
            /*Toast.makeText(this@MainActivity, "frag2", Toast.LENGTH_SHORT).show()*/
            frag = FragmentTwo()
            enterNextFragment()
        }
        btn3.setOnClickListener{
            /*Toast.makeText(this@MainActivity, "frag3", Toast.LENGTH_SHORT).show()*/
            frag = FragmentThree()
            enterNextFragment()
        }
    }

    private fun enterNextFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.addToBackStack(null)
        transaction.replace(R.id.container, frag).commit()
    }
}
