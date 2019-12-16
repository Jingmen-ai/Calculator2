package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class unit_convert extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_convert);
        EditText ET1=(EditText)findViewById(R.id.textView21);
        EditText ET2=(EditText)findViewById(R.id.textView23);
        EditText ET3=(EditText)findViewById(R.id.textView25);
        EditText ET4=(EditText)findViewById(R.id.textView27);
        EditText ET5=(EditText)findViewById(R.id.textView29);
        EditText ET6=(EditText)findViewById(R.id.textView32);
        EditText ET7=(EditText)findViewById(R.id.textView34);
        EditText ET8=(EditText)findViewById(R.id.textView36);
        EditText ET9=(EditText)findViewById(R.id.textView38);
        EditText ET10=(EditText)findViewById(R.id.textView40);
        EditText ET11=(EditText)findViewById(R.id.textView42);
        EditText ET12=(EditText)findViewById(R.id.textView44);
        EditText ET13=(EditText)findViewById(R.id.textView47);
        EditText ET14=(EditText)findViewById(R.id.textView49);
        EditText ET15=(EditText)findViewById(R.id.textView51);
        EditText ET16=(EditText)findViewById(R.id.textView53);
        EditText ET17=(EditText)findViewById(R.id.textView55);
        final TextView T1=(TextView)findViewById(R.id.textView57) ;
        final TextView T2=(TextView)findViewById(R.id.textView58) ;
        final TextView T3=(TextView)findViewById(R.id.textView59) ;
        final TextView T4=(TextView)findViewById(R.id.textView60) ;
        final TextView T5=(TextView)findViewById(R.id.textView61) ;
        final TextView T6=(TextView)findViewById(R.id.textView62) ;
        final TextView T7=(TextView)findViewById(R.id.textView63) ;
        final TextView T8=(TextView)findViewById(R.id.textView64) ;
        final TextView T9=(TextView)findViewById(R.id.textView65) ;
        final TextView T10=(TextView)findViewById(R.id.textView66) ;
        final TextView T11=(TextView)findViewById(R.id.textView67) ;
        final TextView T12=(TextView)findViewById(R.id.textView69) ;
        final TextView T13=(TextView)findViewById(R.id.textView70) ;
        final TextView T14=(TextView)findViewById(R.id.textView71) ;
        final TextView T15=(TextView)findViewById(R.id.textView72) ;
        final TextView T16=(TextView)findViewById(R.id.textView73) ;
        final TextView T17=(TextView)findViewById(R.id.textView74) ;


        ET1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0) {
                T1.setText(str);
                double d=Double.parseDouble(str);
                T2.setText(String.valueOf(d/1000));
                T3.setText(String.valueOf(d/1000000000));
                T4.setText(String.valueOf(d*0.000061));
                T5.setText(String.valueOf(d*0.001308/1000000));
            }}
        });
        ET2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0) {
                    T2.setText(str);
                    double d=Double.parseDouble(str);
                    T1.setText(String.valueOf(d*1000));
                    T3.setText(String.valueOf(d/1000000));
                    T4.setText(String.valueOf(d*0.0610238));
                    T5.setText(String.valueOf(d*0.001308/1000));
                }
            }
        });
        ET3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0) {
                    T3.setText(str);
                    double d=Double.parseDouble(str);
                    T2.setText(String.valueOf(d*1000000));
                    T1.setText(String.valueOf(d*1000000000));
                    T4.setText(String.valueOf(d*61023.8445022));
                    T5.setText(String.valueOf(d*1.3079528));
                }
            }
        });
        ET4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0) {
                    T4.setText(str);
                    double d=Double.parseDouble(str);
                    T2.setText(String.valueOf(d*16.387037));
                    T1.setText(String.valueOf(d*16387.037037));
                    T3.setText(String.valueOf(d*0.0000164));
                    T5.setText(String.valueOf(d*0.0000214));
                }
            }
        });
        ET5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0) {
                    T5.setText(str);
                    double d=Double.parseDouble(str);
                    T2.setText(String.valueOf(d*764553.6));
                    T1.setText(String.valueOf(d*764553600));
                    T3.setText(String.valueOf(d*0.7645536));
                    T4.setText(String.valueOf(d*46656));
                }
            }
        });
        ET6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T6.setText(str);
                    double d=Double.parseDouble(str);
                    T7.setText(String.valueOf(d*25.4));
                    T8.setText(String.valueOf(d*0.0254));
                    T9.setText(String.valueOf(d*0.0833333));
                    T10.setText(String.valueOf(d*0.0000158));
                    T11.setText(String.valueOf(d*0.0000254));
                    T12.setText(String.valueOf(d*0.0000137));
                }
            }
        });
        ET7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T7.setText(str);
                    double d=Double.parseDouble(str);
                    T6.setText(String.valueOf(d*0.0393701));
                    T8.setText(String.valueOf(d/1000));
                    T9.setText(String.valueOf(d*0.0032808));
                    T10.setText(String.valueOf(d*0.0006214/1000));
                    T11.setText(String.valueOf(d/1000000));
                    T12.setText(String.valueOf(d*0.00054/1000));
                }
            }
        });
        ET8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T8.setText(str);
                    double d=Double.parseDouble(str);
                    T6.setText(String.valueOf(d*39.3700787));
                    T7.setText(String.valueOf(d*1000));
                    T9.setText(String.valueOf(d*3.2808399));
                    T10.setText(String.valueOf(d*0.0006214));
                    T11.setText(String.valueOf(d*0.001));
                    T12.setText(String.valueOf(d*0.00054));
                }
            }
        });
        ET9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T9.setText(str);
                    double d=Double.parseDouble(str);
                    T6.setText(String.valueOf(d*12));
                    T7.setText(String.valueOf(d*304.8));
                    T8.setText(String.valueOf(d*0.3048));

                    T10.setText(String.valueOf(d*0.0001894));
                    T11.setText(String.valueOf(d*0.0003048));
                    T12.setText(String.valueOf(d*0.0001646));
                }
            }
        });
        ET10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T10.setText(str);
                    double d=Double.parseDouble(str);
                    T6.setText(String.valueOf(d*63360));
                    T7.setText(String.valueOf(d*1609344));
                    T8.setText(String.valueOf(d*1609.344));
                    T9.setText(String.valueOf(d*5280));

                    T11.setText(String.valueOf(d*1.609344));
                    T12.setText(String.valueOf(d*0.8689762));
                }
            }
        });
        ET11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T11.setText(str);
                    double d=Double.parseDouble(str);
                    T6.setText(String.valueOf(d*39370.0787402));
                    T7.setText(String.valueOf(d*1000000));
                    T8.setText(String.valueOf(d*1000));
                    T9.setText(String.valueOf(d*3280.839895));
                    T10.setText(String.valueOf(d*0.6213712));

                    T12.setText(String.valueOf(d*0.5399568));
                }
            }
        });
        ET12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T12.setText(str);
                    double d=Double.parseDouble(str);
                    T6.setText(String.valueOf(d*72913.3858268));
                    T7.setText(String.valueOf(d*1852000));
                    T8.setText(String.valueOf(d*1852));
                    T9.setText(String.valueOf(d*6076.1154856));
                    T10.setText(String.valueOf(d*1.1507794));
                    T11.setText(String.valueOf(d*1.852));

                }
            }
        });
        ET13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T13.setText(str);
                    double d=Double.parseDouble(str);
                    T14.setText(String.valueOf(d/1000));
                    T15.setText(String.valueOf(d/1000000));
                    T16.setText(String.valueOf(d*0.035274));
                    T17.setText(String.valueOf(d*0.0022046));
                }
            }
        });
        ET14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T14.setText(str);
                    double d=Double.parseDouble(str);
                    T13.setText(String.valueOf(d*1000));
                    T15.setText(String.valueOf(d/1000));
                    T16.setText(String.valueOf(d*35.2739619));
                    T17.setText(String.valueOf(d*2.2046226));
                }
            }
        });
        ET15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T15.setText(str);
                    double d=Double.parseDouble(str);
                    T13.setText(String.valueOf(d*1000000));
                    T14.setText(String.valueOf(d*1000));

                    T16.setText(String.valueOf(d*35273.9619496));
                    T17.setText(String.valueOf(d*2204.6226218));
                }
            }
        });
        ET16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T16.setText(str);
                    double d=Double.parseDouble(str);
                    T13.setText(String.valueOf(d*28.3495231));
                    T14.setText(String.valueOf(d*0.0283495));
                    T15.setText(String.valueOf(d*0.0000283));

                    T17.setText(String.valueOf(d*0.0625));
                }
            }
        });
        ET17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str=editable.toString().trim();
                if(str.length()!=0){
                    T17.setText(str);
                    double d=Double.parseDouble(str);
                    T13.setText(String.valueOf(d*453.59237));
                    T14.setText(String.valueOf(d*0.4535924));
                    T15.setText(String.valueOf(d*0.0004536));
                    T16.setText(String.valueOf(d*16));

                }
            }
        });
    }
}
