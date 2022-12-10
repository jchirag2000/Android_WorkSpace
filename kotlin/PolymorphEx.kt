fun main(add:PolymorphEx)
{
    val a1=PolymorphEx()
    val a2=PolymorphEx()
    a1.add(1,2,3)
    a2.add(1,2,3)
}
class PolymorphEx
{
    fun add(a:Int,b:Int,c:Int):Int
    {
        return a+b
    }
    fun add(a:Int,b:Int,c:Int):Int
    {
        return a*b*c
    }
}