object GridBuilder {

    fun buildGrid(width: Int = 0, height: Int = 0): Array<String> {
        var grid = arrayOf<String>()
        (0 until height).forEach { _ ->
            (0 until width).forEach { _ ->
                grid += " + "
            }
            grid += "\n"
        }
        return grid
    }

}