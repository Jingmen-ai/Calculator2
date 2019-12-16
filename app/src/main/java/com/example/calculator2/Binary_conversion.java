package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class Binary_conversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_conversion);
        final EditText ET1=(EditText) findViewById(R.id.textView10);
        final EditText ET2=(EditText) findViewById(R.id.textView12);
        final EditText ET3=(EditText) findViewById(R.id.textView14);
        final EditText ET4=(EditText) findViewById(R.id.textView16);
        final TextView TV1=(TextView)findViewById(R.id.textView7) ;
        final TextView TV2=(TextView)findViewById(R.id.textView17) ;
        final TextView TV3=(TextView)findViewById(R.id.textView18) ;
        final TextView TV4=(TextView)findViewById(R.id.textView19) ;
        ET1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String str1=editable.toString().trim();
                String str10=String.valueOf(Integer.parseInt(str1,2));
                if(str1.length()!=0){

                TV3.setText(str10);
                TV1.setText(str1);
                TV2.setText(Integer.toOctalString(Integer.parseInt(str10)));
                TV4.setText(Integer.toHexString(Integer.parseInt(str10)));}

            }
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
                String str10=String.valueOf(Integer.parseInt(str,8));
                if(str.length()!=0){

                TV3.setText(str10);
                TV2.setText(str);
                TV1.setText(Integer.toBinaryString(Integer.parseInt(str10)));
                TV4.setText(Integer.toHexString(Integer.parseInt(str10)));}
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

                    TV1.setText(Integer.toBinaryString(Integer.parseInt(str)));
                    TV2.setText(Integer.toOctalString(Integer.parseInt(str)));
                    TV4.setText(Integer.toHexString(Integer.parseInt(str)));
                    TV3.setText(str);
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
                String str10=String.valueOf(Integer.parseInt(str,16));
                if(str.length()!=0){

                    TV3.setText(str10);
                    TV4.setText(str);
                    TV1.setText(Integer.toBinaryString(Integer.parseInt(str10)));
                    TV2.setText(Integer.toOctalString(Integer.parseInt(str10)));}
            }
        });
    }
}
