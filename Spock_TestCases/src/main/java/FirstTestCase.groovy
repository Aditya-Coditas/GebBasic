
import spock.lang.Specification

class FirstTestCase extends Specification {

    def "firstTest"()
    {
        expect:
        Math.max(2,3) == 3
    }

    def "we are going to add two number"()
    {
        given:
        def obj=new SumOfTwoNumber()

        when:"calling add method"
        def sum=obj.add(2,8)

        then:
        sum == 10
    }

    def "feature method for block example"()
    {
        given:  // This block is use for initalization purpose
        def a=10
        def b=5
        def obj=new SumOfTwoNumber()

        when:
        def list=[]
        list.add(5)
        list.add(10)
        println list.get(10)

        then:
        def sum=obj.add(5,10)
        sum==15
        thrown(Exception)
        println "index out of bound"

        expect:
        Math.sqrt(49)==7

        cleanup:
        println "In clean up"



    }
}
