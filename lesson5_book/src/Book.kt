import java.util.*

class Book(val title: String, val author: String, val year: Int, var pages: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}


fun main(args: Array<String>) {

    val book = Book("Romeo and Juliet", "William Shakespeare", 1597, 300)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)

    val puppy = Puppy()
    val newBook = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    while (newBook.pages > 0) {
        puppy.playWithBook(newBook)
        println("${newBook.pages} left in ${newBook.title}")
    }
    println("Sad puppy, no more pages in ${newBook.title}. ")

}
class Puppy() {
    fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

    fun playWithBook(book: Book) {
       book.tornPages(Random().nextInt(12))
    }
}