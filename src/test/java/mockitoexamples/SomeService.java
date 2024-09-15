package mockitoexamples;

public class SomeService {
    private SomeObject someObject;

    public SomeService(SomeObject someObject) {
        this.someObject = someObject;
    }

    public void doThisUsingSomeObject(){
        System.out.println("this method should not mutate someObject");
        someObject.setField("new value of SomeObject.field");
        someObject.doSomething();
//        someObject.getField();
    }
}
