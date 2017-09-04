package com.mobilemonkeysoftware.recycler

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by AR on 04/09/2017.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = MainAdapter(mutableListOf())

        with(recycler.adapter as MainAdapter) {

            Observable
                    .fromIterable(mutableListOf(
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item02(Data02("2", true, "ACTION")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item00(Data00("0")),
                            Item01(Data01("1", "1", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item02(Data02("2", true, "ACTION")),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item03(Data03("3", true, "ACTION", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item05(Data05("5", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item06(Data06("6", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg")),
                            Item07(Data07("7", "7")),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg")),
                            Item08(Data08("8", "8", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item09(Data09("9", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/sunspotthumb1.jpg", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/35762625713_ec6cc0f232_o.jpg")),
                            Item10(Data10("10", true)),
                            Item04(Data04("4", "https://www.nasa.gov/sites/default/files/styles/full_width_feature/public/thumbnails/image/esp_050703_2560.jpg"))
                    ))
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe { add(it) }
        }
    }
}
