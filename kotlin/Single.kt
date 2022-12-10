open class A
{
    fun a1()
    {
        println("In A.")
    }
}
class B:A()
{
    fun b1()
    {
        println("In B.")
    }
}
fun main()
{
    var b=B()
    b.b1()
    b.a1()
}