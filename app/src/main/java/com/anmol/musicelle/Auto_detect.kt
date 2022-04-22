package com.anmol.musicelle

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class Auto_detect : AppCompatActivity() {
    lateinit var resultLauncher: ActivityResultLauncher<Intent>
    lateinit var startfacedetect: Button
    lateinit var ivPhoto: ImageView
    private var currentImagePath: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_detect)
        startfacedetect = findViewById(R.id.startfacedetect)
//        val REQUEST_IMAGE_CAPTURE = 1
        resultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode == Activity.RESULT_OK) {
                    handleCameraImage(result.data)
                }
            }
        startfacedetect.setOnClickListener {
            Toast.makeText(this,"Hey",Toast.LENGTH_SHORT).show()
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            resultLauncher.launch(cameraIntent)

        }
    }

    private fun handleCameraImage(intent: Intent?) {
        val bitmap = intent?.extras?.get("data") as Bitmap
        ivPhoto.setImageBitmap(bitmap)

    }
}