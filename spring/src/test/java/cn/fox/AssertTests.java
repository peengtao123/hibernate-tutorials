package cn.fox;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class AssertTests {

    @Test
    public void test1(){
        assertThat("albumen", both(containsString("a")).and(containsString("b")));
    }

    @Test
    public void test2(){
        assertThat("两值相等",both(containsString("相等")).and(containsString("相等")));
        assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
    }

    @Test
    public void test3(){
        assertThat(Arrays.asList(new String[]{"fun", "ban","net"}),everyItem(containsString("n")));
    }

    @Test
    public void test5(){
        assertThat("good", allOf(equalTo("good"), startsWith("g")));
    }


}
