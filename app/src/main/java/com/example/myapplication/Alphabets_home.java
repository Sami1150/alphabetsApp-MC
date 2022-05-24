package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Alphabets_home extends AppCompatActivity {
    Button[] buttons;
    int[] BUTTON_IDS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_home);
        buttons= new Button[26];

        BUTTON_IDS= new int[26];
        BUTTON_IDS[0]=R.id.A;
        BUTTON_IDS[1]=(R.id.B);
        BUTTON_IDS[2]=(R.id.C);
        BUTTON_IDS[3]=(R.id.D);
        BUTTON_IDS[4]=(R.id.E);
        BUTTON_IDS[5]=(R.id.F);
        BUTTON_IDS[6]=(R.id.G);
        BUTTON_IDS[7]=(R.id.H);
        BUTTON_IDS[8]=(R.id.I);
        BUTTON_IDS[9]=(R.id.J);
        BUTTON_IDS[10]=(R.id.K);
        BUTTON_IDS[11]=(R.id.L);
        BUTTON_IDS[12]=(R.id.M);
        BUTTON_IDS[13]=(R.id.N);
        BUTTON_IDS[14]=(R.id.O);
        BUTTON_IDS[15]=R.id.P;
        BUTTON_IDS[16]=R.id.Q;
        BUTTON_IDS[17]=(R.id.R);
        BUTTON_IDS[18]=(R.id.S);
        BUTTON_IDS[19]=(R.id.T);
        BUTTON_IDS[20]=(R.id.U);
        BUTTON_IDS[21]=(R.id.V);
        BUTTON_IDS[22]=(R.id.W);
        BUTTON_IDS[23]=(R.id.X);
        BUTTON_IDS[24]=(R.id.Y);
        BUTTON_IDS[25]=(R.id.Z);

        initialize();
    }
    private  void initialize()
    {
        for(int i=0;i<26;i++)
        {
            buttons[i]=(Button) findViewById(BUTTON_IDS[i]);
        }
        //there were app crashing thats why i have to loop to 14 and then 10
    }


    public void onClick(View view) {
        Intent intent=new Intent(Alphabets_home.this,Aphabets.class);
        for(int i=0;i<26;i++)
        {
            if(view.getId()==BUTTON_IDS[i])
            {
                String val= String.valueOf(i);
                intent.putExtra("ImageIndex",val);
                startActivity(intent);
            }
        }
    }
}