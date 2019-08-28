import spock.lang.Ignore
import spock.lang.IgnoreRest
import spock.lang.Specification
import spock.lang.Timeout

class AnnotationExample extends Specification{

    @Ignore
    def "feature 1"()
    {
        given:
        println "1st feature method"
    }

    //@IgnoreRest
    def "feature 2"()
    {
        given:
        println "2nd feature method"
    }

    @Timeout(3)
    def "feature 3"()
    {
        given:
        println "3rd feature method"
    }

    def "feature 4"()
    {
        given:
        println "4th feature  method"
    }
}

