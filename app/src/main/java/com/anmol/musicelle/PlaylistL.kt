package com.anmol.musicelle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.Toast

class PlaylistL : AppCompatActivity() {
    lateinit var english: CheckBox
    lateinit var spotifybt: ImageButton
    lateinit var youtubebt: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist_l)
        spotifybt = findViewById(R.id.spotifybt)
        youtubebt = findViewById(R.id.youtubebt)
        val bundle: Bundle? = intent.extras
        val mood = bundle?.get("mood")
        if(mood == "enghap") {
            spotifybt.setOnClickListener() {
                val url = "https://open.spotify.com/playlist/10jDK2qWhMaUzqDFPFRk8P?si=l4lg9HCXQhqj4Nm9Q9tNrA"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            youtubebt.setOnClickListener() {
                val url = "https://music.youtube.com/playlist?list=PLAQ7nLSEnhWTEihjeM1I-ToPDJEKfZHZu&feature=share"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
        if(mood == "engsad") {
            spotifybt.setOnClickListener() {
                val url = "https://open.spotify.com/playlist/4GsJo5A8VH77T2wMPv49gj?si=l_wN2J1MQGOmWTW4FwBOtQ"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            youtubebt.setOnClickListener() {
                val url = "https://music.youtube.com/playlist?list=PL3-sRm8xAzY-w9GS19pLXMyFRTuJcuUjy&feature=share"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
        if(mood == "engrom") {
            spotifybt.setOnClickListener() {
                val url = "https://open.spotify.com/playlist/39gMDOJuJHo9rNHjEvkv6j?si=aKOvHlvrTvKJ2Ia03V0lOw"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            youtubebt.setOnClickListener() {
                val url = "https://music.youtube.com/playlist?list=PLLEaCfa35WfvZNKC5LMYYeNgwx1B_mH8Y&feature=share"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
        if(mood == "hinhap") {
            spotifybt.setOnClickListener() {
                val url = "https://open.spotify.com/playlist/4o4McFADpMaNTwzQLtV4rL?si=HUE-5ry-QYSHKCS3ccBI_w"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            youtubebt.setOnClickListener() {
                val url = "https://music.youtube.com/playlist?list=RDCLAK5uy_l4zXRAZ8rMBbXcICdxzbyQKSaRWRF_-cY&feature=share&playnext=1"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
//        Not Done
        if(mood == "hinsad") {
            spotifybt.setOnClickListener() {
                val url = "https://open.spotify.com/playlist/3BGC6XkBkd76syyRCu7Z89?si=7PzG7ZCdSpO8TjAHTVoRDQ"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            youtubebt.setOnClickListener() {
                val url = "https://music.youtube.com/playlist?list=RDCLAK5uy_l4zXRAZ8rMBbXcICdxzbyQKSaRWRF_-cY&feature=share&playnext=1"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
//        Not Done
        if(mood == "hinrom") {
            spotifybt.setOnClickListener() {
                val url = "https://open.spotify.com/playlist/1vPjat25Mli2eeThGjmbxa?si=n0bD_xXHTvWnayGSdBwyww"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            youtubebt.setOnClickListener() {
                val url = "https://music.youtube.com/playlist?list=RDCLAK5uy_l4zXRAZ8rMBbXcICdxzbyQKSaRWRF_-cY&feature=share&playnext=1"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
//        Not Done
        if(mood == "punhap") {
            spotifybt.setOnClickListener() {
                val url = "https://open.spotify.com/playlist/0orNlDc0XMyJnCcEHOYF6Z?si=RlX-Q7sbRYSFXrIrUjPqGQ"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            youtubebt.setOnClickListener() {
                val url = "https://music.youtube.com/playlist?list=RDCLAK5uy_l4zXRAZ8rMBbXcICdxzbyQKSaRWRF_-cY&feature=share&playnext=1"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
//        Not Done
        if(mood == "punsad") {
            spotifybt.setOnClickListener() {
                val url = "https://open.spotify.com/playlist/1b0sAE7Iux2HlkQGCbxZVQ?si=9EODbudmTqeTOoECEFf18Q"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            youtubebt.setOnClickListener() {
                val url = "https://music.youtube.com/playlist?list=RDCLAK5uy_l4zXRAZ8rMBbXcICdxzbyQKSaRWRF_-cY&feature=share&playnext=1"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
//        Not Done
        if(mood == "punrom") {
            spotifybt.setOnClickListener() {
                val url = "https://open.spotify.com/playlist/0orNlDc0XMyJnCcEHOYF6Z?si=l4S9q15rQVqIqZVdpbbT4A"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            youtubebt.setOnClickListener() {
                val url = "https://music.youtube.com/playlist?list=RDCLAK5uy_l4zXRAZ8rMBbXcICdxzbyQKSaRWRF_-cY&feature=share&playnext=1"
                Toast.makeText(this, mood.toString(), Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }


    }
}