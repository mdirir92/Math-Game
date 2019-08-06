package com.example.theonlysultan.braintraininggame;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.theonlysultan.matheval.MathEval;

import java.util.Random;

/**
 * Created by TheOnlySultan on 02/03/2018.
 */

public class GuruActivity extends AppCompatActivity {
    public static final String KEY_RESTORE = "key_restore";
    public void showToast(String text) {
        Toast.makeText(GuruActivity.this, text, Toast.LENGTH_LONG).show();
    }
    Switch hintsChecked;
    int incorrectCount = 0;
    int clickCount = 0;
    int count;
    TextView mTextField;
    TextView colorBoolean;
    TextView textView;
    EditText editText;
    Button k1;
    Button k2;
    Button k3;
    Button k4;
    Button k5;
    Button k6;
    Button k7;
    Button k8;
    Button k9;
    Button kDel;
    Button k0;
    Button kHash;
    Button kMinus;
    Handler handler = new Handler();
    int delay = 10000; //milliseconds


    Random random = new Random();
    int n = random.nextInt(100);
    int n2 = random.nextInt(100);
    int n3 = random.nextInt(100);
    int n4 = random.nextInt(100);
    int n5 = random.nextInt(100);
    int n6 = random.nextInt(100);
    Random rand = new Random();
    int operand = rand.nextInt(3);

    Random r1 = new Random();
    Random r2 = new Random();
    Random r3 = new Random();
    Random r4 = new Random();
    Random r5 = new Random();

    String [] operatorOne = {"+","-","*","/"};
    int r1Index = r1.nextInt(operatorOne.length);
    String operatorSymbol1 = (operatorOne[r1Index]);

    String [] operatorTwo = {"+","-","*","/"};
    int r2Index = r2.nextInt(operatorTwo.length);
    String operatorSymbol2 = (operatorTwo[r2Index]);

    String [] operatorThree = {"+","-","*","/"};
    int r3Index = r3.nextInt(operatorThree.length);
    String operatorSymbol3 = (operatorThree[r3Index]);

    String [] operatorFour = {"+","-","*","/"};
    int r4Index = r4.nextInt(operatorFour.length);
    String operatorSymbol4 = (operatorFour[r4Index]);

    String [] operatorFive = {"+","-","*","/"};
    int r5Index = r5.nextInt(operatorFive.length);
    String operatorSymbol5 = (operatorFive[r5Index]);

