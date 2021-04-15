package collections

val issues:MutableSet<String> = mutableSetOf("issue 1","issue 2","issue 3","issue 4")
fun addIssue(issue:String):Boolean {
    if (issues.add(issue)) {
        println("issue added suuccessfully")
        return true
    } else {
        println("issue already exists")
return false
    }
}


class Sets {
}
fun main()
{
    println(issues)
    println(addIssue("issue 5"))
    println(issues)
    println(addIssue("issue 4"))
}