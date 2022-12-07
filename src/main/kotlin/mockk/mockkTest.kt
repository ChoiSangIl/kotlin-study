package mockk

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class Test{

    @Test
    fun `hello를 리턴한다`(){
        val sut: Hello = mockk()
        every { sut.say() } returns "hello"
        assertEquals("hello", sut.say())
    }
}

open class Hello{
    fun say(): String{
        return "haha"
    }
}