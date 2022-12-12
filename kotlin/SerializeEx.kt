import java.io.FileOutputStream
import java.io.ObjectOutputStream

fun main() {
    var s1=SerializeEx()
    s1.mydata()
}
class SerializeEx
{
    fun mydata()
    {
        var file=FileOutputStream("D:\\PracticeFiles/Chirag1.txt")
        var c1=Chirag(101,"ChiragJadav")
        var obj:ObjectOutputStream=ObjectOutputStream(file)
        obj.writeObject(c1)
    }
}