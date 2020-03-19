package com.example.project_firebase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null)
            supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        //get firebase database reference
        var mRootRef = FirebaseDatabase.getInstance().reference
        var mTopicsRef = mRootRef.child("Topic")
        //var mDetailsRef = mRootRef.child("Detail")

        btn_save.setOnClickListener{
            var inputtext = text_input.text.toString()
            Toast.makeText(this, "Input : "+inputtext, Toast.LENGTH_LONG).show()
        }
    }

}
