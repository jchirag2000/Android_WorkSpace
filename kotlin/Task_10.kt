//Task-10 : WAP to check number if it's a prime or not.
fun main()
{
    println("Enter any number to check if it's prime or not : ")
    val num=readln().toInt()
    var flag=0
    for(i in 2..num/2)
    {
        if(num%i==0)
            flag=1
        break
    }
    if(flag==0)
        println("Entered number is a prime number.")
    else
        println("Entered number is not a prime number.")
}