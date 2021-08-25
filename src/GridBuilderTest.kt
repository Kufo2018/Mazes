import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GridBuilderTest {

    @Test
    fun buildGridTest() {
        val arrayOfDimens = arrayOf<Pair<Int, Int>>(
            Pair(8, 90),
            Pair(1, 0),
            Pair(733, 0),
            Pair(0, 0),
            Pair(0, 1)
        )
        arrayOfDimens.forEach {
            val gridBuilder = GridBuilder.buildGrid(it.first, it.second)
            assertEquals(gridBuilder.size, (it.first * it.second) + it.second)
        }
    }
}