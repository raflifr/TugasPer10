package com.example.tugasper10;

import java.util.ArrayList;

public class DataHero {
    private static String Name [] = {
            "Barbara",
            "Diluc",
            "Fischl",
            "Ganyu",
            "Hu Tao",
            "Jean",
            "Keqing",
            "Mona",
            "Sucrose",
            "Xiao"
    };

    private static String Weapon [] = {

            "Catalyst / Hydro",
            "Claymore / Pyro",
            "Bow / Electro",
            "Bow / Cyro",
            "Polearm / Pyro",
            "Sword / Anemo",
            "Sword / Electro",
            "Catalyst / Hydro",
            "Catalyst / Anemo",
            "Polearm / Anemo"
    };

    private static String Descrition [] = {

            "Seorang Deaconess dari Favonius Church, juga merupakan bintang idola yang bersinar di mata para penduduk Mondstadt. Bagi sebagian orang di Mondstadt, bintang idola adalah profesi yang asing, mereka lebih terbiasa dengan penyair jalanan, tetapi mereka tetap mencintai Barbara. Semua ini berkat semangat kebebasan yang menjadi dasar kota Mondstadt.",
            "Sebagai pemuda terkaya di Mondstadt, Diluc selalu menampilkan citra yang sempurna di hadapan semua orang. Tetapi dibalik kesopanannya, tersembunyi jiwa ksatria membara yang siap mengorbankan apapun demi melindungi Mondstadt. Tidak ada sedikit pun belas kasihan di hatinya saat menghadapi musuh yang berani menyentuh kota dibawah perlindungannya.",
            "Seorang gadis misterius yang menyevut dirinya Prinzessin der Verurteilung, dia selalu bersama dengan seekor gagak hitam yang bernama Oz. Kini memegang posisi sebagai investigator di dalam Adventurers Guild. Dengan kemampuannya yang unik dan perilakunya yang eksentrik dan juga kerja kerasnya, Fischl menjadi seorang bintang di anatara para investigator Adventures Guild dan mendapatkan pengakuan dari semua orang. ",
            "Seorang sekretaris di Yuehai Pavillion. Darah hewan pusaka Qilin mengalir dalam tubuhnya. Pembawaan Ganyu sangat elegan dan tenang, tapi sifat lembut Qilin yang ada dalam dirinya tidak menghalangi Ganyu untuk tetap tegas dan disiplin dalam pekerjaannya. Bagaimanapun juga, semua pekerjaan yang Ganyu selesaikan adalah demi memenuhi kontraknya dengan Rex Lapis, menjamin kesejahteraan untuk semua yang hidup di Liyue",
            "Master ke-77 Washeng Funeral Parlor. Dia mengambil alih bisnis ini di umur yang cukup muda.Terlepas dari posisinya Hu Tao  adalah orang yang baik dan mudah didekati. Tingkah lakunya yang unik sama beragamnya seperti pasir di Yaoguang Shoal. Hu Tao mungkin tampak selalu bermain-main dan menghabiskan waktu luang untuk bersantai. Dimata khayalak luas, gadis itu dikenal sebagai pemilik bisnis wisata yang tidak bisa dikendalikan pemerintah, ketika Hu Tao harus memimpin pengurusnya melewati gang yang diterangi lampu remang-remang, di saat itulah dia akan menunjukkan sosok yang bermartabat dan serius ",
            "Dandelion Knight yang menjunjung tinggi keadilan dan kebenaran. Menjabat sebagai Grand Master Knights of Favonius di Mondstadt. Jean menjunjung tinggi kebebasan yang ditawarkan Mondstadt kebih dari apapun, karena itu dia sungguh mengerti makna dari kebebasan ini dan selalu berusaha bersikap tegas dan disiplin, agar dirinya menjadi teladang bagi semua orang",
            "Yuheng dari Liyue Qixing, dia memiliki banyak hal yang ingin dikatakan mengenai Rex Lapis, sang pemimpin Liyue. Dia percaya bahwa masa depan manusia harus ditentukan oleh manusia sendiri, dan manusia bahkan bisa melakukan lebih baik dari yang dilakukan Archon dan Adeptus untuk mereka. Sehingga untuk membuktikannya dia bekerja lebih keras daripada yang lain",
            "Seorang Astrolog yang menyebut dirinya sendiri sebagai Astrologist Mona Megistus dan memiliki kemampuan yang sesuai dengan julukannya yang mana kepandainnya setara dengan keangkuhannya. Semiskin atau sesulit apapun hidup Mona, dia tidak akan pernah menggunakan kemampuan meramalnya untuk mencari uang. Prinsip inilah yang membuat Mona selalu mengkhawatirkan kondisi keuangannya.",
            "Seorang ahli kimia dengan hati penuh rasa ingin tahu yang tak pernah terpuaskan. Tergabung dengan Knight of Favonius sebagai asisten Albedo, dan bidang penelitiannya berpusat pada Bio-alkimia. Harapannya adalah untuk mengubah kehidupan dan masa depa dengan ilmu alkimianya dan membuat dunia lebih berwarna. Meskipun beberapa hasil penelitiannya sangat aneh, tapi secara keseluruhan, terbukti bahwa dia telah membuat kontribusi besar dalam bidang Bio-alkimia",
            "Salah satu para Adeptus Perkasa dan Terang yang melindungi Liyue yang dijuluki sebagai Vigilant Yaksha. Yaksha sesosok makhluk abadi yang juga memiliki julukan Conqueror of Demons atau Guardian Yaksha. Meskipun penampilannya terlihar seperti seorang anak muda, namun legenda tentangnya telah banyak dikisahkan di buku-buku kuno sejak ribuan tahun lalu. "
    };

    private  static  int HeroImages[] = {
            R.drawable.barbara,
            R.drawable.diluc,
            R.drawable.fischl,
            R.drawable.ganyu,
            R.drawable.hu_tao,
            R.drawable.jean,
            R.drawable.keqing,
            R.drawable.mona,
            R.drawable.sucrose,
            R.drawable.xiao


    };

    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < Name.length; position++){
            Hero hero = new Hero();
            hero.setName(Name[position]);
            hero.setWeapon(Weapon[position]);
            hero.setDetail(Descrition[position]);
            hero.setPhoto(HeroImages[position]);
            list.add(hero);
        }
        return list;
    };
}

