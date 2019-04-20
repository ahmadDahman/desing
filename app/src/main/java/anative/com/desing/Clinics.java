package anative.com.desing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Clinics extends AppCompatActivity {
    private RecyclerView recyclerView;
    private  RecyclerAdapter recyclerAdapter;
    private ArrayList<ClinicsModel> clinics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinics);
        clinics = new ArrayList<>();
        recyclerView = findViewById(R.id.ClinicRecycleView);

        for (int i = 0;i<10;i++)
        {
            this.clinics.add(new ClinicsModel("Doctor Name" + i , "Description"+i , ""));
        }

        recyclerAdapter = new RecyclerAdapter(this,clinics);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);
    }
}
