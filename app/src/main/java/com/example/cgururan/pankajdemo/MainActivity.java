package com.example.cgururan.pankajdemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   /* private TextView mText, mTextErr;
    private Button mButton;
    private EditText mEditText;*/

    private LinearLayout llFirst, llTwo;
    private TextView txtName, txtClass, txtRoll, txtMobile;
    private Button btnReset,btnSubmit;
    private EditText edtName, edtClass, edtRollNo, edtMobileNo;
    private String name,className,rollNo,mobile="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bindViews();
        setClickListeners();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on Pause Triggered", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on Stop ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "on Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on Destroy", Toast.LENGTH_SHORT).show();
    }

    private void setClickListeners() {
        btnSubmit.setOnClickListener(view -> {
            if (edtName.getText().toString().length()>0){
                if (edtClass.getText().toString().length()>0){
                    if (edtMobileNo.getText().toString().length()>0&&edtMobileNo.getText().toString().length()==10){
                        if (edtRollNo.getText().toString().length()>0){
                            name=edtName.getText().toString();
                            className=edtClass.getText().toString();
                            rollNo=edtRollNo.getText().toString();
                            mobile=edtRollNo.getText().toString();
                            llFirst.setVisibility(View.GONE);
                            llTwo.setVisibility(View.VISIBLE);
                            setValue();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Please enter correct value", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Please enter correct value", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter correct value", Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(MainActivity.this, "This field is required", Toast.LENGTH_SHORT).show();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtClass.setText("");
                txtName.setText("");
                txtMobile.setText("");
                txtRoll.setText("");
                llTwo.setVisibility(View.GONE);
                llFirst.setVisibility(View.VISIBLE);
            }
        });
        /*mButton.setOnClickListener(v -> {
            if (mButton.getText().toString().equalsIgnoreCase("submit")) {
                if (mEditText.getText().toString().length() > 0) {
                    String enteredValue = mEditText.getText().toString();
                    mButton.setText("Submitted");
                    mTextErr.setText("");
                    mEditText.setText("");
                    mText.setText(enteredValue);
                    mText.setTypeface(Typeface.DEFAULT_BOLD);
                    mText.setTextColor(getResources().getColor(android.R.color.black));
                    Toast.makeText(MainActivity.this, "You entered " + enteredValue, Toast.LENGTH_SHORT).show();
                } else {
                    mTextErr.setText(R.string.txtError);
                }
            } else {
                mButton.setText("Submit");
                mText.setText("Your name will be displayed here");
                mEditText.setText("");
            }
        });
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (mEditText.getText().toString().length() > 0) {
                    mTextErr.setText("");
                } else {
                    mTextErr.setText(R.string.txtError);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
            )};*/
    }

    private void setValue() {

        edtRollNo.setText("");
        edtMobileNo.setText("");
        edtClass.setText("");
        edtName.setText("");
        txtName.setText(name);
        txtName.setTypeface(Typeface.DEFAULT_BOLD);
        txtName.setTextColor(getResources().getColor(R.color.colorPrimary));
        txtClass.setText(className);
        txtClass.setTypeface(Typeface.DEFAULT_BOLD);
        txtClass.setTextColor(getResources().getColor(R.color.colorPrimary));
        txtMobile.setText(mobile);
        txtMobile.setTypeface(Typeface.DEFAULT_BOLD);
        txtMobile.setTextColor(getResources().getColor(R.color.colorPrimary));
        txtRoll.setText(rollNo);
        txtRoll.setTypeface(Typeface.DEFAULT_BOLD);
        txtRoll.setTextColor(getResources().getColor(R.color.colorPrimary));
    }


    private void bindViews() {
        /*mText = findViewById(R.id.txtName);
        mButton = findViewById(R.id.btnShow);
        mEditText = findViewById(R.id.edtNameField);
        mTextErr = findViewById(R.id.txtError);*/
        llFirst = findViewById(R.id.llFirst);
        llTwo = findViewById(R.id.llTwo);
        edtName=findViewById(R.id.edtName);
        edtClass=findViewById(R.id.edtClass);
        edtMobileNo=findViewById(R.id.edtMobileNo);
        edtRollNo=findViewById(R.id.edtRollNo);
        btnSubmit=findViewById(R.id.btnSubmit);
        btnReset=findViewById(R.id.btnReset);

        txtName=findViewById(R.id.txtName);
        txtRoll=findViewById(R.id.txtRoll);
        txtMobile=findViewById(R.id.txtMobile);
        txtClass=findViewById(R.id.txtClass);
    }
}
