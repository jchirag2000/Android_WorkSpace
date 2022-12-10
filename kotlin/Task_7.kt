//Task-7 : WAP to calculate sum of 5 subjects and calculate percentage.
fun main()
{

    println("Enter marks of Subject1(Out of 100) : ")
    val sub1=readln().toFloat()
    println("Enter marks of Subject2(Out of 100) : ")
    val sub2=readln().toFloat()
    println("Enter marks of Subject3(Out of 100) : ")
    val sub3=readln().toFloat()
    println("Enter marks of Subject4(Out of 100) : ")
    val sub4=readln().toFloat()
    println("Enter marks of Subject5(Out of 100) : ")
    val sub5=readln().toFloat()
    val sum=sub1+sub2+sub3+sub4+sub5
    val p=(sum*100)/500
    println("You got $sum marks out of total 500 marks.")
    println("You're percentage : $p")
}