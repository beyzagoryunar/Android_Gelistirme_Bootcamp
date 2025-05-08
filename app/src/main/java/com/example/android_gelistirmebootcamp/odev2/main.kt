package com.example.android_gelitirme_bootcamp_odevler.odev2

fun main() {
    val fonksiyon = Fonksiyonlar()
    println("Dereceyi Fahrenheit'a çevir: ${fonksiyon.dereceToFahrenheit(25.0)}")
    println("Dikdörtgen Çevresi: ${fonksiyon.dikdortgenCevresi(5, 10)}")
    println("5 sayısının faktoriyeli: ${fonksiyon.faktoriyelHesapla(5)}")
    println("Kelimedeki 'a' harfi sayısı: ${fonksiyon.aHarfiSayisi("Ankara")}")
    println("İç açılar toplamı: ${fonksiyon.icAciToplami(5)} derece")
    println("Maaş hesaplama: ${fonksiyon.maasHesapla(22)} tl")
    println("İnternet ücreti: ${fonksiyon.kotaUcretiHesapla(60)} tl")  }