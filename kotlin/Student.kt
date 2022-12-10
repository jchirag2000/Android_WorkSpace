class Student
{
    var name=""
    var city=""
    var rollno=""
    fun display()
    {
        println("Your name is $name.")
        println("Your city is $city.")
        println("Your rollno is $rollno.")
    }
}
fun main()
{
    val s1=Student()
    s1.name="Chirag"
    s1.city="Rajkot"
    s1.rollno="1"
    s1.display()
    println()
    val s2=Student()
    s2.name="Ajay"
    s2.city="Rajkot"
    s2.rollno="2"
    s2.display()
    println()
}