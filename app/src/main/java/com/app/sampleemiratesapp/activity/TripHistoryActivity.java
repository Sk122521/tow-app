package com.app.sampleemiratesapp.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import com.app.sampleemiratesapp.R;

import java.util.ArrayList;

public class TripHistoryActivity extends AppCompatActivity {
//    FirebaseDatabase database;
//    DatabaseReference riderHistory;
//    RecyclerView.LayoutManager layoutManager;
//    RecyclerView rvHistory;
//    HistoryAdapter adapter;
//    FirebaseAuth mAuth;
//    ArrayList<History> listData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_history);
//        initToolbar();
//        initRecyclerView();
//
//        mAuth = FirebaseAuth.getInstance();
//        database = FirebaseDatabase.getInstance();
//        riderHistory = database.getReference(Common.history_rider);
//        listData = new ArrayList<>();
//        adapter = new HistoryAdapter(this, (ArrayList<History>) listData, new ClickListener() {
//            @Override
//            public void onClick(View view, int index) {
//
//            }
//        });
//        rvHistory.setAdapter(adapter);
//        getHistory();
    }
    private void getHistory(){
//        riderHistory.child(Common.userID).addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                for(DataSnapshot postSnapshot: dataSnapshot.getChildren()){
//                    History history = postSnapshot.getValue(History.class);
//                    listData.add(history);
//                }
//                adapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });

    }
//    private void initRecyclerView(){
//        rvHistory = findViewById(R.id.rvHistory);
//        rvHistory.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        rvHistory.setLayoutManager(layoutManager);
//        rvHistory.setItemAnimator(new DefaultItemAnimator());
//        rvHistory.addItemDecoration(new DividerItemDecoration(getApplicationContext(),LinearLayoutManager.VERTICAL));
//    }
//    private void initToolbar() {
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        toolbar.setTitle("Register");
//
//        ActionBar actionBar=getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//    }
}
