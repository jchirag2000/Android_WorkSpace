fun main()
{
    println("Enter value of a")
    val a = readln().toInt()
    println("Enter value of b")
    val b = readln().toInt()
    if(a!=b)
    {
        if(a>b)
        {
            print("a is greater.")
        }
        else
        {
            print("b is greater.")
        }
    }
    else
    {
        print("a & b are equal.")
    }
}