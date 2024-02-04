package com.example.nav_components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
        Navigation
        ----------

        - make intent passing and navigation easy

        Configs
        - build.gradle(module) ->safe args
        - build.gradle(app)

        Components
        - nav_graph.xml ->android resource file  -> type navigation
        res/navigation/nav_graph.xml

        - Nav Host Fragment
        In activity_main.xml -> add a widget view NavHostView

        - Then make new fragments with the plus icon in nav_graph.xml
        - In the .kt of new fragment delete everything but the onCreateView
        - connect them with arrow
        - nav_action ids
        - use this id the pass data and handle clicks

*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}