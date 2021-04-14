package basics

class Nullable {
}
fun main(){
    var name:String="my name is"
    val s2:String?="can be null or not"
    //s2.length// this is not possible//nullable
    var l=name.length
    println("length is : $l")
    var l1=s2?.length
    println("length is : $l1")

}