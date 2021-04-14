class Second{

}
fun main(){
    var a=1;
    var name="gayathri $a is gayathri going"
    //val name="gayathri"
    // name="reddy" //if variable is decared as "val" then it cant be modified in middle
    //var age=123
    var sentence="${name.replace("gayathri","reddy")}"
    //print("hello world")
    println(sentence)
    println(maxOfNumbers(10,20))
    println(minOfNumbers(10,20))

    val items= listOf("ram","ramu","gayathri")

         when {
            "ram" in items -> println("he is from AP")
             "ramu" in items ->println("he is from  Telangana")
             "gayathri" in items -> println("She is from Andhra")

        }

    fun describe(obj :Any):String{
        return when(obj){
            1 -> "one"
            "Hello" -> "greeting"
            is Long -> "given me a long number"
            !is String -> "it is not a string"
            else -> "unknown"
        }
    }
    for(item in items){
        println(item)
    }
    for(index in items.indices){
        println("item at $index is ${items[index]}")
    }
    var indexs=0
    while(indexs <items.size){
        println("${items[indexs]} is at $indexs")
        indexs++
    }
}

fun maxOfNumbers(a:Int,b:Int):Int
{
    if(a>b) return a
    else return b;
}

fun minOfNumbers(a:Int,b:Int):Int{
    //if a<b then return a,else return b
   if(a<b)return a
   else return b
}
