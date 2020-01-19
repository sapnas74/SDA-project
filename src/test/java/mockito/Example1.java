package mockito;


import junit.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Example1 {

    @Mock
    Calculator calculator = new Calculator();

    @Test
    public void verifyThatDivisionWadCalled() {
        //given
        when(calculator.add(eq (1), eq (2)))
                .thenReturn(2);

        //when
        calculator.add(2, 5);

        //then
        verify(calculator)
                .add(anyInt(), anyInt());
    }
}
