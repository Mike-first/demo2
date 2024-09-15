package mockitoexamples;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class SomeServiceTest {
    @Mock
    SomeObject mockObj;

    //for green test run change SomeService.doThisUsingSomeObject()

    @Test
    public void someObjectShouldNotMutate() {
        SomeObject mockObj = mock(SomeObject.class);

        SomeService someService = new SomeService(mockObj);
        someService.doThisUsingSomeObject();

        //all SomeObject mutators
        verify(mockObj, never()).setField(any());
    }


    @Test
    public void someServiceShouldGetSomeObjectField() {
        SomeService someService = new SomeService(mockObj);
        someService.doThisUsingSomeObject();

        //all SomeObject mutators
        verify(mockObj, times(1)).getField();
    }
}

/*
when(mock.method("arg")).thenReturn("result"); //return value check

doThrow(new IllegalStateException("Expected exception"))
        .when(mock).someMethod(); //expected exception check

verify(mock).method("arg"); // method call check
verify(mock, <specify quantity>).method(any());
<specify quantity>:
times(2)
never()
atLeastOnce()
atLeast(2)
atMost(2)
any() - if the argument is not important

var mock = mock(MyInterface.class);
doAnswer($ -> arg1).when(mock).templateMethod(any(), any());

@Mock //automatic mock generation, not for local variables
SomeObject mockObj;
instead of
SomeService someService = new SomeService(mockObj);
 */
