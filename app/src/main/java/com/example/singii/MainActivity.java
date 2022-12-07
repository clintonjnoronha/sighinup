package com.example.singii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText uid1,pid1,fid1,usn1,dob1,eid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uid1=findViewById(R.id.uid);
        pid1=findViewById(R.id.pid);
        fid1=findViewById(R.id.fid);
        usn1=findViewById(R.id.usn);
        dob1=findViewById(R.id.dob);
        eid1=findViewById(R.id.eid);

    }
public void signup(View v)
    {
        if(pid1.getText().toString().length()>=8 && validatepassword(pid1.getText().toString()))
        {
            Toast.makeText(this, "Signup Successful", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this,signin.class);
            Bundle b = new Bundle();
            b.putString("uid",uid1.getText().toString());
            b.putString("password",pid1.getText().toString());
            b.putString("fnam",fid1.getText().toString());
            b.putString("usn",usn1.getText().toString());
            b.putString("dob",dob1.getText().toString());
            b.putString("eid",eid1.getText().toString());
            i.putExtras(b);
            startActivity(i);
        }
        else
        {

            Toast.makeText(this, "Password not meeting constraints", Toast.LENGTH_LONG).show();
        }
    }

    public boolean validatepassword(String pid1)
    {
        Pattern ptrn;
        Matcher mat;
        String passwordptrn="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[<>/+-@#$])(?=\\S+$).{8,}$";
        ptrn=Pattern.compile(passwordptrn);
        mat=ptrn.matcher(pid1);
        return mat.matches();
    }
}