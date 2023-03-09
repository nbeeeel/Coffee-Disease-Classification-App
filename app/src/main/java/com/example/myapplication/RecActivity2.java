package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RecActivity2 extends AppCompatActivity {

    Button cers,phom,rst,wlt;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec2);

        cers = findViewById(R.id.cerscospora);
        phom = findViewById(R.id.phoma);
        rst = findViewById(R.id.rust);
        wlt = findViewById(R.id.miner);
        dialog = new Dialog(this);

        cers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                opencersdialog();
            }
        });

        phom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openphomdialog();
            }
        });

        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openrstdialog();
            }
        });

        wlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwltdialog();
            }
        });

    }

    private void opencersdialog(){
        dialog.setContentView(R.layout.dialog1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.imageViewClose);
        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void openphomdialog(){

        dialog.setContentView(R.layout.dialog4);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose1 = dialog.findViewById(R.id.imageViewClose1);
        imageViewClose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void openrstdialog(){

        dialog.setContentView(R.layout.dialog2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose2 = dialog.findViewById(R.id.imageViewClose2);
        imageViewClose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void openwltdialog(){

        dialog.setContentView(R.layout.dialog3);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose3 = dialog.findViewById(R.id.imageViewClose3);

        imageViewClose3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}