    MathEval math = new MathEval();
    double calc = 0;
    int c = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mTextField = findViewById(R.id.countimer);

        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                //secsLeft = millisUntilFinished / 1000;
                mTextField.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                mTextField.setText("done!");
            }
        }.start();

        switch (operand) {
            case 0:
                String result = n + operatorSymbol1 + n2 + operatorSymbol2 + n3 + operatorSymbol3 + n4;
                calc = math.evaluate(result);
                c = (int) Math.round(calc);
                // compare the users input to c
                textView = (TextView) findViewById(R.id.question_display);
                textView.setText(result.toString());
                break;
            case 1:
                result = n + operatorSymbol1 + n2 + operatorSymbol2 + n3 + operatorSymbol3 + n4 + operatorSymbol4 + n5;
                calc = math.evaluate(result);
                c = (int) Math.round(calc);
                // compare the users input to c
                textView = (TextView) findViewById(R.id.question_display);
                textView.setText(result.toString());
                break;
            case 2:
                result = n + operatorSymbol1 + n2 + operatorSymbol2 + n3 + operatorSymbol3 + n4 + operatorSymbol4 + n5 + operatorSymbol5 + n6;
                calc = math.evaluate(result);
                c = (int) Math.round(calc);
                // compare the users input to c
                textView = (TextView) findViewById(R.id.question_display);
                textView.setText(result.toString());

        }


        handler.postDelayed(new Runnable(){
            public void run(){
                new CountDownTimer(10000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        //secsLeft = millisUntilFinished / 1000;
                        mTextField.setText("" + millisUntilFinished / 1000);
                    }

                    public void onFinish() {
                        mTextField.setText("done!");
                    }
                }.start();
                incorrectCount=0;
                colorBoolean.setText("");
                int n = random.nextInt(100);
                int n2 = random.nextInt(100);
                int n3 = random.nextInt(100);
                int n4 = random.nextInt(100);
                int n5 = random.nextInt(100);
                int n6 = random.nextInt(100);

                int operand = rand.nextInt(3);
                int r1Index = r1.nextInt(operatorOne.length);
                String operatorSymbol1 = (operatorOne[r1Index]);

                int r2Index = r2.nextInt(operatorTwo.length);
                String operatorSymbol2 = (operatorTwo[r2Index]);

                int r3Index = r3.nextInt(operatorThree.length);
                String operatorSymbol3 = (operatorTwo[r3Index]);

                int r4Index = r4.nextInt(operatorFour.length);
                String operatorSymbol4 = (operatorFour[r4Index]);

                int r5Index = r5.nextInt(operatorFive.length);
                String operatorSymbol5 = (operatorFive[r5Index]);

                count++;
                switch (operand) {
                    case 0:
                        String result = n + operatorSymbol1 + n2 + operatorSymbol2 + n3 + operatorSymbol3 + n4;
                        calc = math.evaluate(result);
                        c = (int) Math.round(calc);
                        // compare the users input to c
                        textView = (TextView) findViewById(R.id.question_display);
                        textView.setText(result.toString());
                        break;
                    case 1:
                        result = n + operatorSymbol1 + n2 + operatorSymbol2 + n3 + operatorSymbol3 + n4 + operatorSymbol4 + n5;
                        calc = math.evaluate(result);
                        c = (int) Math.round(calc);
                        // compare the users input to c
                        textView = (TextView) findViewById(R.id.question_display);
                        textView.setText(result.toString());
                        break;
                    case 2:
                        result = n + operatorSymbol1 + n2 + operatorSymbol2 + n3 + operatorSymbol3 + n4 + operatorSymbol4 + n5 + operatorSymbol5 + n6;
                        calc = math.evaluate(result);
                        c = (int) Math.round(calc);
                        // compare the users input to c
                        textView = (TextView) findViewById(R.id.question_display);
                        textView.setText(result.toString());

                }




                handler.postDelayed(this, delay);
                if(count == 9){
                    handler.removeCallbacksAndMessages(null);
                }
            }
        }, delay);

        editText =(EditText) findViewById(R.id.Edit_Text);
        hintsChecked = (Switch) findViewById(R.id.switchToggle);
        colorBoolean = (TextView) findViewById(R.id.colorBoolean);
        k0 = (Button) findViewById(R.id.key0);
        k1 =(Button) findViewById(R.id.key1);
        k2 =(Button) findViewById(R.id.key2);
        k3 =(Button) findViewById(R.id.key3);
        k4 =(Button) findViewById(R.id.key4);
        k5 =(Button) findViewById(R.id.key5);
        k6 =(Button) findViewById(R.id.key6);
        k7 =(Button) findViewById(R.id.key7);
        k8 =(Button) findViewById(R.id.key8);
        k9 =(Button) findViewById(R.id.key9);
        kDel =(Button) findViewById(R.id.keyDel);
        kHash =(Button) findViewById(R.id.keyHash);
        kMinus =(Button) findViewById(R.id.keyMinus);

        k0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"0"));
            }
        });

        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"1"));
            }
        });
        //Restore game here....
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"2"));
            }
        });

        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"3"));
            }
        });

        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"4"));
            }
        });

        k5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"5"));
            }
        });

        k6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"6"));
            }
        });


        k7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"7"));
            }
        });

        k8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"8"));
            }
        });

        k9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"9"));
            }
        });

        kDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (clickCount == 0) {
// delete the whole input of user
                    editText.setText("");
                }

                else{
                    editText.setText(editText.getText().delete(editText.getText().length()-1,editText.getText().length()));
                    // clickCount--;
                }
            }


        });

        kMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText().insert(editText.getText().length(),"-"));
            }
        });
        kHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //editText.setText(editText.getText().insert(editText.getText().length(),"#"));

                clickCount++;
                String QuestionAnswer = editText.getText().toString();
                int in = Integer.valueOf(editText.getText().toString());

                if (in == c){
                    colorBoolean.setText("CORRECT");
                    colorBoolean.setTextColor(Color.GREEN);
                }
                else {
                    incorrectCount++;
                    colorBoolean.setText("INCORRECT");
                    colorBoolean.setTextColor(Color.RED);
                }

                if (hintsChecked.isChecked() && incorrectCount >= 4 ){
                    if (in > c){
                        showToast("Smaller");
                    }
                    else{
                        showToast("Greater");
                    }
                }

            }
        });

    }






}
