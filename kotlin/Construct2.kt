class Construct2
{
    constructor(name:String)
    {
        println("Your name : $name")
    }
    constructor(name:String,city:String)
    {
        println("Your name : $name")
        println("Your city : $city")
    }
    constructor(name:String,city:String,rollno:Int)
    {
        println("Your name : $name")
        println("Your city : $city")
        println("Your rollno : $rollno")
    }
}
fun main()
{
    var c1=Construct2("Chirag")
    println()
    var c2=Construct2("Chirag","Surat",3)
    println()
    var c3=Construct2("Chirag","Rajkot")
    println()
}