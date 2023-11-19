package excercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    val userInput = "293Eksa"

    try {
        val number = userInput.toInt()
        println("Angka yang diinput: $number")
    } catch (e: NumberFormatException) {
        println("Error: Input tidak valid, bukan angka.")
    }
}
