

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


fun secondGreatestAndSmallest(list: List<Int>) {
    val max = list.maxOrNull() ?: 0
    var setForMax = list.toMutableSet()
    setForMax.remove(max)

    val min = list.minOrNull() ?: 0
    val setForMin = list.toMutableSet()
    setForMin.remove(min)

    println(
        "რიგით მეორე მაქსიმალური რიცხვი - ${setForMax.maxOrNull()} \n" +
                "რიგით მეორე მინიმალური რიცხვი - ${setForMin.minOrNull()} "
    )
}