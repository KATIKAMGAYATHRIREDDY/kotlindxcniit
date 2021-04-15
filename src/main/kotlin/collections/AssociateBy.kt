package collections

class AssociateBy {
}
data class Person(val name:String,val city: String,val phone :Int)
val people= listOf<Person>(
    Person("gayathri","banglore",1234567),
    Person("raju","hyd",12345),
    Person("ram","ap",12367),
    Person("ramu","banglore",14567)


)
fun main()
{
    val phoneBook=people.associateBy { it.city }
    println(phoneBook)
    val phoneBookg=people.groupBy { it.city }
println(phoneBookg)

}
