package com.example.vartikasharma.a120_army;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Developers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        ImageView mimageView = (ImageView) findViewById(R.id.image_view);

        Bitmap mbitmap = ((BitmapDrawable) getResources().getDrawable(R.drawable.raghav)).getBitmap();
        Bitmap imageRounded = Bitmap.createBitmap(mbitmap.getWidth(), mbitmap.getHeight(), mbitmap.getConfig());
        Canvas canvas = new Canvas(imageRounded);
        Paint mpaint = new Paint();
        mpaint.setAntiAlias(true);
        mpaint.setShader(new BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawRoundRect((new RectF(0, 0, mbitmap.getWidth(), mbitmap.getHeight())), 120, 120, mpaint);// Round Image Corner 100 100 100 100
        mimageView.setImageBitmap(imageRounded);


        ImageView mimageView2 = (ImageView) findViewById(R.id.mimageview2);

        Bitmap mbitmap1 = ((BitmapDrawable) getResources().getDrawable(R.drawable.raghav)).getBitmap();
        Bitmap imageRounded1 = Bitmap.createBitmap(mbitmap1.getWidth(), mbitmap1.getHeight(), mbitmap1.getConfig());
        Canvas canvas1 = new Canvas(imageRounded1);
        Paint mpaint1 = new Paint();
        mpaint1.setAntiAlias(true);
        mpaint1.setShader(new BitmapShader(mbitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas1.drawRoundRect((new RectF(0, 0, mbitmap1.getWidth(), mbitmap1.getHeight())), 120, 120, mpaint1);// Round Image Corner 100 100 100 100
        mimageView2.setImageBitmap(imageRounded1);

    }

}
