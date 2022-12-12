import java.io.FileInputStream
import java.io.ObjectInputStream

fun main() {
    var d=DeserializeEx()
    d.mydata()
}
class DeserializeEx
{
    fun mydata()
    {
        var a=ObjectInputStream(FileInputStream("D:\\PracticeFiles/Chirag1.txt"))
        var s:Chirag= a.readObject() as Chirag
        println("${s.id} and ${s.name}")
    }
}