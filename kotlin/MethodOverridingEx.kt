fun main()
{
    var a=Bank()
    a=SBI()
    println(a.interest())
    a=HDFC()
    println(a.interest())
    a=ICICI()
    println(a.interest())
}
open class Bank
{
    open fun interest():Int
    {
        return 0
    }
}
class SBI:Bank()
{
    override fun interest():Int
    {
        return 5
    }
}
class HDFC:Bank()
{
    override fun interest():Int
    {
        return 6
    }
}
class ICICI:Bank()
{
    override fun interest():Int
    {
        return 7

    }
}