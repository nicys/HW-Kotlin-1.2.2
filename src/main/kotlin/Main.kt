fun main(args: Array<String>) {

    /* см. README.md с пояснениями.
    Слово "люди" употребляться не могут в данном контексте.
     */

    val likes = 1

    val stringLikes = writeStringLikes(likes)

    println("Понравилось $likes $stringLikes")
}

fun writeStringLikes(likes: Int): String {
    return if(likes == 11) "человекам"
    else if(likes == 1 || likes % 10 == 1) "человеку"
    else "человекам"
}