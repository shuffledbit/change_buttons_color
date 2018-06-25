package com.example.pavan.color_change_buttons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);

        tt=findViewById(R.id.t1);








        et1.addTextChangedListener(new TextWatcher() {

            int i=0;
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {



            }

            @Override
            public void afterTextChanged(Editable s)
            {
                String[] str=et1.getText().toString().split(",");

                boolean r=false,b=false,g=false;



               // tt.setText(str[]);
                //String str2 = str.toString();
            /*    for(int i=0;i<str.length;i++)
                {
                    if((str[i].matches("red|green|blue")))
                    {
                        if(str[i].contentEquals("red"))
                        {
                            b1.setBackgroundColor(Color.RED);
                            r=true;
                        }


                         if(str[i].contentEquals("green"))
                        {
                            b3.setBackgroundColor(Color.GREEN);
                            g=true;
                        }


                       if(str[i].contentEquals("blue"))
                        {
                            b2.setBackgroundColor(Color.BLUE);
                            b=true;
                        }


                   if(r==true)
                    {
                        b1.setBackgroundColor(Color.RED);
                    }
                    else
                   {

                       b1.setBackgroundResource(android.R.drawable.btn_default);
                   }
                        if(b==true)
                        {
                            b2.setBackgroundColor(Color.BLUE);
                        }
                        else
                        {

                            b2.setBackgroundResource(android.R.drawable.btn_default);
                        }
                       if(g==true)
                        {
                            b3.setBackgroundColor(Color.GREEN);
                        }
                        else{

                           b3.setBackgroundResource(android.R.drawable.btn_default);
                       }


                    }
                    else{
                            if(r==false)
                            {
                                b1.setBackgroundResource(android.R.drawable.btn_default);
                            }
                        if(g==false)
                        {
                            b3.setBackgroundResource(android.R.drawable.btn_default);
                        }
                        if(b==false)
                        {
                            b2.setBackgroundResource(android.R.drawable.btn_default);
                        }
                    }
                }*/


                for(int i=0;i<str.length;i++)
                {
                    if((str[i].equals("red") || str[i].equals("green") || str[i].equals("blue")))
                    {
                        if(str[i].equals("red"))
                        {
                            b1.setBackgroundColor(Color.RED);
                            r=true;
                        }


                        if(str[i].equals("green"))
                        {
                            b3.setBackgroundColor(Color.GREEN);
                            g=true;
                        }


                        if(str[i].equals("blue"))
                        {
                            b2.setBackgroundColor(Color.BLUE);
                            b=true;
                        }


                        if(r==true)
                        {
                            b1.setBackgroundColor(Color.RED);
                        }
                        else
                        {

                            b1.setBackgroundResource(android.R.drawable.btn_default);
                        }
                        if(b==true)
                        {
                            b2.setBackgroundColor(Color.BLUE);
                        }
                        else
                        {

                            b2.setBackgroundResource(android.R.drawable.btn_default);
                        }
                        if(g==true)
                        {
                            b3.setBackgroundColor(Color.GREEN);
                        }
                        else
                            {

                            b3.setBackgroundResource(android.R.drawable.btn_default);
                             }


                    }
                    else{

                        if(r==false)
                        {
                            b1.setBackgroundResource(android.R.drawable.btn_default);
                        }
                        if(g==false)
                        {
                            b3.setBackgroundResource(android.R.drawable.btn_default);
                        }
                        if(b==false)
                        {
                            b2.setBackgroundResource(android.R.drawable.btn_default);
                        }

                    }
                }
            }
        });
    }
}