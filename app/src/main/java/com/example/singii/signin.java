package com.example.singii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        username=findViewById(R.id.uid);
        password=findViewById(R.id.pwd);



    }

    public void signin(View v)
    {
        Bundle b=getIntent().getExtras();
        String uid1=b.getString("uid");
        String pid1=b.getString("password");
        String fid1=b.getString("fnam");
        String usn1=b.getString("usn");
        String dob1=b.getString("dob");
        String eid1=b.getString("eid");

        if(username.getText().toString().equals(uid1) && password.getText().toString().equals(pid1))
        {
            Toast.makeText(this, "Sign In Successful", Toast.LENGTH_LONG).show();
            Bundle c = new Bundle();
            Intent i1= new Intent(this,success.class);
            c.putString("uid2",(uid1));
            c.putString("pid2",(pid1));
            c.putString("fid2",(fid1));
            c.putString("usn2",(usn1));
            c.putString("dob2",(dob1));
            c.putString("eid2",(eid1));
            i1.putExtras(c);
            startActivity(i1);

        }
        else
        {
            Toast.makeText(this, "Sign In Unsuccessful", Toast.LENGTH_LONG).show();
        }
    }
}
