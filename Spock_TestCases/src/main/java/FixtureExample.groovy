import spock.lang.Specification

class FixtureExample extends Specification {

    def setupSpec()
    {
        println "Initalization"
    }

    def setup()
    {
        println "Before feature method"
    }

    def "first feature method"()
    {
        given:
        println "1st feature method"
    }

    def "secound feature method"()
    {
        given:
        println "2nd feature method"
    }

    def cleanup()
    {
        println "after feature method \n"
    }

    def cleanupSpec()
    {
        println "clean up memory"
    }
}
