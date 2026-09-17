package org.example;

import java.sql.SQLOutput;

class Main {

    static String dosyaKucultme(String harfler) {


        int sayac = 1;
        String sonuc = "";

        for (int i = 0; i < harfler.length() - 1; i++) {
            if (harfler.charAt(i) == harfler.charAt(i + 1)) {
                sayac++;

            } else {
                sonuc += "" + sayac + harfler.charAt(i);

                sayac = 1;
            }


        }
        if (!harfler.isEmpty()) {
            sonuc += "" + sayac + harfler.charAt(harfler.length() - 1);
        }

        return sonuc;
    }


    static String dosyaBuyutme(String harfler) {
        String[] harflerinSayilari = new String[harfler.length()/2];
        String[] harflerinHarfleri = new String[harfler.length()/2];

        for (int i = 0; i < harfler.length(); i++) {

            for (int j = 0; j < harfler.length(); j += 2) {
                harflerinSayilari[j/2] = String.valueOf(harfler.charAt(j));
                harflerinHarfleri[j/2] = String.valueOf(harfler.charAt(j));

            }
        }


        String sonuc = "";
        for(int i = 0; i < harflerinSayilari.length ; i++){
            int adet = Integer.parseInt(harflerinSayilari[i]);
            for(int j = 0; j < adet; j++){

                sonuc += harflerinHarfleri[i];
            }
        }

        return sonuc;
    }
    static void main (String[]args){


        System.out.println(dosyaBuyutme("4A5B6C"));
        System.out.println(dosyaKucultme("AAAABBBCCC"));


    }

}
