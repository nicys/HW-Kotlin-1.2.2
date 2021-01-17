fun main(args: Array<String>) {

    /* см. README.md с пояснениями.
    Слово "люди" употребляться не могут в данном контексте.
     */

    val likes = 331

    val stringLikes = writeStringLikes(likes)

    println("Понравилось $likes $stringLikes")
}

fun writeStringLikes(likes: Int): String {
    return if(likes % 100 == 11) "человекам"
    else if(likes % 10 == 1) "человеку"
    else "человекам"
}