package functions

data class Order (val quantity:Int)
fun Order.isStockAvailable():Boolean{
    return false
}
public fun String.isMale(name:String):Boolean{
    if(name.startsWith("A"))
    {return true}
    else
    {return false}
}
fun main()
{
    println(String().isMale("Abhi"))

}