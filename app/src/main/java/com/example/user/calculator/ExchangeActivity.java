package com.example.user.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.math.*;

public class ExchangeActivity extends AppCompatActivity {

    EditText cm;
    String str_cm = null;
    double cm;
    private String[] centimeter = new String[]{"cm", "mm", "dm", "m", "km"};
    private Spinner centimeterSpinner = null;
    ArrayAdapter<String> centimeterAdapter = null;

    EditText min;
    String str_min = null;
    double min;
    private String[] minute = new String[]{"min", "sec", "hour"};
    private Spinner minuteSpinner = null;
    ArrayAdapter<String> minuteAdapter = null;

    //重量转换
    EditText eg;
    String g = null;
    double g;
    private String[] gram = new String[]{"gram", "carat", "kilogram", "ton"};
    private Spinner gramSpinner = null;
    ArrayAdapter<String> gramAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);
        getSupportActionBar().hide();



        ecm = (EditText) findViewById(R.id.et_cm);
        emin = (EditText) findViewById(R.id.et_min);
        eg = (EditText) findViewById(R.id.et_g);

        setSpinner();
        setSpinner1();
        setSpinner2();
    }

    //长度单位转换调用函数
    private void setSpinner() {
        final TextView lengthResult = (TextView) findViewById(R.id.lengthResult);
        centimeterSpinner = (Spinner) findViewById(R.id.spinnerLength);

        //绑定适配器和值
        centimeterAdapter = new ArrayAdapter<String>(ExchangeActivity.this,
                android.R.layout.simple_spinner_item, centimeter);
        centimeterSpinner.setAdapter(centimeterAdapter);
        centimeterSpinner.setSelection(4, true);

        //下拉列表选择事件监听器
        centimeterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                TextView tv = (TextView) view;    //设置颜色
                tv.setTextSize(20.0f);    //设置大小

                str_cm = et_cm.getText().toString();
                cm = Double.parseDouble(str_cm);
                double result = 0;
                switch (i) {
                    case 0:
                        result = cm;
                        lengthResult.setText("Result:  " + result + "cm");
                        break;
                    case 1:
                        result = cm * 10;
                        lengthResult.setText("Result:  " + result + "mm");
                        break;
                    case 2:
                        result = cm / 10;
                        lengthResult.setText("Result:  " + result + "dm");
                        break;
                    case 3:
                        result = cm / 100;
                        lengthResult.setText("Result:  " + result + "m");
                        break;
                    case 4:
                        result = cm / 1000;
                        lengthResult.setText("Result:  " + result + "km");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }


    private void setSpinner1() {

        final TextView timeResult = (TextView) findViewById(R.id.timeResult);
        minuteSpinner = (Spinner) findViewById(R.id.spinnerTime);

        minuteAdapter = new ArrayAdapter<String>(ExchangeActivity.this,
                android.R.layout.simple_spinner_item, minute);
        minuteSpinner.setAdapter(minuteAdapter);

        minuteSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                TextView tv = (TextView) view;    //设置颜色
                tv.setTextSize(20.0f);    //设置大小

                str_min = et_min.getText().toString();
                min = Double.parseDouble(str_min);
                double result = 0;
                switch (i) {
                    case 0:
                        result = min;
                        timeResult.setText("Result:  " + result + "minute");
                        break;
                    case 1:
                        result = min * 60;
                        timeResult.setText("Result:  " + result + "second");
                        break;
                    case 2:
                        result = min / 60;
                        timeResult.setText("Result:  " + result + "hour");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    //重量单位转换调用函数
    private void setSpinner2() {
        final TextView timeResult = (TextView) findViewById(R.id.weightResult);
        gramSpinner = (Spinner) findViewById(R.id.spinnerWeigt);

        //绑定适配器和值
        gramAdapter = new ArrayAdapter<String>(ExchangeActivity.this,
                android.R.layout.simple_spinner_item, gram);
        gramSpinner.setAdapter(gramAdapter);
        gramSpinner.setSelection(3, true);

        //下拉列表选择事件监听器
        package edu.bistu.computer.calculator;

        import android.app.Fragment;
        import android.content.Context;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetailFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
        public class DetailFragment extends Fragment {
            // TODO: Rename parameter arguments, choose names that match
            // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
            private static final String ARG_PARAM1 = "id";
            private static final String ARG_PARAM2 = "param2";

            // TODO: Rename and change types of parameters
            private String mParam1;
            private String mParam2;

            private EditText[] et;
            private TextView[] tv;

            private OnFragmentInteractionListener mListener;

            public DetailFragment() {
                // Required empty public constructor
            }

            /**
             * Use this factory method to create a new instance of
             * this fragment using the provided parameters.
             *
             * @param param1 Parameter 1.
             * @param param2 Parameter 2.
             * @return A new instance of fragment DetailFragment.
             */
            // TODO: Rename and change types and number of parameters
            public static DetailFragment newInstance(String param1, String param2) {
                DetailFragment fragment = new DetailFragment();
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
                View view = inflater.inflate(R.layout.fragment_detail, container, false);
                tv = new TextView[4];
                TextView tv01 = (TextView) view.findViewById(R.id.tv01);
                TextView tv02 = (TextView) view.findViewById(R.id.tv02);
                TextView tv03 = (TextView) view.findViewById(R.id.tv03);
                TextView tv04 = (TextView) view.findViewById(R.id.tv04);
                final Button okConversion = (Button) view.findViewById(R.id.ok_conversion);
                final Button clearCoversion = (Button) view.findViewById(R.id.clear_conversion);
                tv[0] = tv01;
                tv[1] = tv02;
                tv[2] = tv03;
                tv[3] = tv04;

                switch (mParam1) {
                    case "1":
                        tv01.setText("km");
                        tv02.setText("m");
                        tv03.setText("mm");
                        tv04.setText("um");
                        break;
                    case "2":
                        tv01.setText("t");
                        tv02.setText("kg");
                        tv03.setText("g");
                        tv04.setText("mg");
                        break;
                    case "3":
                        tv01.setText("m3");
                        tv02.setText("dm3");
                        tv03.setText("cm3");
                        tv04.setText("mm3");
                        break;
                    case "4":
                        tv01.setText("h");
                        tv02.setText("m");
                        tv03.setText("s");
                        tv04.setText("ms");
                        break;
                    default:
                        break;

                }

                et = new EditText[4];
                et[0] = (EditText) view.findViewById(R.id.et01);
                et[1] = (EditText) view.findViewById(R.id.et02);
                et[2] = (EditText) view.findViewById(R.id.et03);
                et[3] = (EditText) view.findViewById(R.id.et04);

                okConversion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int scale = 0;

                        switch (tv[0].getText().toString()) {
                            case "km":
                            case "t":
                            case "m3":
                                scale = 1000;
                                break;
                            case "h":
                                scale = 60;
                                break;
                            default:
                                break;
                        }

                        int i;
                        for (i = 0; i < et.length; i++) {
                            if (!"".equals(et[i].getText().toString())) {
                                break;
                            }
                        }

                        switch (i) {
                            case 0:
                                et[1].setText(Double.parseDouble(et[0].getText().toString())
                                        * scale + "");
                                et[2].setText(Double.parseDouble(et[0].getText().toString())
                                        * scale * scale + "");
                                et[3].setText(Double.parseDouble(et[0].getText().toString())
                                        * scale * scale + "");
                                break;
                            case 1:
                                et[0].setText(Double.parseDouble(et[1].getText().toString())
                                        / scale + "");
                                et[2].setText(Double.parseDouble(et[1].getText().toString())
                                        * scale + "");
                                et[3].setText(Double.parseDouble(et[1].getText().toString())
                                        * scale * scale + "");
                                break;
                            case 2:
                                et[0].setText(Double.parseDouble(et[2].getText().toString())
                                        / scale / scale + "");
                                et[1].setText(Double.parseDouble(et[2].getText().toString())
                                        / scale + "");
                                et[3].setText(Double.parseDouble(et[2].getText().toString())
                                        * scale + "");
                                break;
                            case 3:
                                et[0].setText(Double.parseDouble(et[3].getText().toString())
                                        / scale / scale / scale + "");
                                et[1].setText(Double.parseDouble(et[3].getText().toString())
                                        / scale / scale + "");
                                et[2].setText(Double.parseDouble(et[3].getText().toString())
                                        / scale + "");
                        }
                    }
                });

                clearCoversion.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        for (EditText edit : et) {
                            edit.setText("");
                        }
                    }
                });
                return view;
            }

            // TODO: Rename method, update argument and hook method into UI event
            public void onButtonPressed(Uri uri) {
                if (mListener != null) {
                    mListener.onFragmentInteraction(uri);
                }
            }

            @Override
            public void onAttach(Context context) {
                super.onAttach(context);
                if (context instanceof OnFragmentInteractionListener) {
                    mListener = (OnFragmentInteractionListener) context;
                } else {
                    throw new RuntimeException(context.toString()
                            + " must implement OnFragmentInteractionListener");
                }
            }

            @Override
            public void onDetach() {
                super.onDetach();
                mListener = null;
            }

            /**
             * This interface must be implemented by activities that contain this
             * fragment to allow an interaction in this fragment to be communicated
             * to the activity and potentially other fragments contained in that
             * activity.
             * <p/>
             * See the Android Training lesson <a href=
             * "http://developer.android.com/training/basics/fragments/communicating.html"
             * >Communicating with Other Fragments</a> for more information.
             */
            public interface OnFragmentInteractionListener {
                // TODO: Update argument type and name
                void onFragmentInteraction(Uri uri);
            }
        }

    }


}

