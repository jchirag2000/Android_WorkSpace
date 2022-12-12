fun main() {
    val t1=T1()
    val t2=T2()
    t1.start()
    t2.start()
}
class T1 :Thread()
{
    override fun run()
    {
        for(i in 1..10)
            println("Thread t1 : $i")
    }
}
class T2 :Thread()
{
    override fun run()
    {
        for(i in 1..10)
            println("Thread t2 : $i")
    }
}