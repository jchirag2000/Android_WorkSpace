fun main()
{
    val s1=Student3(101, "Chirag")
    val s2=Student3(102, "Raju")
    s1.display()
    s2.display()
}
class Student3(private var id:Int, private var name:String)
{
    companion object
    {
        var college:String="GEC-Rajkot"
    }
    fun display()
    {
        println("-------------------------------------")
        println("Id : $id")
        println("Name : $name")
        println("College : $college")
    }
}