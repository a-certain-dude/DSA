// how to reverse a string


var string: String = "nkwantabisaJoseph.Gh"

//function to reverse the string
fun reverseString(stringInput: String): String {
    val reversedString = stringInput.reversed()
    println(reversedString)
    return reversedString
}

const val newString = "myOnlyGhana.com"
fun newReverseFunction(stringInput: String): String {
    var storeReversedString = "" // is empty because we haven't added any values yet
    /*i would start at the last index and go down to 0 first index*/
    for (i in stringInput.length - 1 downTo 0) {
        /*at each iteration of the 15 characters it gets the current character backwards till it gets to zero*/
        storeReversedString = storeReversedString + stringInput[i]
    }
    println(storeReversedString)
    return storeReversedString
}


fun main() {
    reverseString(string)
    newReverseFunction(newString)
}
