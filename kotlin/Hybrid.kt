open class A3
{
    fun a3()
    {
        println("In A3.")
    }
}
open class B3:A3()
{
    fun b3()
    {
        println("In B3.")
    }
}
interface C3
{
    fun c3()
    {
        println("In C3.")
    }
}
open class D3:B3()
{
    fun d3()
    {
        println("In D3")
    }
}
class Hybrid:D3(),C3
{

}
fun main()
{
    var h1=Hybrid()
    h1.a3()
    h1.b3()
    h1.c3()
    h1.d3()
}