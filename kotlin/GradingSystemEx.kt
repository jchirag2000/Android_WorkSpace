fun main()
{
    println("Enter your marks(out of 100)")
    val marks=readln().toInt()
    if(marks>100)
    {
        print("Please enter a number Less than 100")
    }
    else if(marks>=80)
    {
        print("You Passed with grade A.")
    }
    else if(marks>=60)
    {
        print("You passed with grade B.")
    }
    else if(marks>=40)
    {
        print("You passed with grade C.")
    }
    else if(marks>=33)
    {
        print("You passed with grade D.")
    }
    else
    {
        print("You failed.")
    }
}