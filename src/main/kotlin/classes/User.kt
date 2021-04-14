package classes

data class User(val name : String, val id:Int)
    fun main(){
        val user=User("gayathri", 1)
        val secuser=User("gayathri", 1)
        println(user)
        println(user.name)
        println(user.equals(secuser))
        println(user == secuser)

    }
