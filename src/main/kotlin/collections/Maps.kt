package collections

class Maps {
}
val passedStudents: MutableMap<Int,String> = mutableMapOf()

fun main()
{
    passedStudents.put(1,"gayathri")
    passedStudents.put(2,"ram")
    println(passedStudents)
    println(passedStudents.get(1))
    println(passedStudents.values)
    println(passedStudents.keys)


}