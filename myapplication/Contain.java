package com.example.myapplication;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class Contain extends AppCompatActivity {

    TextView sms1;
    TextView sms10;
    Button sms10_send;
    Button sms10_share;
    TextView sms11;
    Button sms11_send;
    Button sms11_share;
    TextView sms12;
    Button sms12_send;
    Button sms12_share;
    TextView sms13;
    Button sms13_send;
    Button sms13_share;
    TextView sms14;
    Button sms14_send;
    Button sms14_share;
    TextView sms15;
    Button sms15_send;
    Button sms15_share;
    TextView sms16;
    Button sms16_send;
    Button sms16_share;
    TextView sms17;
    Button sms17_send;
    Button sms17_share;
    TextView sms18;
    Button sms18_send;
    Button sms18_share;
    TextView sms19;
    Button sms19_send;
    Button sms19_share;
    Button sms1_send;
    Button sms1_share;
    TextView sms2;
    TextView sms20;
    Button sms20_send;
    Button sms20_share;
    TextView sms21;
    Button sms21_send;
    Button sms21_share;
    TextView sms22;
    Button sms22_send;
    Button sms22_share;
    TextView sms23;
    Button sms23_send;
    Button sms23_share;
    TextView sms24;
    Button sms24_send;
    Button sms24_share;
    TextView sms25;
    Button sms25_send;
    Button sms25_share;
    TextView sms26;
    Button sms26_send;
    Button sms26_share;
    TextView sms27;
    Button sms27_send;
    Button sms27_share;
    TextView sms28;
    Button sms28_send;
    Button sms28_share;
    TextView sms29;
    Button sms29_send;
    Button sms29_share;
    Button sms2_send;
    Button sms2_share;
    TextView sms3;
    TextView sms30;
    Button sms30_send;
    Button sms30_share;
    Button sms3_send;
    Button sms3_share;
    TextView sms4;
    Button sms4_send;
    Button sms4_share;
    TextView sms5;
    Button sms5_send;
    Button sms5_share;
    TextView sms6;
    Button sms6_send;
    Button sms6_share;
    TextView sms7;
    Button sms7_send;
    Button sms7_share;
    TextView sms8;
    Button sms8_send;
    Button sms8_share;
    TextView sms9;
    Button sms9_send;
    Button sms9_share;

    /* access modifiers changed from: protected */
    @Override
    // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_contain);
        final String stringExtra = getIntent().getStringExtra("SMS1");
        final String stringExtra2 = getIntent().getStringExtra("SMS2");
        final String stringExtra3 = getIntent().getStringExtra("SMS3");
        final String stringExtra4 = getIntent().getStringExtra("SMS4");
        final String stringExtra5 = getIntent().getStringExtra("SMS5");
        final String stringExtra6 = getIntent().getStringExtra("SMS6");
        final String stringExtra7 = getIntent().getStringExtra("SMS7");
        final String stringExtra8 = getIntent().getStringExtra("SMS8");
        final String stringExtra9 = getIntent().getStringExtra("SMS9");
        final String stringExtra10 = getIntent().getStringExtra("SMS10");
        final String stringExtra11 = getIntent().getStringExtra("SMS11");
        final String stringExtra12 = getIntent().getStringExtra("SMS12");
        final String stringExtra13 = getIntent().getStringExtra("SMS13");
        final String stringExtra14 = getIntent().getStringExtra("SMS14");
        final String stringExtra15 = getIntent().getStringExtra("SMS15");
        final String stringExtra16 = getIntent().getStringExtra("SMS16");
        final String stringExtra17 = getIntent().getStringExtra("SMS17");
        final String stringExtra18 = getIntent().getStringExtra("SMS18");
        final String stringExtra19 = getIntent().getStringExtra("SMS19");
        final String stringExtra20 = getIntent().getStringExtra("SMS20");
        final String stringExtra21 = getIntent().getStringExtra("SMS21");
        final String stringExtra22 = getIntent().getStringExtra("SMS22");
        final String stringExtra23 = getIntent().getStringExtra("SMS23");
        final String stringExtra24 = getIntent().getStringExtra("SMS24");
        final String stringExtra25 = getIntent().getStringExtra("SMS25");
        final String stringExtra26 = getIntent().getStringExtra("SMS26");
        final String stringExtra27 = getIntent().getStringExtra("SMS27");
        final String stringExtra28 = getIntent().getStringExtra("SMS28");
        final String stringExtra29 = getIntent().getStringExtra("SMS29");
        final String stringExtra30 = getIntent().getStringExtra("SMS30");
        this.sms1 = (TextView) findViewById(R.id.sms1);
        this.sms2 = (TextView) findViewById(R.id.sms2);
        this.sms3 = (TextView) findViewById(R.id.sms3);
        this.sms4 = (TextView) findViewById(R.id.sms4);
        this.sms5 = (TextView) findViewById(R.id.sms5);
        this.sms6 = (TextView) findViewById(R.id.sms6);
        this.sms7 = (TextView) findViewById(R.id.sms7);
        this.sms8 = (TextView) findViewById(R.id.sms8);
        this.sms9 = (TextView) findViewById(R.id.sms9);
        this.sms10 = (TextView) findViewById(R.id.sms10);
        this.sms11 = (TextView) findViewById(R.id.sms11);
        this.sms12 = (TextView) findViewById(R.id.sms12);
        this.sms13 = (TextView) findViewById(R.id.sms13);
        this.sms14 = (TextView) findViewById(R.id.sms14);
        this.sms15 = (TextView) findViewById(R.id.sms15);
        this.sms16 = (TextView) findViewById(R.id.sms16);
        this.sms17 = (TextView) findViewById(R.id.sms17);
        this.sms18 = (TextView) findViewById(R.id.sms18);
        this.sms19 = (TextView) findViewById(R.id.sms19);
        this.sms20 = (TextView) findViewById(R.id.sms20);
        this.sms21 = (TextView) findViewById(R.id.sms21);
        this.sms22 = (TextView) findViewById(R.id.sms22);
        this.sms23 = (TextView) findViewById(R.id.sms23);
        this.sms24 = (TextView) findViewById(R.id.sms24);
        this.sms25 = (TextView) findViewById(R.id.sms25);
        this.sms26 = (TextView) findViewById(R.id.sms26);
        this.sms27 = (TextView) findViewById(R.id.sms27);
        this.sms28 = (TextView) findViewById(R.id.sms28);
        this.sms29 = (TextView) findViewById(R.id.sms29);
        this.sms30 = (TextView) findViewById(R.id.sms30);
        this.sms1_share = (Button) findViewById(R.id.sms1_share);
        this.sms2_share = (Button) findViewById(R.id.sms2_share);
        this.sms3_share = (Button) findViewById(R.id.sms3_share);
        this.sms4_share = (Button) findViewById(R.id.sms4_share);
        this.sms5_share = (Button) findViewById(R.id.sms5_share);
        this.sms6_share = (Button) findViewById(R.id.sms6_share);
        this.sms7_share = (Button) findViewById(R.id.sms7_share);
        this.sms8_share = (Button) findViewById(R.id.sms8_share);
        this.sms9_share = (Button) findViewById(R.id.sms9_share);
        this.sms10_share = (Button) findViewById(R.id.sms10_share);
        this.sms11_share = (Button) findViewById(R.id.sms11_share);
        this.sms12_share = (Button) findViewById(R.id.sms12_share);
        this.sms13_share = (Button) findViewById(R.id.sms13_share);
        this.sms14_share = (Button) findViewById(R.id.sms14_share);
        this.sms15_share = (Button) findViewById(R.id.sms15_share);
        this.sms16_share = (Button) findViewById(R.id.sms16_share);
        this.sms17_share = (Button) findViewById(R.id.sms17_share);
        this.sms18_share = (Button) findViewById(R.id.sms18_share);
        this.sms19_share = (Button) findViewById(R.id.sms19_share);
        this.sms20_share = (Button) findViewById(R.id.sms20_share);
        this.sms21_share = (Button) findViewById(R.id.sms21_share);
        this.sms22_share = (Button) findViewById(R.id.sms22_share);
        this.sms23_share = (Button) findViewById(R.id.sms23_share);
        this.sms24_share = (Button) findViewById(R.id.sms24_share);
        this.sms25_share = (Button) findViewById(R.id.sms25_share);
        this.sms26_share = (Button) findViewById(R.id.sms26_share);
        this.sms27_share = (Button) findViewById(R.id.sms27_share);
        this.sms28_share = (Button) findViewById(R.id.sms28_share);
        this.sms29_share = (Button) findViewById(R.id.sms29_share);
        this.sms30_share = (Button) findViewById(R.id.sms30_share);
        this.sms1_send = (Button) findViewById(R.id.sms1_send);
        this.sms2_send = (Button) findViewById(R.id.sms2_send);
        this.sms3_send = (Button) findViewById(R.id.sms3_send);
        this.sms4_send = (Button) findViewById(R.id.sms4_send);
        this.sms5_send = (Button) findViewById(R.id.sms5_send);
        this.sms6_send = (Button) findViewById(R.id.sms6_send);
        this.sms7_send = (Button) findViewById(R.id.sms7_send);
        this.sms8_send = (Button) findViewById(R.id.sms8_send);
        this.sms9_send = (Button) findViewById(R.id.sms9_send);
        this.sms10_send = (Button) findViewById(R.id.sms10_send);
        this.sms11_send = (Button) findViewById(R.id.sms11_send);
        this.sms12_send = (Button) findViewById(R.id.sms12_send);
        this.sms13_send = (Button) findViewById(R.id.sms13_send);
        this.sms14_send = (Button) findViewById(R.id.sms14_send);
        this.sms15_send = (Button) findViewById(R.id.sms15_send);
        this.sms16_send = (Button) findViewById(R.id.sms16_send);
        this.sms17_send = (Button) findViewById(R.id.sms17_send);
        this.sms18_send = (Button) findViewById(R.id.sms18_send);
        this.sms19_send = (Button) findViewById(R.id.sms19_send);
        this.sms20_send = (Button) findViewById(R.id.sms20_send);
        this.sms21_send = (Button) findViewById(R.id.sms21_send);
        this.sms22_send = (Button) findViewById(R.id.sms22_send);
        this.sms23_send = (Button) findViewById(R.id.sms23_send);
        this.sms24_send = (Button) findViewById(R.id.sms24_send);
        this.sms25_send = (Button) findViewById(R.id.sms25_send);
        this.sms26_send = (Button) findViewById(R.id.sms26_send);
        this.sms27_send = (Button) findViewById(R.id.sms27_send);
        this.sms28_send = (Button) findViewById(R.id.sms28_send);
        this.sms29_send = (Button) findViewById(R.id.sms29_send);
        this.sms30_send = (Button) findViewById(R.id.sms30_send);
        this.sms1.setText(stringExtra);
        this.sms2.setText(stringExtra2);
        this.sms3.setText(stringExtra3);
        this.sms4.setText(stringExtra4);
        this.sms5.setText(stringExtra5);
        this.sms6.setText(stringExtra6);
        this.sms7.setText(stringExtra7);
        this.sms8.setText(stringExtra8);
        this.sms9.setText(stringExtra9);
        this.sms10.setText(stringExtra10);
        this.sms11.setText(stringExtra11);
        this.sms12.setText(stringExtra12);
        this.sms13.setText(stringExtra13);
        this.sms14.setText(stringExtra14);
        this.sms15.setText(stringExtra15);
        this.sms16.setText(stringExtra16);
        this.sms17.setText(stringExtra17);
        this.sms18.setText(stringExtra18);
        this.sms19.setText(stringExtra19);
        this.sms20.setText(stringExtra20);
        this.sms21.setText(stringExtra21);
        this.sms22.setText(stringExtra22);
        this.sms23.setText(stringExtra23);
        this.sms24.setText(stringExtra24);
        this.sms25.setText(stringExtra25);
        this.sms26.setText(stringExtra26);
        this.sms27.setText(stringExtra27);
        this.sms28.setText(stringExtra28);
        this.sms29.setText(stringExtra29);
        this.sms30.setText(stringExtra30);
        this.sms1_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass1 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms2_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass2 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra2);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms3_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass3 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra3);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms4_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass4 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra4);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms5_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass5 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra5);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms6_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass6 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra6);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms7_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass7 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra7);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms8_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass8 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra8);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms9_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass9 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra9);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms10_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass10 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra10);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms11_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass11 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra11);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms12_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass12 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra12);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms13_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass13 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra13);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms14_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass14 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra14);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms15_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass15 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra15);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms16_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass16 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra16);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms17_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass17 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra17);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms18_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass18 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra18);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms19_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass19 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra19);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms20_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass20 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra20);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms21_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass21 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra21);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms22_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass22 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra22);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms23_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass23 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra23);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms24_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass24 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra24);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms25_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass25 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra25);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms26_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass26 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra26);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms27_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass27 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra27);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms28_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass28 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra28);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms29_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass29 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra29);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms30_share.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass30 */

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", stringExtra30);
                intent.setType("text/plain");
                Contain.this.startActivity(Intent.createChooser(intent, "শেয়ার করুন"));
            }
        });
        this.sms1_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass31 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra);
                Contain.this.startActivity(intent);
            }
        });
        this.sms2_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass32 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra2);
                Contain.this.startActivity(intent);
            }
        });
        this.sms3_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass33 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra3);
                Contain.this.startActivity(intent);
            }
        });
        this.sms4_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass34 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra4);
                Contain.this.startActivity(intent);
            }
        });
        this.sms5_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass35 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra5);
                Contain.this.startActivity(intent);
            }
        });
        this.sms6_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass36 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra6);
                Contain.this.startActivity(intent);
            }
        });
        this.sms7_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass37 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra7);
                Contain.this.startActivity(intent);
            }
        });
        this.sms8_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass38 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra8);
                Contain.this.startActivity(intent);
            }
        });
        this.sms9_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass39 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra9);
                Contain.this.startActivity(intent);
            }
        });
        this.sms10_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass40 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra10);
                Contain.this.startActivity(intent);
            }
        });
        this.sms11_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass41 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra11);
                Contain.this.startActivity(intent);
            }
        });
        this.sms12_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass42 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra12);
                Contain.this.startActivity(intent);
            }
        });
        this.sms13_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass43 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra13);
                Contain.this.startActivity(intent);
            }
        });
        this.sms14_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass44 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra14);
                Contain.this.startActivity(intent);
            }
        });
        this.sms15_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass45 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra15);
                Contain.this.startActivity(intent);
            }
        });
        this.sms16_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass46 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra16);
                Contain.this.startActivity(intent);
            }
        });
        this.sms17_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass47 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra17);
                Contain.this.startActivity(intent);
            }
        });
        this.sms18_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass48 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra18);
                Contain.this.startActivity(intent);
            }
        });
        this.sms19_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass49 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra19);
                Contain.this.startActivity(intent);
            }
        });
        this.sms20_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass50 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra20);
                Contain.this.startActivity(intent);
            }
        });
        this.sms21_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass51 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra21);
                Contain.this.startActivity(intent);
            }
        });
        this.sms22_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass52 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra22);
                Contain.this.startActivity(intent);
            }
        });
        this.sms23_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass53 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra23);
                Contain.this.startActivity(intent);
            }
        });
        this.sms24_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass54 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra24);
                Contain.this.startActivity(intent);
            }
        });
        this.sms25_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass55 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra25);
                Contain.this.startActivity(intent);
            }
        });
        this.sms26_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass56 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra26);
                Contain.this.startActivity(intent);
            }
        });
        this.sms27_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass57 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra27);
                Contain.this.startActivity(intent);
            }
        });
        this.sms28_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass58 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra28);
                Contain.this.startActivity(intent);
            }
        });
        this.sms29_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass59 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra29);
                Contain.this.startActivity(intent);
            }
        });
        this.sms30_send.setOnClickListener(new View.OnClickListener() {
            /* class com.morichika.sms2020.Contain.AnonymousClass60 */

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", stringExtra30);
                Contain.this.startActivity(intent);
            }
        });

    }
}

