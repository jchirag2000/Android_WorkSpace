//Task-5 : WAP to find area of triangle.
fun main()
{
    println("Enter base length of triangle : ")
    val b=readln().toFloat()
    println("Enter height from base of triangle : ")
    val h=readln().toFloat()
    val a=0.5*b*h
    println("Area of given triangle : $a")
}