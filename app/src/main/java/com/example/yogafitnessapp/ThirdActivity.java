package com.example.yogafitnessapp;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.IntSummaryStatistics;

public class ThirdActivity extends AppCompatActivity {


    String buttonvalue;
    Button startbtn;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private  boolean MTimeRunning;
    private long MTimeLeft;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        buttonvalue= intent.getStringExtra("value");
        int intvalue= Integer.valueOf(buttonvalue);
        switch (intvalue){
            case 1:
                setContentView(R.layout.activity_boatpose);
                break;
            case 2:
                setContentView(R.layout.activity_boatpose2);
                break;
            case 3:
                setContentView(R.layout.activity_boatpose3);
                break;
            case 4:
                setContentView(R.layout.activity_boatpose4);
                break;
            case 5:
                setContentView(R.layout.activity_boatpose5);
                break;
            case 6:
                setContentView(R.layout.activity_boatpose6);
                break;
            case 7:
                setContentView(R.layout.activity_boatpose7);
                break;
            case 8:
                setContentView(R.layout.activity_boatpose8);
                break;
            case 9:
                setContentView(R.layout.activity_boatpose9);
                break;
            case 10:
                setContentView(R.layout.activity_boatpose10);
                break;
            case 11:
                setContentView(R.layout.activity_boatpose11);
                break;
            case 12:
                setContentView(R.layout.activity_boatpose12);
                break;
            case 13:
                setContentView(R.layout.activity_boatpose13);
                break;
            case 14:
                setContentView(R.layout.activity_boatpose14);
                break;
            case 15:
                setContentView(R.layout.activity_boatpose15);
                break;



        }

        startbtn=findViewById(R.id.startbutton);
        mtextview=findViewById(R.id.time);
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MTimeRunning){
                    stoptimer();
                }
                else{
                    startTimer();

                }

            }
        });



    }
    private  void stoptimer(){
        countDownTimer.cancel();
        MTimeRunning=false;
        startbtn.setText("START");
    }
    private void startTimer(){
        final  CharSequence value1= mtextview.getText();
        String num1= value1.toString();
        String num2=num1.substring(0,2);
        String num3 = num1.substring(3,5);

        final int number= Integer.valueOf(num2)*60+Integer.valueOf(num3);
        MTimeLeft= number*1000;


        countDownTimer = new CountDownTimer(MTimeLeft,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                MTimeLeft=millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {
int newvalue= Integer.valueOf(buttonvalue)+1;
if(newvalue<=7){
    Intent intent= new Intent(ThirdActivity.this,ThirdActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
    intent.putExtra("value",String.valueOf(newvalue));
    startActivity(intent);
            }
else{
    newvalue=1;
    Intent intent = new Intent(ThirdActivity.this,ThirdActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
    intent.putExtra("value",String.valueOf(newvalue));
    startActivity(intent);
}
        }
    }.start();
        startbtn.setText("Pause");
        MTimeRunning=true;

    }

    private void updateTimer(){
        int minutes=(int) MTimeLeft/60000;
        int seconds =(int) MTimeLeft%60000/1000;
        String timelefttext="";
        if(minutes<10)
            timelefttext="0";
        timelefttext=timelefttext+minutes+":";
        if(seconds<10)
            timelefttext+="0";
        timelefttext+=seconds;
        mtextview.setText(timelefttext);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}