package Opensource;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class Test2 {
    @Test
    public void testmethod(){
        System.out.println(new Source().add(100,200));
    }
    @Test
    public void testmethod1(){
        Source source = new Source();
        //메서드의 수행 결과를 잧아오기
        int result = source.add(200, 300);
        //기대값과 비교
        Assert.assertEquals(result, 500);
    }
}
