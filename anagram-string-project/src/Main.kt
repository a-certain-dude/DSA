fun areAnagrams(str1: String, str2: String): Boolean {
    val s1 = str1.lowercase().filter { remove -> remove.isLetterOrDigit() }
    val s2 = str2.lowercase().filter { remove -> remove.isLetterOrDigit() }
    println("The length of str1: ${s1.length} and the length of ${s2.length}")
    return s1.length == s2.length
}

fun main() {

    val check = areAnagrams(str1 = "listen ", str2 = "silent")
    print(check)

}