class Rectangle(var height:Int,width:Int){
    var peri=2*(height+width)
}

fun main(){
    var rect=Rectangle(5,6);
    println("perimeter is = ${rect.peri}")
    println("hello world")
    //var a:Int = 10;
    //var b =20;
    //var d = "gayathri";
    //var e; here type is required
    var c = add(10,20);
    print(c)
}
fun add(fNo : Int, sNo : Int): Int{
    return fNo+sNo
}