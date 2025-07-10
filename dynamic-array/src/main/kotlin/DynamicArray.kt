class DynamicArray(
    private var array: Array<String?> = arrayOfNulls(size = 1),
    private var capacity: Int = 1,
    private var length: Int = 0
) {

    fun get(index: Int): String? = if (index >= 0 && index < length) array[index] else "IndexOutOfBounds"

    /*if the capacity is full it doubles*/
    fun push(word: String) {
        if (length == capacity) {
            val tempArray = arrayOfNulls<String>(size = capacity * 2)
            for (item in array.indices) {
                tempArray[item] = array[item]
            }
            array = tempArray
            capacity = capacity * 2 /*🤷‍♀️*/
        }
     array[length]=word
     length++
    }

    fun replace(index: Int,word: String){
        if (index>=0 && index < length)
            array[index] = word
        else
            print("IndexOutOfBound")
    }
    fun pop(){
        if (length > 0){
            length--
        }
    }

}


