import spock.lang.*

class SpecificationClass extends Specification {

    //instance field
    @Shared obj=new SumOfTwoNumber()  // by using @Shared annotation then feature method contain same copy of obj instance
    def obj1=new SumOfTwoNumber()

    //feature method
    def "featureMethod1"()
    {
        given:
        obj
        obj1
    }

    def "featureMethod2"()
    {
        given:
        obj
        obj1
    }
}
