package excercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
data class Profile(val firstName: String, val lastName: String, val age: Int, val isSingle: Boolean)

fun myProfile() {
    val myData = Profile("Afidz", "Prastyo", 24, false)

    with(myData) {
        println("Nama: $firstName $lastName")
        println("Umur: $age tahun")
        println("Status: ${if (isSingle) "Single" else "Not Single"}")
    }

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String) {
    println("Group ID: $groupId")
    println("Group Member: $groupMember")
    println("Session: $session")
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 */
fun myTeam(): List<Any> {
    val groupMember =
        listOf("Afidz", "Adhel", "Widya", "Aqil", "Aryanto", "Rifqi", "Wulan", "Annisa", "Sultan", "Dimas")
    return groupMember
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(mentor: Array<String>, groupMembers: List<String>): Int {
    return mentor.size + groupMembers.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("FifthyOne", listOf("Afidz", "Adhel", "Widya", "Aqil", "Aryanto", "Rifqi", "Wulan", "Annisa", "Sultan", "Dimas"), "Morning")

    val mentors = arrayOf("Mentor1", "Mentor2")
    val totalMembers = totalMember(mentors, myTeam as List<String>)
    println("Total Member group: $totalMembers")
}