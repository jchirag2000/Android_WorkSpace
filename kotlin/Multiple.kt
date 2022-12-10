//Multiple inheritance is not supported.But we can use interface instead of a class
interface Print
{
    fun print()
    {
        println("In Print.")
    }
}
interface Show
{
    fun show()
    {
        println("In Show.")
    }
}
class Multiple:Print,Show
{

}
fun main()
{
    var m1=Multiple()
    m1.print()
    m1.show()
}