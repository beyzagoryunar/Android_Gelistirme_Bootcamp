package com.example.android_gelitirme_bootcamp_odevler.odev2

class Fonksiyonlar {
    fun dereceToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }


    fun dikdortgenCevresi(kenar1: Int, kenar2: Int): Int {
        return 2 * (kenar1 + kenar2)
    }

    // 3. Faktoriyel hesaplayan metod
    fun faktoriyelHesapla(sayi: Int): Int{
        var i = 1;
        var sonuc = 1;
        while (i<=sayi) {
            sonuc *= i
            i++
        }
        return sonuc
    }

    // 4. Kelimede 'a' harfi sayısını bulan metod
    fun aHarfiSayisi(kelime: String): Int {
        var i = 0
        var sonuc = 0
        while (i < kelime.length){
            if (kelime[i]=='a'){
                sonuc++
            }
            i++
        }
        return sonuc
    }


    // 5. İç açılar toplamını hesaplayan metod
    fun icAciToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    // 6. Gün sayısına göre maaş hesaplayan metod
    fun maasHesapla(gunSayisi: Int): Int {
        val calismaSaati = gunSayisi * 8
        val normalSaat = 160
        val saatUcreti = 10
        val mesaiUcreti = 20

        return if (calismaSaati <= normalSaat) {
            calismaSaati * saatUcreti
        } else {
            val mesaiSaati = calismaSaati - normalSaat
            (normalSaat * saatUcreti) + (mesaiSaati * mesaiUcreti)
        }
    }

    // 7. Kota miktarına göre internet ücreti hesaplayan metod
    fun kotaUcretiHesapla(kotaGb: Int): Int {
        val sabitUcret = 100
        val kotaLimiti = 50
        val asimUcreti = 4

        return if (kotaGb <= kotaLimiti) {
            sabitUcret
        } else {
            val asimMiktari = kotaGb - kotaLimiti
            sabitUcret + (asimMiktari * asimUcreti)
        }
    }
}

