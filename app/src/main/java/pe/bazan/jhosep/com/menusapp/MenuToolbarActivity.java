package pe.bazan.jhosep.com.menusapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MenuToolbarActivity extends AppCompatActivity {

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        FragmentManager fragmentManager = getSupportFragmentManager();

        switch (id){
            case R.id.action_home:
                //Toast.makeText(this, "Regresando al inicio...", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(this, DummyActivity.class);
                //startActivity(intent);
                fragmentManager.beginTransaction().replace(R.id.content, new     FirstFragment()).commit();
                return true;
            case R.id.action_takepicture:
                fragmentManager.beginTransaction().replace(R.id.content, new SecondFragment()).commit();
                return true;
            case R.id.action_day_view:
                item.setChecked(true);
                fragmentManager.beginTransaction().replace(R.id.content, new ThirdFragment()).commit();
                return true;
            case R.id.action_week_view:
                item.setChecked(true);
                Toast.makeText(this, "Vista semanal activada...", Toast.LENGTH_SHORT).show();
                fragmentManager.beginTransaction().replace(R.id.content, new FirstFragment()).commit();
                fragmentManager.beginTransaction().remove(new FirstFragment()).commit();
                return true;
            case R.id.action_month_view:
                item.setChecked(true);
                Toast.makeText(this, "Vista mensual activada...", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_toggle:
                if(item.isChecked()){
                    item.setChecked(false);
                    Toast.makeText(this, "Modo offline desactivado...", Toast.LENGTH_SHORT).show();
                }else{
                    item.setChecked(true);
                    Toast.makeText(this, "Modo offline activado...", Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.action_about:
                Toast.makeText(this, "Acerca de...", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showFirstFragment(View view){
        // Get FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment
        Fragment fragment = new FirstFragment();

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
    }
}
