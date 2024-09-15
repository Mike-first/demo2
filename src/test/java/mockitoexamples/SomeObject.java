package mockitoexamples;

public class SomeObject {
    private String field;

    public void doSomething(){
        System.out.println("SomeObject.doSomething()");
    }

    public String getField(){
        return field;
    }

    public void  setField(String field){
        this.field=field;
    }

}
