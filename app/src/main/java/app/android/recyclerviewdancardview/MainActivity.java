package app.android.recyclerviewdancardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRe;
    DataAdapter adapter;
    private ArrayList<Musik> listMusik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRe = (RecyclerView) findViewById(R.id.myRe);

        addData();    
        
        adapter = new DataAdapter(listMusik);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        myRe.setLayoutManager(layoutManager);
        myRe.setAdapter(adapter);
    }

    private void addData() {
        listMusik = new ArrayList<>();
        listMusik.add(new Musik("DNCE", "Cake By The Ocean", "2015" , R.drawable.cake_by_the_ocean));
        listMusik.add(new Musik("Ariana Grande", "Dangerous Woman", "2016" , R.drawable.dangerous_woman));
        listMusik.add(new Musik("The Chainsmoker", "Dont Let Me Down", "2017" , R.drawable.dont_let_me_down));
        listMusik.add(new Musik("Zayn Malik", "Pillow Talk", "2018" , R.drawable.pillow_talk));
        listMusik.add(new Musik("Justin Bieber", "Love Yourself", "2019" , R.drawable.love_yourself));
        listMusik.add(new Musik("Twenty One Pilots", "Streesed Out", "2010" , R.drawable.stressed_out));
    }
}
