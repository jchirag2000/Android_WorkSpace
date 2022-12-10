//Task-9 : WAP to check if it's a leap year or not.
fun main()
{
    println("Enter any year : ")
    val y=readln().toInt()
    if(y%4==0)
    {
        if (y % 100 == 0)
            if(y%400==0)
                println("Entered year is a leap year.")
            else
            println("Entered year is not a Leap year.")
        else
            println("Entered year is a Leap year.")
    }
    else
        println("Entered year is not a leap year.")
}
