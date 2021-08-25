internal fun Array<String>.asString(): String {
    if (this.isEmpty()) return "Array is empty"
    var string = ""
    this.forEach {
        if (it != "+" || it != "[" || it != "]")
            string += it
    }
    return string
}
