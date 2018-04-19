package pe.bazan.jhosep.com.menusapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private static final String TAG = SecondFragment.class.getSimpleName();

    private String param1;


    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");

        // Get argument param1 if exists
        if (getArguments() != null) {
            this.param1 = getArguments().getString("param1");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView");
        View view = inflater.inflate(R.layout.fragment_second, container, false);


        //TextView textView = (TextView)view.findViewById(R.id.textview);
        //textView.setText(textView.getText() + "\nParam1: " + param1);

        return view;

    }

}
