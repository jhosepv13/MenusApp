package pe.bazan.jhosep.com.menusapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    public void showFirstFragment(View view){
        // Get FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment
        Fragment fragment = new FirstFragment();

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
    }

    public void showSecondFragment(View view){
        // Get FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment
        Fragment fragment = new SecondFragment();

        // Send 'param1' argument to Fragment
        Bundle args = new Bundle();
        args.putString("param1", "Hello Fragment!");
        fragment.setArguments(args);

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
    }

    public void showThirdFragment(View view){
        // Get FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment with factory
        Fragment fragment = ThirdFragment.newInstance("Hello Again!");

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
    }

}
