package com.wookie_soft.recyclertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.wookie_soft.recyclertest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val fragments:MutableList<Fragment> by lazy { mutableListOf() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

       // val userName = intent.getStringExtra("UserName")

       // binding.tv01.setText(" 반가워요 $userName !")

        fragments.add(FirstFragment()) //0
        supportFragmentManager.beginTransaction().add(R.id.fragment, fragments[0]).commit()

    }

}