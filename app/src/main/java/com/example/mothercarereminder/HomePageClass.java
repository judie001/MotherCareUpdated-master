package com.example.mothercarereminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HomePageClass extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_class);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(Listener);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new AddNotesFragment()).commit();
    }



    private BottomNavigationView.OnNavigationItemSelectedListener Listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFrag = null;
            switch (menuItem.getItemId()){
                case R.id.add:
//                    Toast.makeText(HomePageClass.this, "Add Notes", Toast.LENGTH_SHORT).show();
                    selectedFrag = new AddNotesFragment();
                    break;
                case R.id.view:
//                    Toast.makeText(HomePageClass.this, "View Notes", Toast.LENGTH_SHORT).show();
                    selectedFrag = new ViewNotesFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container,selectedFrag).commit();
            return true;
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.addnote){
//            Toast.makeText(this, "Add Notes", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( HomePageClass.this,MotherNoticeActivity.class );
            startActivity(intent);

        }
        if(id == R.id.viewnotes){
//            Toast.makeText(this, "View Notes", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( HomePageClass.this,ViewNotesActivity.class );
            startActivity(intent);

        }
        if(id == R.id.profile){
//            Toast.makeText(this, "My Profile", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( HomePageClass.this,MyProfileActivity.class );
            startActivity(intent);

        }
        if(id == R.id.contact){
            Toast.makeText(this, "My Help", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( HomePageClass.this,Help.class );
            startActivity(intent);

        }
        return super.onOptionsItemSelected( item );
    }

    public void reply(View view) {




    }
}
