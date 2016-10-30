package com.example.user.calculator;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

public class DetailActivity extends Activity implements ConversionFragment.OnListFragmentInteractionListener,
        DetailFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversion_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(ConversionContent.ConversionItem item) {
        Bundle bundle = new Bundle();
        bundle.putString("id",item.id);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(bundle);
        getFragmentManager().beginTransaction().replace(R.id.coversion_detail,fragment).commit();
    }
}
