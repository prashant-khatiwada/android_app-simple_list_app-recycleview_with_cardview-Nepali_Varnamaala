package com.momobites.prash.varnamaala.Drawing;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.momobites.prash.varnamaala.ModelAdapters.DrawAdapter;
import com.momobites.prash.varnamaala.R;

import static com.momobites.prash.varnamaala.ModelAdapters.DrawAdapter.devnagari_word;
import static com.momobites.prash.varnamaala.ModelAdapters.DrawAdapter.getDevnagari_word;

public class DrawBoard extends AppCompatActivity {

    //custom drawing view
    private DrawingView drawView;
    //draw UI buttons
    private ImageButton currPaint, drawBtn, eraseBtn, resetBtn;
    //brush sizes
    private float smallBrush, mediumBrush, largeBrush;

    public static String devWord = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw_card);

        // Getting Intent from Letter Adapter
        Intent i = getIntent();
        final String[] DevCompoundString = i.getStringArrayExtra("DevString");
        final String[] NepCompoundString = i.getStringArrayExtra("NepString");


        // SEND DATA TO FRAGMENTS - TOP FRAGMENT
        // pack the data to be shown
        Bundle bundle = new Bundle();
        bundle.putStringArray("DEV_KEY", DevCompoundString);
        bundle.putStringArray("NEP_KEY", NepCompoundString);

        // calling out a specific fragment
        DrawBoardTopFragment firstFragment = new DrawBoardTopFragment();
        // put the data in bundle
        firstFragment.setArguments(bundle);

        // Inserting a specific Fragment
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.topPanelFragment, firstFragment, firstFragment.getTag())
                .commit();


        // Find and fix views to its xml place
        TextView DevnagariWord = (TextView) findViewById(R.id.dev_textview);
        // Set the Data on each View


        if (devWord == null){
            devWord = i.getStringExtra("DevWord");
            DevnagariWord.setText(devWord);
        } else {
            DevnagariWord.setText(getDevnagari_word());
        }


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
