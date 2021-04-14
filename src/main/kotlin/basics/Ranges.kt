package basics

class Ranges {

}
fun main(){
    val x=2;
    val y=6;
    if(x in 2..y step 2){
        println("x is in the range")
    }
    else{
        println("not in range")
    }
    switchEx(9)
    switchEx(555)
    switchEx(6789)
    val a=2;
    for(a in 10 downTo 1 step 3)println(a)

}
fun switchEx(v:Int)
{

   return when(v)
   {
       in 1..99 -> println("it is 10s")
       in 100..999 ->println("it is 100s")
       in 1000..9999 ->println("it is 1000s")
       else ->println("not valid")
   }
}