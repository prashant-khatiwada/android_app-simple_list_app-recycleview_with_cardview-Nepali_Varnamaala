package com.momobites.prash.varnamaala.Drawing;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.momobites.prash.varnamaala.R;

import static android.view.View.GONE;

public class DrawBoard extends AppCompatActivity {

    //custom drawing view
    private DrawingView drawView;
    //draw UI buttons
    private ImageButton currPaint, drawBtn, eraseBtn, resetBtn;
    //brush sizes
    private float smallBrush, mediumBrush, largeBrush;
    //  Layout
    HorizontalScrollView compound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_letter_card);

        Intent i = getIntent();
        final String devWord = i.getStringExtra("DevWord");
        final String [] DevCompoundString = i.getStringArrayExtra("DevString");
        final String [] NepCompoundString = i.getStringArrayExtra("NepString");




        compound = (HorizontalScrollView) findViewById(R.id.compounds);
        compound.setVisibility(GONE);


        // Find and fix views to its xml place
        final TextView DevnagariWord = (TextView) findViewById(R.id.dev_textview);
        // Compounds Devnagari
        TextView DevnagariWord01 = (TextView) findViewById(R.id.compound_dev_01);
        TextView DevnagariWord02 = (TextView) findViewById(R.id.compound_dev_02);
        TextView DevnagariWord03 = (TextView) findViewById(R.id.compound_dev_03);
        TextView DevnagariWord04 = (TextView) findViewById(R.id.compound_dev_04);
        TextView DevnagariWord05 = (TextView) findViewById(R.id.compound_dev_05);
        TextView DevnagariWord06 = (TextView) findViewById(R.id.compound_dev_06);
        TextView DevnagariWord07 = (TextView) findViewById(R.id.compound_dev_07);
        TextView DevnagariWord08 = (TextView) findViewById(R.id.compound_dev_08);
        TextView DevnagariWord09 = (TextView) findViewById(R.id.compound_dev_09);
        TextView DevnagariWord10 = (TextView) findViewById(R.id.compound_dev_10);
        TextView DevnagariWord11 = (TextView) findViewById(R.id.compound_dev_11);
        TextView DevnagariWord12 = (TextView) findViewById(R.id.compound_dev_12);
        // Compounds Nepali
        TextView NepaliWord01 = (TextView) findViewById(R.id.compound_nep_01);
        TextView NepaliWord02 = (TextView) findViewById(R.id.compound_nep_02);
        TextView NepaliWord03 = (TextView) findViewById(R.id.compound_nep_03);
        TextView NepaliWord04 = (TextView) findViewById(R.id.compound_nep_04);
        TextView NepaliWord05 = (TextView) findViewById(R.id.compound_nep_05);
        TextView NepaliWord06 = (TextView) findViewById(R.id.compound_nep_06);
        TextView NepaliWord07 = (TextView) findViewById(R.id.compound_nep_07);
        TextView NepaliWord08 = (TextView) findViewById(R.id.compound_nep_08);
        TextView NepaliWord09 = (TextView) findViewById(R.id.compound_nep_09);
        TextView NepaliWord10 = (TextView) findViewById(R.id.compound_nep_10);
        TextView NepaliWord11 = (TextView) findViewById(R.id.compound_nep_11);
        TextView NepaliWord12 = (TextView) findViewById(R.id.compound_nep_12);


        // Set the Data on each View
        DevnagariWord.setText(devWord);

        // Compound Devnagari
        DevnagariWord01.setText(DevCompoundString[0]);
        DevnagariWord02.setText(DevCompoundString[1]);
        DevnagariWord03.setText(DevCompoundString[2]);
        DevnagariWord04.setText(DevCompoundString[3]);
        DevnagariWord05.setText(DevCompoundString[4]);
        DevnagariWord06.setText(DevCompoundString[5]);
        DevnagariWord07.setText(DevCompoundString[6]);
        DevnagariWord08.setText(DevCompoundString[7]);
        DevnagariWord09.setText(DevCompoundString[8]);
        DevnagariWord10.setText(DevCompoundString[9]);
        DevnagariWord11.setText(DevCompoundString[10]);
        DevnagariWord12.setText(DevCompoundString[11]);
        // Compound Nepali
        NepaliWord01.setText(NepCompoundString[0]);
        NepaliWord02.setText(NepCompoundString[1]);
        NepaliWord03.setText(NepCompoundString[2]);
        NepaliWord04.setText(NepCompoundString[3]);
        NepaliWord05.setText(NepCompoundString[4]);
        NepaliWord06.setText(NepCompoundString[5]);
        NepaliWord07.setText(NepCompoundString[6]);
        NepaliWord08.setText(NepCompoundString[7]);
        NepaliWord09.setText(NepCompoundString[8]);
        NepaliWord10.setText(NepCompoundString[9]);
        NepaliWord11.setText(NepCompoundString[10]);
        NepaliWord12.setText(NepCompoundString[11]);


        // Inserting a specific Fragment
        DrawBoardTopFragment firstFragment = new DrawBoardTopFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.topPanelFragment, firstFragment, firstFragment.getTag())
                .commit();


        //get drawing view
        drawView = (DrawingView) findViewById(R.id.drawing);

        //get the palette and first color button
        LinearLayout paintLayout = (LinearLayout) findViewById(R.id.paint_colors);
        currPaint = (ImageButton) paintLayout.getChildAt(0);
        currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));

        //sizes from dimensions
        smallBrush = getResources().getInteger(R.integer.small_size);
        mediumBrush = getResources().getInteger(R.integer.medium_size);
        largeBrush = getResources().getInteger(R.integer.large_size);

        //draw button
        drawBtn = (ImageButton) findViewById(R.id.draw_btn);
        drawBtn.setBackgroundColor(0XFFBDBDBD);
        drawBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //drawView.setErase(false);
                //drawView.setBrushSize(mediumBrush);
                //drawView.setLastBrushSize(mediumBrush);
                drawBtn.setBackgroundColor(0XFFBDBDBD);
                eraseBtn.setBackgroundColor(0xFFCCCCCC);

                //switch to erase - choose size
                final Dialog brushDialog = new Dialog(DrawBoard.this);
                brushDialog.setTitle("Brush size:");
                brushDialog.setContentView(R.layout.brush_chooser);

                //size buttons
                ImageButton smallBtn = (ImageButton) brushDialog.findViewById(R.id.small_brush);
                smallBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        drawView.setErase(false);
                        drawView.setBrushSize(smallBrush);
                        drawView.setLastBrushSize(smallBrush);
                        brushDialog.dismiss();
                    }
                });


                ImageButton mediumBtn = (ImageButton) brushDialog.findViewById(R.id.medium_brush);
                mediumBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        drawView.setErase(false);
                        drawView.setBrushSize(mediumBrush);
                        drawView.setLastBrushSize(mediumBrush);
                        brushDialog.dismiss();
                    }
                });


                ImageButton largeBtn = (ImageButton) brushDialog.findViewById(R.id.large_brush);
                largeBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        drawView.setErase(false);
                        drawView.setBrushSize(largeBrush);
                        drawView.setLastBrushSize(largeBrush);
                        brushDialog.dismiss();
                    }
                });

                brushDialog.show();


            }
        });

        //set initial size
        drawView.setBrushSize(mediumBrush);

        //erase button
        eraseBtn = (ImageButton) findViewById(R.id.erase_btn);
        eraseBtn.setBackgroundColor(0xFFCCCCCC);
        eraseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //drawView.setErase(true);
                //drawView.setBrushSize(mediumBrush);
                eraseBtn.setBackgroundColor(0xFFBDBDBD);
                drawBtn.setBackgroundColor(0XFFCCCCCC);

                //switch to erase - choose size
                final Dialog brushDialog = new Dialog(DrawBoard.this);
                brushDialog.setTitle("Eraser size:");
                brushDialog.setContentView(R.layout.brush_chooser);


                //size buttons
                ImageButton smallBtn = (ImageButton) brushDialog.findViewById(R.id.small_brush);
                smallBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        drawView.setErase(true);
                        drawView.setBrushSize(smallBrush);
                        brushDialog.dismiss();
                    }
                });

                ImageButton mediumBtn = (ImageButton) brushDialog.findViewById(R.id.medium_brush);
                mediumBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        drawView.setErase(true);
                        drawView.setBrushSize(mediumBrush);
                        brushDialog.dismiss();
                    }
                });

                ImageButton largeBtn = (ImageButton) brushDialog.findViewById(R.id.large_brush);
                largeBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        drawView.setErase(true);
                        drawView.setBrushSize(largeBrush);
                        brushDialog.dismiss();
                    }
                });


                brushDialog.show();


            }
        });


        //reset button
        resetBtn = (ImageButton) findViewById(R.id.new_btn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawView.startNew();
            }
        });

    }

    //user clicked paint
    public void paintClicked(View view) {
        //use chosen color

        //set erase false
        drawView.setErase(false);
        drawView.setBrushSize(drawView.getLastBrushSize());

        if (view != currPaint) {
            ImageButton imgView = (ImageButton) view;
            String color = view.getTag().toString();
            drawView.setColor(color);
            //update ui
            imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
            currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
            currPaint = (ImageButton) view;
        }
    }



}
