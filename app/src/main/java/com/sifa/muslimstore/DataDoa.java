package com.sifa.muslimstore;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataDoa extends AppCompatActivity {

    private TextView Getdoa, Getarab, Getbaca, Getarti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doa);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getbaca = findViewById(R.id.getbaca);
        Getarti = findViewById(R.id.getarti);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData() {
        String doa = getIntent().getExtras().getString("MyName");

        switch (doa) {
            case "Doa Sebelum Makan":
                Getdoa.setText("Doa Sebelum Makan");
                Getarab.setText("اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
                Getbaca.setText("Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar");
                Getarti.setText("Artinya : Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka");
                break;

            case "Doa Sesudah Makan":
                Getdoa.setText("Doa Sesudah Makan");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ");
                Getbaca.setText("Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin");
                Getarti.setText("Artinya : Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam");
                break;

            case "Doa Sebelum Tidur":
                Getdoa.setText("Doa Sebelum Tidur");
                Getarab.setText("بِسْمِكَ االلّٰهُمَّ اَحْيَا وَبِاسْمِكَ اَمُوْتُ");
                Getbaca.setText("Bismikallaahuma ahyaa wa bismika amuutu");
                Getarti.setText("Artinya : Dengan menyebut nama-Mu, Ya Allah, aku hidup dan dengan menyebut nama-Mu aku mati");
                break;

            case "Doa Turun Hujan":
                Getdoa.setText("Doa Turun Hujan");
                Getarab.setText("إِنَّ النَّبِىَّ -صلى الله عليه وسلم- كَانَ إِذَا رَأَى الْمَطَرَ قَالَ اللَّهُمَّ صَيِّباً نَافِعاً");
                Getbaca.setText("Allahumma shoyyiban nafi’an");
                Getarti.setText("Artinya: Ya Allah turunkanlah pada kami hujan yang bermanfaat");
                break;

            case "Doa Berpergian":
                Getdoa.setText("Doa Berpergian");
                Getarab.setText("أَسْتَوْدِعُ اللَّهَ دِينَكَ وَأَمَانَتَكَ وَخَوَاتِيمَ عَمَلِكَ زَوَّدَكَ اللهُ التَّقْوَى، وَغَفَرَ ذَنْبَكَ، وَيَسَّرَ لَكَ الْخَيْرَ حَيْثُ مَا كُنْت");
                Getbaca.setText("Astaudi’ullaha dinaka wa amanataka wa khowatima ‘amalika zawwadakallahut taqwa wa ghafaro zanbaka wa yassaro lakal khoiro haitsuma kunta");
                Getarti.setText("Artinya: “Aku menitipkan kepada Allah agamamu, amanahmu dan penutup amalmu. Semoga Allah membekalimu ketakwaan, mengampuni dosa-dosamu, dan memudahkan kebaikan kepadamu di mana pun kamu berada");

                break;

        }
    }
}
