package com.iwank.lhddemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.Card;

public class MyCard extends Card {
    String text;

    public MyCard(Context context) {
        super(context, R.layout.mycard_layout);
    }

    public MyCard(Context context, String text) {
        super(context, R.layout.mycard_layout);
        this.text = text;
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {
        TextView textView;

        textView = (TextView) view.findViewById(R.id.textView_description);
        textView.setText(text);

        ImageView imageView= (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.android);
    }
}