package com.divyank.fragmentsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.divyank.fragmentsdemo.databinding.ActivityMainBinding
import com.divyank.fragmentsdemo.fragments.BlankFragment1
import com.divyank.fragmentsdemo.fragments.BlankFragment2

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val manager =supportFragmentManager
        val tr = manager.beginTransaction()
        tr.replace(R.id.frame,BlankFragment1())
        tr.commit()
        binding.button1.setOnClickListener {
            val manager =supportFragmentManager
            val tr = manager.beginTransaction()
            tr.replace(R.id.frame,BlankFragment1())
            tr.addToBackStack(null)
            tr.commit()
        }

        binding.button2.setOnClickListener {
            val manager =supportFragmentManager
            val tr = manager.beginTransaction()
            tr.replace(R.id.frame, BlankFragment2())
            tr.addToBackStack(null)
            tr.commit()
        }
    }
}




