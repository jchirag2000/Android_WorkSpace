//Task-6 : WAP to find the simple interest.
fun main()
{
    println("Enter principal amount borrowed : ")
    val p=readln().toFloat()
    println("Enter interest rate in % : ")
    val r=readln().toFloat()
    println("Enter time you borrowed(In years) : ")
    val t=readln().toFloat()
    val si=(p*r*t)/100
    println("Simple Interest : $si")
}