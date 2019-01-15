package com.zion.aiswarya.mzcandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b1,b2;
    String getname,getano,getmob,geteid,getuname,getpswd,getcpswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.ano);
        ed3=(EditText)findViewById(R.id.mob);
        ed4=(EditText)findViewById(R.id.eid);
        ed5=(EditText)findViewById(R.id.uname);
        ed6=(EditText)findViewById(R.id.pswd);
        ed7=(EditText)findViewById(R.id.cpswd);
        b1=(Button)findViewById(R.id.regbutton);
        b2=(Button)findViewById(R.id.alregbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getname=ed1.getText().toString();
                getano=ed2.getText().toString();
                getmob=ed3.getText().toString();
                geteid=ed4.getText().toString();
                getuname=ed5.getText().toString();
                getpswd=ed6.getText().toString();
                getcpswd=ed7.getText().toString();
                if(getpswd.equals(getcpswd)) {
                    Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_LONG).show();

                    Toast.makeText(getApplicationContext(), getano, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getmob, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), geteid, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getuname, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getpswd, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getcpswd, Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"password and conform password are not equal",Toast.LENGTH_LONG).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}
