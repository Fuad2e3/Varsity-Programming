package com.example.myapplication;

import static com.example.myapplication.R.id.id_about;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
    public class MainActivity extends AppCompatActivity {


            /*    AdView adView;*/
            Button bijoy;
            Button birthday;
            Button boka;
            Button eid;
            Button fabruary;
            Button frend;
            Button indpendents;
            Button islamic;
            Button love;
            Button love1;
            Button love2;
            Button maride;
            Button monapora;
            Button morning;
            Button nboborshi;
            Button newyears;
            Button night;
            Button sad;
            Button suvokamona;
            Button vlantiynday;

            public boolean onCreateOptionsMenu(Menu menu) {
                getMenuInflater().inflate(R.menu.my_menu, menu);
                return true;
            }

           //  @SuppressLint("NonConstantResourceId")


            /* access modifiers changed from: protected */
            @Override
            // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(R.layout.activity_main);
        /*this.adView = new AdView(this, "2505506923042021_2505508703041843", AdSize.BANNER_HEIGHT_50);
        ((LinearLayout) findViewById(R.id.banner_container)).addView(this.adView);
        this.adView.loadAd();*/

                Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setTitle(R.string.app_name);

                this.eid = (Button) findViewById(R.id.eid);
                this.love = (Button) findViewById(R.id.love);
                this.love1 = (Button) findViewById(R.id.love1);
                this.love2 = (Button) findViewById(R.id.love2);
                this.nboborshi = (Button) findViewById(R.id.nboborshi);
                this.bijoy = (Button) findViewById(R.id.bijoy);
                this.newyears = (Button) findViewById(R.id.newyears);
                this.islamic = (Button) findViewById(R.id.islamik);
                this.boka = (Button) findViewById(R.id.boka);
                this.monapora = (Button) findViewById(R.id.monapora);
                this.morning = (Button) findViewById(R.id.morning);
                this.night = (Button) findViewById(R.id.night);
                this.indpendents = (Button) findViewById(R.id.indpendents);
                this.fabruary = (Button) findViewById(R.id.fabruary);
                this.sad = (Button) findViewById(R.id.sad);
                this.frend = (Button) findViewById(R.id.frend);
                this.vlantiynday = (Button) findViewById(R.id.vlantiynday);
                this.maride = (Button) findViewById(R.id.maride);
                this.suvokamona = (Button) findViewById(R.id.suvokamona);
                this.birthday = (Button) findViewById(R.id.birthday);
                this.eid.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass1 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.eid1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.eid2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.eid3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.eid4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.eid5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.eid6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.eid7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.eid8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.eid9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.eid10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.eid11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.eid12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.eid13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.eid14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.eid15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.eid16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.eid17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.eid18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.eid19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.eid20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.eid21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.eid22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.eid23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.eid24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.eid25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.eid26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.eid27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.eid28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.eid29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.eid30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.love.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass2 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.love1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.love2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.love3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.love4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.love5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.love6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.love7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.love8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.love9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.love10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.love11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.love12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.love13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.love14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.love15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.love16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.love17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.love18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.love19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.love20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.love21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.love22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.love23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.love24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.love25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.love26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.love27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.love28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.love29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.love30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.love1.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass3 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.love31));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.love32));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.love33));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.love34));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.love35));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.love36));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.love37));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.love38));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.love39));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.love40));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.love41));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.love42));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.love43));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.love44));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.love45));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.love46));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.love47));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.love88));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.love49));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.love50));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.love51));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.love52));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.love53));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.love54));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.love55));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.love56));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.love57));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.love58));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.love59));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.love60));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.love2.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass4 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.love61));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.love62));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.love63));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.love64));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.love65));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.love66));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.love67));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.love68));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.love69));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.love70));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.love71));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.love72));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.love73));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.love74));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.love75));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.love76));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.love77));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.love78));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.love79));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.love80));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.love81));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.love82));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.love83));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.love84));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.love85));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.love86));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.love87));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.love88));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.love89));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.love90));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.nboborshi.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass5 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.nn1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.n2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.n3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.n4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.n5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.n6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.n7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.n8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.n9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.n10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.n11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.n12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.n13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.n14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.n15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.n16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.n17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.n18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.n19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.n20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.n21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.n22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.n23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.n24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.n25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.n26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.n27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.n28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.n29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.n30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.bijoy.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass6 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.b1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.b2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.b3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.b4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.b5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.b6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.b7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.b8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.b9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.b10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.b11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.b12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.b13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.b14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.b15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.b16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.b17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.b18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.b19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.b20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.b21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.b22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.b23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.b24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.b25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.b26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.b27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.b28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.b29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.b30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.newyears.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass7 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.m1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.m2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.m3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.m4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.m5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.m6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.m7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.m8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.m9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.m10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.m11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.m12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.m13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.m14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.m15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.m16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.m17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.m18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.m19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.m20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.m21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.m22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.m23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.m24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.m25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.m26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.m27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.m28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.m29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.m30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.islamic.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass8 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.z1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.z2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.z3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.z4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.z5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.z6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.z7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.z8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.z9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.z10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.z11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.z12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.z13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.z14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.z15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.z16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.z17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.z18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.z19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.z20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.z21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.z22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.z23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.z24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.z25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.z26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.z7));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.z28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.z29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.z30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.boka.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass9 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.xx1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.x2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.x3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.x4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.x5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.x6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.x7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.x8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.x9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.x10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.x11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.x12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.x13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.x14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.x15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.x16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.x17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.x18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.x19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.x20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.x21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.x22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.x23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.x24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.x25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.x26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.x27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.x28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.x29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.x30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.monapora.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass10 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.c1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.c2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.c3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.c4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.c5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.c6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.c7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.c8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.c9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.c10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.c11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.c12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.c13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.c14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.c15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.c16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.c17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.c18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.c19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.c20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.c21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.c22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.c23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.c24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.c25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.c26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.c27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.c28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.c29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.c30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.morning.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass11 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.v1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.v2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.v3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.v3));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.v5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.v6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.v7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.v8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.v9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.v10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.v11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.v12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.v13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.v14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.v15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.v16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.v17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.v18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.c19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.v30));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.v20));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.v21));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.v22));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.v23));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.v24));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.v25));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.v26));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.v27));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.v28));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.v29));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.night.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass12 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.a1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.a2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.a3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.a4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.a5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.a6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.a7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.a8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.a9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.a10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.a11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.a12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.a13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.a14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.a15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.a16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.a17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.a18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.a19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.a20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.a21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.a22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.a23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.a24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.a25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.a26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.a27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.a28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.a29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.a30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.indpendents.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass13 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.s1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.s2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.s3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.s4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.s5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.s6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.s7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.s8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.s9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.s10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.s11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.s12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.s13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.s14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.s15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.s16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.s17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.s18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.s19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.s20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.s21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.s22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.s23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.s24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.s25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.s26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.s27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.s28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.s29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.s30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.fabruary.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass14 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.e1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.e2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.e3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.e4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.e5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.e6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.e7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.e8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.e9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.e10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.e11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.e12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.e13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.e14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.e15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.e16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.e17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.e18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.e19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.e20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.e21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.e22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.e23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.e24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.e25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.e26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.e27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.e28));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.e29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.e30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.sad.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass15 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.k1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.k2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.k3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.k4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.k5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.k6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.k7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.k8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.k9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.k10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.k11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.k12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.k13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.k14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.k15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.k16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.k17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.k18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.k19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.k20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.k21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.k22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.k23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.k24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.k25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.k26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.k27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.k26));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.k29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.k30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.frend.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass16 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.kk1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.kk2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.kk3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.kk4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.kk5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.kk6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.kk7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.kk8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.kk9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.kk10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.kk11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.kk12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.kk13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.kk14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.kk15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.kk16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.kk17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.kk18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.kk19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.kk20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.kk21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.kk22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.kk23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.kk24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.kk25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.kk26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.kk27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.kk26));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.kk29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.kk30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.vlantiynday.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass17 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.kkk1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.kkk2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.kkk3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.kkk4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.kkk5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.kkk6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.kkk7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.kkk8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.kkk9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.kkk10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.kkk11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.kkk12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.kkk13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.kkk14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.kkk15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.kkk16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.kkk17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.kkk18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.kkk19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.kkk20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.kkk21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.kkk22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.kkk23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.kkk24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.kkk25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.kkk26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.kkk27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.kkk26));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.kkk29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.kkk30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.maride.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass18 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.kkkk1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.kkkk2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.kkkk3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.kkkk4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.kkkk5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.kkkk6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.kkkk7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.kkkk8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.kkkk9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.kkkk10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.kkkk11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.kkkk12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.kkkk13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.kkkk14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.kkkk15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.kkkk16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.kkkk17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.kkkk18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.kkkk19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.kkkk20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.kkkk21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.kkkk22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.kkkk23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.kkkk24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.kkkk25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.kkkk26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.kkkk27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.kkkk26));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.kkkk29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.kkkk30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.suvokamona.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass19 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.kkkkk1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.kkkkk2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.kkkkk3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.kkkkk4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.kkkkk5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.kkkkk6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.kkkkk7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.kkkkk8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.kkkkk9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.kkkkk10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.kkkk11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.kkkkk12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.kkkkk13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.kkkkk14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.kkkkk15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.kkkkk16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.kkkkk17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.kkkkk18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.kkkkk19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.kkkkk20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.kkkkk21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.kkkkk22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.kkkkk23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.kkkkk24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.kkkkk25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.kkkkk26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.kkkkk27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.kkkkk26));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.kkkkk29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.kkkkk30));
                        MainActivity.this.startActivity(intent);
                    }
                });
                this.birthday.setOnClickListener(new View.OnClickListener() {
                    /* class com.morichika.sms2020.MainActivity.AnonymousClass20 */

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Contain.class);
                        intent.putExtra("SMS1", MainActivity.this.getString(R.string.kkkkkk1));
                        intent.putExtra("SMS2", MainActivity.this.getString(R.string.kkkkkk2));
                        intent.putExtra("SMS3", MainActivity.this.getString(R.string.kkkkkk3));
                        intent.putExtra("SMS4", MainActivity.this.getString(R.string.kkkkkk4));
                        intent.putExtra("SMS5", MainActivity.this.getString(R.string.kkkkkk5));
                        intent.putExtra("SMS6", MainActivity.this.getString(R.string.kkkkkk6));
                        intent.putExtra("SMS7", MainActivity.this.getString(R.string.kkkkkk7));
                        intent.putExtra("SMS8", MainActivity.this.getString(R.string.kkkkkk8));
                        intent.putExtra("SMS9", MainActivity.this.getString(R.string.kkkkkk9));
                        intent.putExtra("SMS10", MainActivity.this.getString(R.string.kkkkkk10));
                        intent.putExtra("SMS11", MainActivity.this.getString(R.string.kkkkkk11));
                        intent.putExtra("SMS12", MainActivity.this.getString(R.string.kkkkkk12));
                        intent.putExtra("SMS13", MainActivity.this.getString(R.string.kkkkkk13));
                        intent.putExtra("SMS14", MainActivity.this.getString(R.string.kkkkkk14));
                        intent.putExtra("SMS15", MainActivity.this.getString(R.string.kkkkkk15));
                        intent.putExtra("SMS16", MainActivity.this.getString(R.string.kkkkkk16));
                        intent.putExtra("SMS17", MainActivity.this.getString(R.string.kkkkkk17));
                        intent.putExtra("SMS18", MainActivity.this.getString(R.string.kkkkkk18));
                        intent.putExtra("SMS19", MainActivity.this.getString(R.string.kkkkkk19));
                        intent.putExtra("SMS20", MainActivity.this.getString(R.string.kkkkkk20));
                        intent.putExtra("SMS21", MainActivity.this.getString(R.string.kkkkkk21));
                        intent.putExtra("SMS22", MainActivity.this.getString(R.string.kkkkkk22));
                        intent.putExtra("SMS23", MainActivity.this.getString(R.string.kkkkkk23));
                        intent.putExtra("SMS24", MainActivity.this.getString(R.string.kkkkkk24));
                        intent.putExtra("SMS25", MainActivity.this.getString(R.string.kkkkkk25));
                        intent.putExtra("SMS26", MainActivity.this.getString(R.string.kkkkkk26));
                        intent.putExtra("SMS27", MainActivity.this.getString(R.string.kkkkkk27));
                        intent.putExtra("SMS28", MainActivity.this.getString(R.string.kkkkkk26));
                        intent.putExtra("SMS29", MainActivity.this.getString(R.string.kkkkkk29));
                        intent.putExtra("SMS30", MainActivity.this.getString(R.string.kkkkkk30));
                        MainActivity.this.startActivity(intent);
                    }
                });
            }
        }
