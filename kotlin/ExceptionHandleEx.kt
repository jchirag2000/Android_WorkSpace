fun main() {
    try {
        var a=2/0
        println(a)
    }
    catch (e:Exception)
    {
        println(e)
    }
    finally {
        println("Exception handled.")
    }
}