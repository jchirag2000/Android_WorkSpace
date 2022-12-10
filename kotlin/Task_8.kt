//Task-8 : WAP to check the number positive or negative.
fun main()
{
    println("Enter number to check it's positive or negative : ")
    val a=readln().toFloat()
    if(a>0)
        println("Given number is positive.")
    else if(a<0)
        println("Given number is negative.")
    else
        println("You entered zero.")
}