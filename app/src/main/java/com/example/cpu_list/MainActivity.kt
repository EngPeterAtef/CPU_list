package com.example.cpu_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class CpuData(val name: String, val imageResourceId: Int, val description: String)

class MainActivity : AppCompatActivity() {
    private val cpuList = listOf(
        CpuData("Intel Core i7", R.drawable.cpu_intel_core_i7,"Deliver a fantastic entertainment and gaming experience with latest Intel® Core™ i7 processors featuring built-in AI and Wi-Fi 6."),
        CpuData("AMD Ryzen 7", R.drawable.cpu_amd_ryzen_7,"AMD Ryzen™ 7 5800X elite gaming desktop processors comes with 8 cores optimized for high-FPS gaming rigs"),
        CpuData("Apple M1", R.drawable.cpu_apple_m1,"MacBook Air with M1 combines incredible performance with incredible value. All in a slim, portable design with up to 18 hours of battery life."),        CpuData("Intel Core i7", R.drawable.cpu_intel_core_i7,"Deliver a fantastic entertainment and gaming experience with latest Intel® Core™ i7 processors featuring built-in AI and Wi-Fi 6."),
        CpuData("AMD Ryzen 7", R.drawable.cpu_amd_ryzen_7,"AMD Ryzen™ 7 5800X elite gaming desktop processors comes with 8 cores optimized for high-FPS gaming rigs"),
        CpuData("Apple M1", R.drawable.cpu_apple_m1,"MacBook Air with M1 combines incredible performance with incredible value. All in a slim, portable design with up to 18 hours of battery life."),        CpuData("Intel Core i7", R.drawable.cpu_intel_core_i7,"Deliver a fantastic entertainment and gaming experience with latest Intel® Core™ i7 processors featuring built-in AI and Wi-Fi 6."),
        CpuData("AMD Ryzen 7", R.drawable.cpu_amd_ryzen_7,"AMD Ryzen™ 7 5800X elite gaming desktop processors comes with 8 cores optimized for high-FPS gaming rigs"),
        CpuData("Apple M1", R.drawable.cpu_apple_m1,"MacBook Air with M1 combines incredible performance with incredible value. All in a slim, portable design with up to 18 hours of battery life."),        CpuData("Intel Core i7", R.drawable.cpu_intel_core_i7,"Deliver a fantastic entertainment and gaming experience with latest Intel® Core™ i7 processors featuring built-in AI and Wi-Fi 6."),
        CpuData("AMD Ryzen 7", R.drawable.cpu_amd_ryzen_7,"AMD Ryzen™ 7 5800X elite gaming desktop processors comes with 8 cores optimized for high-FPS gaming rigs"),
        CpuData("Apple M1", R.drawable.cpu_apple_m1,"MacBook Air with M1 combines incredible performance with incredible value. All in a slim, portable design with up to 18 hours of battery life."),        CpuData("Intel Core i7", R.drawable.cpu_intel_core_i7,"Deliver a fantastic entertainment and gaming experience with latest Intel® Core™ i7 processors featuring built-in AI and Wi-Fi 6."),
        CpuData("AMD Ryzen 7", R.drawable.cpu_amd_ryzen_7,"AMD Ryzen™ 7 5800X elite gaming desktop processors comes with 8 cores optimized for high-FPS gaming rigs"),
        CpuData("Apple M1", R.drawable.cpu_apple_m1,"MacBook Air with M1 combines incredible performance with incredible value. All in a slim, portable design with up to 18 hours of battery life."),        CpuData("Intel Core i7", R.drawable.cpu_intel_core_i7,"Deliver a fantastic entertainment and gaming experience with latest Intel® Core™ i7 processors featuring built-in AI and Wi-Fi 6."),
        CpuData("AMD Ryzen 7", R.drawable.cpu_amd_ryzen_7,"AMD Ryzen™ 7 5800X elite gaming desktop processors comes with 8 cores optimized for high-FPS gaming rigs"),
        CpuData("Apple M1", R.drawable.cpu_apple_m1,"MacBook Air with M1 combines incredible performance with incredible value. All in a slim, portable design with up to 18 hours of battery life.")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        app bar title
        supportActionBar?.title = "CPU List"
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val adapter = CpuListAdapter(cpuList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}