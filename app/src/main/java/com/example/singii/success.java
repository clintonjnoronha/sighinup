package com.example.singii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Bundle c =getIntent().getExtras();
        if (c != null) {
            String uid3 = c.getString("uid2");
            String pid3 = c.getString("pid2");
            String fid3 = c.getString("fid2");
            String usn3 = c.getString("usn2");
            String dob3 = c.getString("dob2");
            String eid3 = c.getString("eid2");
            TextView uidf = findViewById(R.id.uidf);
            // TextView pidf =findViewById(R.id.pidf);
            TextView fidf =findViewById(R.id.fidf);
            TextView usnf =findViewById(R.id.usnf);
            TextView dobf =findViewById(R.id.dobf);
            TextView eidf =findViewById(R.id.eidf);
            uidf.setText(uid3);
            fidf.setText(fid3);
            usnf.setText(usn3);
            dobf.setText(dob3);
            eidf.setText(eid3);

        }

    }
}