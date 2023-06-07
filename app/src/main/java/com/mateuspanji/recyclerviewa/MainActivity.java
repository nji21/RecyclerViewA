package com.mateuspanji.recyclerviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView _recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView) findViewById(R.id.recycleView1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("MALAYSIA");
        nm.setDeskripsi("Negara ini menggunakan bendera dengan lambang bulan sabit dan matahari.");
        nm.setUrl("https://icons.iconarchive.com/icons/wikipedia/flags/48/MY-Malaysia-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("INDIA");
        nm.setDeskripsi("Kota Mumbai adalah pusat wilayah metropolitan india");
        nm.setUrl("https://icons.iconarchive.com/icons/wikipedia/flags/48/IN-India-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("SINGAPURA");
        nm.setDeskripsi("Merupakan salah satu negara maju di benua asia dengan lambang kenegaraan singa");
        nm.setUrl("https://icons.iconarchive.com/icons/wikipedia/flags/48/SG-Singapore-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("THAILAND");
        nm.setDeskripsi("Negara kota Bangkok dengan perkembangan terpesat, dengan ekonomi yang dinamis dan kemasyarakatan yang progresif di Asia Tenggara");
        nm.setUrl("https://icons.iconarchive.com/icons/wikipedia/flags/48/TH-Thailand-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("INDONESIA");
        nm.setDeskripsi("Negara dengan lambang kenegaraan Garuda, dan bendera negara Merah Putih");
        nm.setUrl("https://icons.iconarchive.com/icons/wikipedia/flags/48/ID-Indonesia-Flag-icon.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);
    }
}