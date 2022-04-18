package com.example.u_farm

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgs
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.u_farm.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

import java.lang.reflect.Array.get


class HomeActivity : AppCompatActivity() {
    lateinit var bottomNavigationView:BottomNavigationView
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding=DataBindingUtil.setContentView<ActivityHomeBinding>(this,R.layout.activity_home)



        bottomNavigationView = binding.bottomNavigation

        val navController=findNavController(R.id.fragmentContainerView)
        val appBarConfiguration= AppBarConfiguration(setOf(R.id.home,R.id.news))

        setupActionBarWithNavController(navController,appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)
    }



}