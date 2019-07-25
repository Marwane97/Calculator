package com.example.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_multp;
    Button btn_add;
    Button btn_sub;
    Button btn_eql;
    Button btn_div;
    Button btn_dot;
    Button btn_clr;
    Button btn_mode;
    Button btn_expnent;
    Button btn_square_root;

    boolean multplicate = false;
    boolean adding = false;
    boolean subs = false;
    boolean div = false;
    boolean check_first_number = false;
    boolean equal = false;
    boolean mode = false;
    boolean exponent = false;

    //for btn_equal
    boolean eql_multplicate = false;
    boolean eql_adding = false;
    boolean eql_subs = false;
    boolean eql_div = false;
    boolean eql_mode = false;
    boolean eql_exponent = false;

    TextView textView ;
    TextView textResult;
    static float value1 = 0;
    static float value2 = 0;
    static float result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_dot = (Button) findViewById(R.id.btn_dot);
        btn_multp = (Button) findViewById(R.id.btn_mlp);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_min);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_eql = (Button) findViewById(R.id.btn_eql);
        btn_clr = (Button) findViewById(R.id.btn_clear);
        btn_mode = (Button) findViewById(R.id.btn_mode);
        btn_expnent = (Button) findViewById(R.id.btn_expnent);
        btn_square_root = (Button) findViewById(R.id.btn_square_root);

        textView = (TextView) findViewById(R.id.txt);
        textResult = (TextView) findViewById(R.id.txt_result);
        textView.setTextColor(Color.WHITE);

        btn_0.setOnClickListener( this);
        btn_1.setOnClickListener( this);
        btn_2.setOnClickListener( this);
        btn_3.setOnClickListener( this);
        btn_4.setOnClickListener( this);
        btn_5.setOnClickListener( this);
        btn_6.setOnClickListener( this);
        btn_7.setOnClickListener( this);
        btn_8.setOnClickListener( this);
        btn_9.setOnClickListener( this);

        btn_eql.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_multp.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_clr.setOnClickListener(this);
        btn_mode.setOnClickListener(this);
        btn_expnent.setOnClickListener(this);
        btn_square_root.setOnClickListener(this);

    }
    void textViewControls(){
        if(adding){
            textView.setText("");
            adding = false;
        }
        if(multplicate){
            textView.setText("");
            multplicate = false;
        }
        if(subs){
            textView.setText("");
            subs = false;
        }
        if(div){
            textView.setText("");
            div = false;
        }
        if(equal){
            textView.setText("");
            equal = false;
        }
        if(mode){
            textView.setText("");
            mode = false;
        }
        if(exponent){
            textView.setText("");
            exponent = false;
        }
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == btn_0.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "0" );
        }else if (v.getId() == btn_1.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "1" );
        }else if (v.getId() == btn_2.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "2" );
        }else if (v.getId() == btn_3.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "3" );
        }else if (v.getId() == btn_4.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "4" );
        }else if (v.getId() == btn_5.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "5" );
        }else if (v.getId() == btn_6.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "6" );
        }else if (v.getId() == btn_7.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "7" );
        }else if (v.getId() == btn_8.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "8" );
        }else if (v.getId() == btn_9.getId()){
            textViewControls();
            textView.setText(textView.getText().toString() + "9" );
        }else if(v.getId() == btn_dot.getId()){
            textViewControls();
            if(!TextUtils.isEmpty(textView.getText().toString())){
                textView.setText(textView.getText().toString() + "." );
            }

        } else if(v.getId() == btn_add.getId()){
            if(!TextUtils.isEmpty(textView.getText().toString())){
                value2 = Float.valueOf(textView.getText().toString());
                if(check_first_number){
                    value1 = value1 + value2;
                    textView.setText(String.valueOf(value1));
                }else{
                    value1 = value2;
                    check_first_number = true;
                }
                adding = true;
                eql_adding = true;
            }

        }else if(v.getId() == btn_sub.getId()){
            if(!TextUtils.isEmpty(textView.getText().toString())){
                value2 = Float.valueOf(textView.getText().toString());
                if(check_first_number) {
                    value1 = value1 - value2;
                    textView.setText(String.valueOf(value1));
                }else{
                    value1 = value2;
                    check_first_number = true;
                }
                subs = true;
                eql_subs = true;
            }
        }else if(v.getId() == btn_multp.getId()){
            if(!TextUtils.isEmpty(textView.getText().toString())){
                value2 = Float.valueOf(textView.getText().toString());
                if(check_first_number){
                    value1 = value1 * value2;
                    textView.setText(String.valueOf(value1));
                }else{
                    value1 = value2;
                    check_first_number = true;
                }
                multplicate = true;
                eql_multplicate = true;
            }
        }else if(v.getId() == btn_div.getId()){
            if(!TextUtils.isEmpty(textView.getText().toString())){
                value2 = Float.valueOf(textView.getText().toString());
                if(value2 != 0){
                    if( check_first_number && value1 !=0) {
                        value1 = value1 / value2;
                        textView.setText(String.valueOf(value1));
                    }else{
                        value1 =  value2;
                        check_first_number = true;
                    }
                }else{
                    textResult.setText("error");
                    value1 = 0;
                }
                div = true;
                eql_div = true;
            }
        }else if(v.getId() == btn_clr.getId()){
            textView.setText("");
        }else if (v.getId() == btn_expnent.getId()){
            if(!TextUtils.isEmpty(textView.getText().toString())){
                value2 = Float.valueOf(textView.getText().toString());
                if(check_first_number){
                    value1 = (float)  Math.pow((double) value1,(double)value2);
                    textView.setText(String.valueOf(value1));
                }else{
                    value1 = value2;
                    check_first_number = true;
                }
                exponent = true;
                eql_exponent = true;
            }
        }else if(v.getId() == btn_mode.getId()) {
            if(!TextUtils.isEmpty(textView.getText().toString())){
                value2 = Float.valueOf(textView.getText().toString());
                if(check_first_number){
                    value1 = value1 % value2;
                    textView.setText(String.valueOf(value1));
                }else{
                    value1 = value2;
                    check_first_number = true;
                }
                mode = true;
                eql_mode = true;
            }
        }else if(v.getId() == btn_eql.getId()){
            if(!TextUtils.isEmpty(textView.getText().toString())){
                if(eql_adding){
                    value2 = Float.valueOf(textView.getText().toString());
                    result = value1 + value2;
                    textView.setText(String.valueOf(result));
                    //value1 = result;
                    value1 = 0;
                    check_first_number = false;
                    eql_adding = false;
                }
                if(eql_subs){
                    value2 = Float.valueOf(textView.getText().toString());
                    result = value1 - value2;
                    textView.setText(String.valueOf(result));
                    //  value1 = result;
                    value1 = 0;
                    check_first_number = false;
                    eql_subs = false;
                }
                if(eql_multplicate){
                    value2 = Float.valueOf(textView.getText().toString());
                    result = value1 * value2;
                    textView.setText(String.valueOf(result));
                    //value1 = result;
                    value1 = 0;
                    check_first_number = false;
                    eql_multplicate = false;
                }
                if(eql_mode){
                    value2 = Float.valueOf(textView.getText().toString());
                    result = value1 % value2;
                    textView.setText(String.valueOf(result));
                    //  value1 = result;
                    value1 = 0;
                    check_first_number = false;
                    eql_mode = false;
                }
                if(eql_exponent){
                    value2 = Float.valueOf(textView.getText().toString());
                    result = (float)  Math.pow((double) value1,(double)value2);
                    textView.setText(String.valueOf(result));
                    //  value1 = result;
                    value1 = 0;
                    check_first_number = false;
                    eql_exponent = false;
                }
                if(eql_div){
                    value2 = Float.valueOf(textView.getText().toString());
                    if(value2 != 0){
                        result = value1 / value2;
                        textView.setText(String.valueOf(result));
                        // value1 = result;
                        eql_div = false;
                    }else{
                        textResult.setText("error");
                    }
                    value1 = 0;
                    check_first_number = false;
                }
                equal = true;
            }
        }
        else{
                ///else if(v.getId() == btn_square_root.getId()){//
                if(!TextUtils.isEmpty(textView.getText().toString())){
                    double number = Double.valueOf(textView.getText().toString());
                    textView.setText(String.valueOf((float) Math.sqrt(number)));
                }
        }
    }
}
