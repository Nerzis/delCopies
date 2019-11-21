fun main(){
    println(deleteCopies(listOf("Anna", "Ben", "Alex", "Anna", "Peter", "Jack", "Ben")))
}

fun deleteCopies(inputList: List<String>): List<String> {
    var resList = mutableListOf<String>()
    for (k in inputList.withIndex()) {
        if (k.value !in resList) resList.add(k.value)
    }
    return resList
}