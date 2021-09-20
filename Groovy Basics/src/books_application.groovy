def controller = new BooksController()
String isbn1 = controller.create("Title1")
String isbn2 = controller.create("Title2")
String isbn3 = controller.create("Title1")


def b1 = controller.findBookByIsbn(isbn1)

println(b1.dump())
println(controller.findBooksByTitle("Title1"))
println(controller.findBooksByPagesRange(100..300))
println(controller.findBooksByPagesRange(10..30))


