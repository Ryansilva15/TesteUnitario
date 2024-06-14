import org.junit.jupiter.api.*

class Maintest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xxoO")) }
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {
    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse método.")
    }
}
 