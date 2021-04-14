package basics

class WhenThen {
}
fun main(){
    println(describe(1))
    println(describe("Hello"))
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