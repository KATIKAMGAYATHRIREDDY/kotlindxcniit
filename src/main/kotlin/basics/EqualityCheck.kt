package basics

class EqualityCheck {
}
fun main(){
    //val listAuthors = listOf<String>("author1","author2")
    //val listWriters = listOf<String>("author1","author2")
    val listAuthors = setOf<String>("author1","author2")
    val listWriters = setOf<String>("author2","author1")

    println(listAuthors == listWriters)//compare contents of sets
    println(listAuthors === listWriters)//compare references

}