package com.anmol.musicelle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class manual_select : AppCompatActivity() {
    lateinit var englan: CheckBox
    lateinit var hinlan: CheckBox
    lateinit var punlan: CheckBox
    lateinit var happycb: CheckBox
    lateinit var sadcb: CheckBox
    lateinit var romanticcb: CheckBox
    lateinit var manualInputs: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual_select)
        englan = findViewById(R.id.englan)
        hinlan = findViewById(R.id.hinlan)
        punlan = findViewById(R.id.punlan)
        happycb = findViewById(R.id.happycb)
        sadcb = findViewById(R.id.sadcb)
        romanticcb = findViewById(R.id.romanticcb)
        val manualnext: Button = findViewById(R.id.manualnext)
        manualInputs = ArrayList()
        manualnext.setOnClickListener {
            val intent = Intent(this, PlaylistL::class.java)
            if (englan.isChecked && happycb.isChecked) {
                intent.putExtra("mood", "enghap")
                startActivity(intent)
                Toast.makeText(this, "eng and happy", Toast.LENGTH_SHORT).show()
            }
            if (englan.isChecked && sadcb.isChecked) {
                intent.putExtra("mood", "engsad")
                startActivity(intent)
                Toast.makeText(this, "eng and sad", Toast.LENGTH_SHORT).show()
            }
            if (englan.isChecked && romanticcb.isChecked) {
                intent.putExtra("mood", "engrom")
                startActivity(intent)
                Toast.makeText(this, "eng and romantic", Toast.LENGTH_SHORT).show()
            }
            if (hinlan.isChecked && happycb.isChecked) {
                intent.putExtra("mood", "hinhap")
                startActivity(intent)
                Toast.makeText(this, "hindi happy", Toast.LENGTH_SHORT).show()
            }
            if (hinlan.isChecked && sadcb.isChecked) {
                intent.putExtra("mood", "hinsad")
                startActivity(intent)
                Toast.makeText(this, "hindi and sad", Toast.LENGTH_SHORT).show()
            }
            if (hinlan.isChecked && romanticcb.isChecked) {
                intent.putExtra("mood", "hinrom")
                startActivity(intent)
                Toast.makeText(this, "hindi and romantic", Toast.LENGTH_SHORT).show()
            }
            if (punlan.isChecked && happycb.isChecked) {
                intent.putExtra("mood", "punhap")
                startActivity(intent)
                Toast.makeText(this, "punjabi and happy", Toast.LENGTH_SHORT).show()
            }
            if (punlan.isChecked && sadcb.isChecked) {
                intent.putExtra("mood", "punsad")
                startActivity(intent)
                Toast.makeText(this, "punjabi and sad", Toast.LENGTH_SHORT).show()
            }
            if (punlan.isChecked && romanticcb.isChecked) {
                intent.putExtra("mood", "punrom")
                startActivity(intent)
                Toast.makeText(this, "punjabi and romantic", Toast.LENGTH_SHORT).show()
            }
//            onPause(manualInputs)

        }
    }
}