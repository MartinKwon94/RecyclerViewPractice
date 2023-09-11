package com.example.recyclerviewpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val dataList = mutableListOf<Item>()
//    lateinit var activityResultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //메인액티비티 바인딩


        dataList.add(
            Item(
                R.drawable.sample1,
                "선풍기 팝니다",
                "30000원"
            )
        )
        dataList.add(
            Item(
                R.drawable.sample2,
                "김치냉장고 팝니다",
                "600000원"
            )
        )
        dataList.add(
            Item(
                R.drawable.sample3,
                "샤넬 카드지갑 팝니다",
                "800000원"
            )
        )
        dataList.add(
            Item(
                R.drawable.sample4,
                "금고팝니다",
                "2000000원"
            )
        )
        dataList.add(
            Item(
                R.drawable.sample5,
                "갤럭기플립 팝니다",
                "700000원"
            )
        )
        dataList.add(
            Item(
                R.drawable.sample6,
                "프라다백 팝니다",
                "2000000원"
            )
        )
        dataList.add(
            Item(
                R.drawable.sample7,
                "펜트하우스 숙박권 양도",
                "300000원"
            )
        )
        dataList.add(
            Item(
                R.drawable.sample8,
                "샤넬백 팝니다",
                "1800000원"
            )
        )
        dataList.add(
            Item(
                R.drawable.sample9,
                "엔진분무기 팝니다",
                "190000원"
            )
        )
        dataList.add(
            Item(
                R.drawable.sample10,
                "셀린느 버킷백 팝니다",
                "2100000원"
            )
        )
        val adapter = MyAdapter(dataList)
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        //어댑터 정의

//        adapter.itemClick = object : MyAdapter.ItemClick {
//            override fun onClick(view: View, position: Int) {
//                Toast.makeText(this@MainActivity, "클릭", Toast.LENGTH_SHORT).show()
//                val intent = Intent(this@MainActivity,DetailActivity::class.java)
//
//                activityResultLauncher.launch(intent)
//            }
//        }//리사이클러뷰를 클릭했을때


    }
}