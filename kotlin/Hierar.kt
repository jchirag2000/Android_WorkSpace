open class Hierar
{
    fun display()
    {
        println("In Hierar")
    }
}
class A2:Hierar()
{}
class B2:Hierar()
{}
class C2:Hierar()
{}
fun main()
{
    var a2=A2()
    a2.display()
    var b2=B2()
    b2.display()
    var c2=C2()
    c2.display()
}