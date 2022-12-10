fun main()
{
    val c1=Counter(101,"Chirag")
    val c2=Counter(102,"Raju")
}
class Counter
{
    companion object
    {
        var count=1
    }
    constructor(id:Int,name:String)
    {
        count++
        println(count)
    }
}