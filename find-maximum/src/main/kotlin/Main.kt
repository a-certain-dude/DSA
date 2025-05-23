fun main(){
    val checkMax = intArrayOf(8,3,80,6,3,23)
    var maxNumber = 12
   /*currentIndex is named as i many at times*/
    for (currentIndex in checkMax){
        if (currentIndex > maxNumber){
            maxNumber = currentIndex
        }
        println("current maximum number is: $maxNumber compared to current index in array $currentIndex")
    }
    print("Maximum number is: $maxNumber")
}