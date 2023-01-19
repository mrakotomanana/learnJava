package org.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
//        assertTrue( true );
        App user = Mockito.mock(App.class);
        Mockito.when(user.getLogin()).thenReturn("bob");
        System.out.println(user.getLogin()); // affiche bob
        user.setLogin("bobs");
        System.out.println(user.getLogin()); // affiche bob !
    }
}
