package exercise5

import Hero

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    hero.setProfile("Afidz", 24, 165)

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    hero.profile()

    /**
    Challenge:
    ===============Class A Morning===============

    Fifty-One -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x

     **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    hero.jalan()
    hero.lari()
    hero.makan()
    hero.minum()
    hero.lompat()
    hero.duduk()

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    hero.profile()
}
