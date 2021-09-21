fun main() {



    val a = arrayOf(8, 3, 4, 5, 6, 5, 3, 5, 99, 87, 65, 3, 3)
    val b = arrayOf(1, 1, 11, 11, 11,1,1,1,1,1,1)

//val b = mutableListOf<Int>(3,4,5,6,6,6,5,6)



    val a1 = listOf(1,11,1,1,2,3)
    val a2 = listOf(4,2,7,2,2,3)

println(a1.sum())
    println(a1.count())
    println(a1.sum().toFloat()/a1.count())

/*
   println(differentElementsCountInArray(a))
    println(intersectedList(a1,a2))
    println(unionList(a1,a2))*/
}


fun differentElementsCountInArray(arr: Array<Int>): Int {
    //ვარიანტი #1
    //return arr.toSet().count()

    //ვარიანტი #2
/*    val list = mutableListOf<Int>()
    var count = 0
    for (element in arr) {
        if (element !in list) {
            list.add(element)
            count += 1
        }
    }
    return count*/

    //ვარიანტი #3
    val list = mutableListOf<Int>()

    arr.forEach { if (it !in list) list.add(it) }
    return list.count()
}

fun intersectedList(li1: List<Int>, li2: List<Int> ):Set<Int>{
    return li1.intersect(li2)

}

fun unionList(li1: List<Int>, li2: List<Int> ):Set<Int>{
    return li1.union(li2)

}

fun lessThanAverage(list: List<Int>):List<Int>{

    val newList = mutableListOf<Int>()

    var average = list.sum().toFloat()/list.count()

    for (element in list){
        if (element.toFloat() < average){
            newList.add(element)
        }

        return newList
    }


}