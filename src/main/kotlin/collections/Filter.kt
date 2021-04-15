package collections

class Filter {
}
val nos= listOf<Int>(1,2,-3,4,-5,-7,-9)
val words= listOf<String>("first","element","of","the","list","last")
fun main()
{
    val first=words.find { it.startsWith("f") }
    println(first)
    val last=words.find { it.startsWith("l") }
    println(last)
    val firstNo=nos.first()
    val lastNo=nos.last()
    println("first of no is =$firstNo, last of no is =$lastNo")
    val firstEvenNo=nos.first { it%2==0 }
    println(firstEvenNo)
    val lastEvenNo=nos.first { it%2==0 }
    println(lastEvenNo)
    val positives=nos.filter { x -> x>0 }
    //val positives=nos.filter { it >0 }

    println(positives)
    val doubles = nos.map { x -> x*2 }
    println("doubles= $doubles")
    println("is any of the no is greater than 2 "+nos.all { it > 2 })
    println("is all the no less than 5 "+nos.all { it < 5 })
    println("are non of the no greater than 5 "+nos.none { it > 5 })
}