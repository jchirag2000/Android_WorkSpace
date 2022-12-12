import java.io.FileOutputStream

fun main() {
    var file=FileOutputStream("D:\\PracticeFiles/Chirag.txt")
    println("$file is created.")
    var s:String="Hello!"
    file.write(s.toByteArray())
    println("$s is inserted in $file.")
}