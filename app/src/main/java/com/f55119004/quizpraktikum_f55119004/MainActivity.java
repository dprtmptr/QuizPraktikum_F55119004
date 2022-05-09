package com.f55119004.quizpraktikum_f55119004;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.f55119004.quizpraktikum_f55119004.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_main);

        // Data Dian Pratama
        binding.imgPhoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.dian));
        binding.txtName1.setText("Dian Pratama Putri");
        binding.txtDescription1.setText("Halo, Perkenalkan nama saya Dian Pratama Putri stambuk F55119004");
        // Data Fitrah
        binding.imgPhoto2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.fitra));
        binding.txtName2.setText("Fitrah Aulia");
        binding.txtDescription2.setText("Halo, perkenalkan teman masa sekolah saya namanya Fitrah Aulia");
        // Data Teman
        binding.imgPhoto3.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.teman));
        binding.txtName3.setText("Dian dan Kawan-kawan");
        binding.txtDescription3.setText("Halo, perkenalkan mereka adalah teman-teman saya. Dan sekarang sedang berjuang untuk lulus S1");
    }
}