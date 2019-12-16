package com.example.calculator2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class cal extends AppCompatActivity {
    String str="";


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_main);


        final TextView T=(TextView) findViewById(R.id.textView2);
        Button BT1=(Button) findViewById(R.id.button27);
        Button BT2=(Button) findViewById(R.id.button30);
        Button BT3=(Button) findViewById(R.id.button34);
        Button BT4=(Button) findViewById(R.id.button23);
        Button BT5=(Button) findViewById(R.id.button29);
        Button BT6=(Button) findViewById(R.id.button33);
        Button BT7=(Button) findViewById(R.id.button22);
        Button BT8=(Button) findViewById(R.id.button28);
        Button BT9=(Button) findViewById(R.id.button32);
        Button BT0=(Button) findViewById(R.id.button31);
        
        Button BTPO=(Button) findViewById(R.id.button35);
        Button BTADD=(Button) findViewById(R.id.button37);
        Button BTMIN=(Button) findViewById(R.id.button36);
        Button BTCH=(Button) findViewById(R.id.button25);
        Button BTCHU=(Button) findViewById(R.id.button24);
        Button BTCL=(Button) findViewById(R.id.button2);
        Button BTD=(Button) findViewById(R.id.button26);
        Button BTCAL=(Button) findViewById(R.id.button38);
        Button BTLEFT=(Button) findViewById(R.id.button42) ;
        Button BTRIGHT=(Button) findViewById(R.id.button43);
        Button BTSIN=(Button) findViewById(R.id.button39);
        Button BTCOS=(Button) findViewById(R.id.button40);
        Button BTTAN=(Button) findViewById(R.id.button41);
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str=str+String.valueOf(1);
                T.setText(str);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+String.valueOf(2);
                T.setText(str);
            }
        });
        BT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+String.valueOf(3);
                T.setText(str);
            }
        });
        BT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+String.valueOf(4);
                T.setText(str);
            }
        });
        BT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+String.valueOf(5);
                T.setText(str);
            }
        });
        BT6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+String.valueOf(6);
                T.setText(str);
            }
        });
        BT7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+String.valueOf(7);
                T.setText(str);
            }
        });
        BT8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+String.valueOf(8);
                T.setText(str);
            }
        });
        BT9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+String.valueOf(9);
                T.setText(str);
            }
        });
        BT0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+String.valueOf(0);
                T.setText(str);
            }
        });
        BTCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str="";
                T.setText(str);
            }
        });
        BTPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.length()!=0){
                if(str.substring(str.length()-1)!="."&&str.substring(str.length()-1)!="+"&&str.substring(str.length()-1)!="-"&&str.substring(str.length()-1)!="×"&&str.substring(str.length()-1)!="÷"&&str.substring(str.length()-1)!="%"){
                    str=str+".";
                    T.setText(str);
                }
            }}
        });
        BTD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.length()<0){str="";T.setText(str);}
                str= str.substring(0, str.length() -1);
                T.setText(str);
            }
        });
        BTADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.length()!=0){
                if(str.substring(str.length()-1)!="."&&str.substring(str.length()-1)!="+"&&str.substring(str.length()-1)!="-"&&str.substring(str.length()-1)!="×"&&str.substring(str.length()-1)!="÷"&&str.substring(str.length()-1)!="%"){
                    str=str+"+";
                    T.setText(str);
                }}
            }
        });
        BTMIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.length()!=0){
                if(str.substring(str.length()-1)!="."&&str.substring(str.length()-1)!="+"&&str.substring(str.length()-1)!="-"&&str.substring(str.length()-1)!="×"&&str.substring(str.length()-1)!="÷"&&str.substring(str.length()-1)!="%"){
                    str=str+"-";
                    T.setText(str);
                }}
            }
        });
        BTCH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.length()!=0){
                if(str.substring(str.length()-1)!="."&&str.substring(str.length()-1)!="+"&&str.substring(str.length()-1)!="-"&&str.substring(str.length()-1)!="×"&&str.substring(str.length()-1)!="÷"&&str.substring(str.length()-1)!="%"){
                    str=str+"*";
                    T.setText(str);
                }}
            }

        });
        BTCHU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.length()!=0){
                if(str.substring(str.length()-1)!="."&&str.substring(str.length()-1)!="+"&&str.substring(str.length()-1)!="-"&&str.substring(str.length()-1)!="×"&&str.substring(str.length()-1)!="÷"&&str.substring(str.length()-1)!="%"){
                    str=str+"/";
                    T.setText(str);
                }}
            }
        });
        BTCAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Calculator.conversion(str);
                T.setText(String.valueOf(result));
                str="";
            }
        });
        BTLEFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+"(";
                T.setText(str);
            }
        });
        BTRIGHT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=str+")";
                T.setText(str);
            }
        });
        BTSIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cal.this);
                builder.setTitle("sin求值");
                View view1 = getLayoutInflater().inflate(R.layout.sin,null);
                final EditText ET1=(EditText) view1.findViewById(R.id.ET1);
                final TextView OUT=(TextView) view1.findViewById(R.id.textView6);
                ET1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
                    @Override
                    public void afterTextChanged(Editable editable) {
                        String strA=editable.toString().trim();
                        if(strA.length()==1) {double result2=Math.sin(Double.parseDouble(strA));OUT.setText(String.valueOf(result2));}
                        else {double result1 = Calculator.conversion(strA);
                        double result2=Math.sin(result1);
                        OUT.setText(String.valueOf(result2));}
                    }
                });
                builder.setView(view1);
                builder.setPositiveButton("置入结果", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        str=str+OUT.getText().toString().trim();
                        T.setText(str);

                    }
                });
                builder.setNegativeButton("返回", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
        BTCOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cal.this);
                builder.setTitle("cos求值");
                View view1 = getLayoutInflater().inflate(R.layout.cos,null);
                final EditText ET1=(EditText) view1.findViewById(R.id.ET1);
                final TextView OUT=(TextView) view1.findViewById(R.id.textView6);
                ET1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
                    @Override
                    public void afterTextChanged(Editable editable) {
                        String strA=editable.toString().trim();
                        if(strA.length()==1) {double result2=Math.cos(Double.parseDouble(strA));OUT.setText(String.valueOf(result2));}
                        else {double result1 = Calculator.conversion(strA);
                            double result2=Math.cos(result1);
                            OUT.setText(String.valueOf(result2));}
                    }
                });
                builder.setView(view1);
                builder.setPositiveButton("置入结果", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        str=str+OUT.getText().toString().trim();
                        T.setText(str);

                    }
                });
                builder.setNegativeButton("返回", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
        BTTAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cal.this);
                builder.setTitle("tan求值");
                View view1 = getLayoutInflater().inflate(R.layout.tan,null);
                final EditText ET1=(EditText) view1.findViewById(R.id.ET1);
                final TextView OUT=(TextView) view1.findViewById(R.id.textView6);
                ET1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
                    @Override
                    public void afterTextChanged(Editable editable) {
                        String strA=editable.toString().trim();
                        if(strA.length()==1) {double result2=Math.tan(Double.parseDouble(strA));OUT.setText(String.valueOf(result2));}
                        else {double result1 = Calculator.conversion(strA);
                            double result2=Math.tan(result1);
                            OUT.setText(String.valueOf(result2));}
                    }
                });
                builder.setView(view1);
                builder.setPositiveButton("置入结果", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        str=str+OUT.getText().toString().trim();
                        T.setText(str);

                    }
                });
                builder.setNegativeButton("返回", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
    }

}
