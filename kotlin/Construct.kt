class Construct(var name:String,var city:String,var rollno:Int)
{
    fun display()
    {
        println("Your name : $name")
        println("Your city : $city")
        println("Your rollno : $rollno")
        println()
    }
}
fun main()
{
    var c1=Construct("Chirag","Rajkot",1)
    c1.display()
    var c2=Construct("Raju","Mumbai",2)
    c2.display()
}