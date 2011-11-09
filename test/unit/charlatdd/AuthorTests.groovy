package charlatdd

import static org.hamcrest.CoreMatchers.any
import org.junit.Test
import org.junit.Before
import org.gmock.GMockController

class AuthorTests  {
    def author

    @Before
    void setUp() {
        author = new Author(name: 'Chuchu Blabla', birthYear: 1980)
    }
    @Test
    void "sabe transformarse en un mapa"() {
        def authorAsMap = author.asMap()
        assert authorAsMap.containsKey('name')
        assert authorAsMap.name == 'Chuchu Blabla'

        assert authorAsMap.containsKey('birthYear')
        assert authorAsMap.birthYear == 1980
    }

    @Test
    void "usa RomanNumerals para obtener el siglo en números romanos"() {
        def gmc = new GMockController()
        def romanNumeralsMock = gmc.mock(RomanNumerals)
        romanNumeralsMock.static.toRoman(any(Integer)).returns('')
        gmc.play {
            author.asMap()
        }
    }

    @Test
    void "añade al mapa el siglo en números romanos"() {
        def authorAsMap = author.asMap()
        assert authorAsMap.containsKey('century')
    }

    @Test
    void "genera un slug al estabelcer el nombre"() {
        assert author.slug == 'chuchu-blabla'
    }

    @Test
    void "añade al mapa su slug"() {
        def authorAsMap = author.asMap()
        assert authorAsMap.containsKey('slug')
        assert authorAsMap.slug == 'chuchu-blabla'
    }
}
