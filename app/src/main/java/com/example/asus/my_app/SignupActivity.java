package com.example.asus.my_app;



import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.SaveListener;


public class SignupActivity extends AppCompatActivity {


    private EditText etusername;
    private EditText etpassword;
    private EditText etemail;
    private EditText eticon;
    private Button register;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(SignupActivity.this,LoginActivity.class);
                //startActivity(intent);
                signup();

            }

        });

    }
    public  void  signup(){


        BmobUser user =new BmobUser();
        user.setUsername(etusername.getText().toString());
        user.setPassword(etpassword.getText().toString());
        user.setEmail(etemail.getText().toString());



        user.signUp(SignupActivity.this, new SaveListener() {
            @Override
            public void onSuccess() {
                Toast.makeText(SignupActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                //onSignupSuccess();
            }

            @Override
            public void onFailure(int i, String s) {
                Toast.makeText(SignupActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }

}