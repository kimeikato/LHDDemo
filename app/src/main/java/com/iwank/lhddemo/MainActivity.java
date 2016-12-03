package com.iwank.lhddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardArrayAdapter;
import it.gmariotti.cardslib.library.view.CardListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Card> cards = new ArrayList<Card>();

        MyCard myCard = new MyCard(this, "Local Hack Day");
        MyCard myCard1 = new MyCard(this, "Local Hack Day");
        MyCard myCard2 = new MyCard(this, "Local Hack Day");
        myCard.setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Toast.makeText(MainActivity.this,"test",Toast.LENGTH_SHORT).show();
            }
        });
        cards.add(myCard);
        cards.add(myCard1);
        cards.add(myCard2);

        CardArrayAdapter cardArrayAdapter = new CardArrayAdapter(this, cards);
        CardListView listView = (CardListView) this.findViewById(R.id.entryList);
        if (listView != null) {
            listView.setAdapter(cardArrayAdapter);
        }
    }
}
