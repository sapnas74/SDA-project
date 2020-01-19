package assertj;

import org.junit.Test;
import org.assertj.core.api.Assertions;

public class Example1 {

    @Test
    public void testAssertJMachers() {
        String text = "abc";

        Assertions.assertThat (text).isEqualTo("abc");

        String[] stringArray = {"abc", "cde", "efg"};
        Assertions.assertThat(stringArray)
                .hasSize(3)
                .contains("cde")
                .doesNotContain("xyz");
    }
}
