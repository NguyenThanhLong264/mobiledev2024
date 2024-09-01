package vn.edu.usth.weather.ui.theme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import vn.edu.usth.weather.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        This is the lab 3
//        View v = inflater.inflate(R.layout.fragment_forecast,container,false);
//        v.setBackgroundColor(0x20FF0000);

        LinearLayout layout1 = new LinearLayout(getContext());
        layout1.setOrientation(LinearLayout.VERTICAL);
        layout1.setBackgroundColor(0x2000FFFF);

//        View bv = inflater.inflate(R.layout.fragment_forecast,container,false);
//        bv.setBackgroundColor(0x20FF0000);

        TextView tv = new TextView(getContext());
        tv.setText("Thursday");

        ImageView iv = new ImageView((getContext()));
        iv.setImageResource(R.drawable.weather_2);

        layout1.addView(tv);
        layout1.addView(iv);
//        layout1.addView(bv);

        return layout1;
    }
}