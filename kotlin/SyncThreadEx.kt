fun main() {
    var sender=Sender()
    var t1=ThreadSend(sender,"Hello")
    t1.start()
    var t2=ThreadSend(sender,"Bye")
    t2.start()
}
class Sender
{
    fun send(msg:String)
    {
        println("Sending $msg")
        Thread.sleep(2000)
        println("$msg sent.")
    }
}
class ThreadSend(var sender: Sender,var msg:String) : Thread()
{
    override fun run()
    {
        synchronized(sender)
        {
            sender.send(msg)
        }
    }
}