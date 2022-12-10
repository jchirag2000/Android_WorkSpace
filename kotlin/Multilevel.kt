open class A1
{
    fun a1()
    {
        println("In A.")
    }
}
open class B1:A()
{
    fun b1()
    {
        println("In B.")
    }
}
class C1:B1()
{
    fun c1()
    {
        println("In C.")
    }
}
fun main()
{
    val c1=C1()
    c1.a1()
    c1.b1()
    val b1=B1()
    b1.a1()
}