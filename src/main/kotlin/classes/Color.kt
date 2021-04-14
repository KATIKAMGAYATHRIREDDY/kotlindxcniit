package classes

enum class Color (val rgb:Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0f0f0f),
    YELLOW(0xff00ff);
    fun containsRed()=(this.rgb and 0xff0000 !=0)
}
fun main(){
    val red = Color.RED
    println(Color.RED.ordinal)
    println(red.containsRed())
    println(Color.BLUE.containsRed())

}