package com.suleman.interactivecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnClear)
    Button btnClear;
    @BindView(R.id.btnEquals)
    Button btnEquals;
    @BindView(R.id.btnAdd)
    Button btnAdd;
    @BindView(R.id.btnSub)
    Button btnSub;
    @BindView(R.id.btnMul)
    Button btnMul;
    @BindView(R.id.btnDiv)
    Button btnDiv;
    @BindView(R.id.btnZero)
    Button btnZero;
    @BindView(R.id.btnOne)
    Button btnOne;
    @BindView(R.id.btnTwo)
    Button btnTwo;
    @BindView(R.id.btnThree)
    Button btnThree;
    @BindView(R.id.btnFour)
    Button btnFour;
    @BindView(R.id.btnFive)
    Button btnFive;
    @BindView(R.id.btnSix)
    Button btnSix;
    @BindView(R.id.btnSeven)
    Button btnSeven;
    @BindView(R.id.btnEight)
    Button btnEight;
    @BindView(R.id.btnNine)
    Button btnNine;
    TextView tvInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvInput = (TextView)findViewById(R.id.tvInput);
        tvInput.setText("");
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"+");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"-");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"*");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"/");
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("Result is Answer");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText()+"9");
            }
        });
    }
}
