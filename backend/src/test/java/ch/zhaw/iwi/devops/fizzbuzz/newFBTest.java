package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class newFBTest {

    @Test

    public void gradeEvaluationVeryBad(){
        newFB ac = new newFB();
        Assert.assertEquals("Very bad", ac.gradeEvaluation(10));
    }

    @Test
    
    public void gradeEvaluationBad(){
        newFB ac = new newFB();
        Assert.assertEquals("Bad", ac.gradeEvaluation(21));
    }
    @Test
    
    public void gradeEvaluationMedium(){
        newFB ac = new newFB();
        Assert.assertEquals("Medium", ac.gradeEvaluation(45));
    }

    @Test
    
    public void gradeEvaluationGood(){
        newFB ac = new newFB();
        Assert.assertEquals("Good", ac.gradeEvaluation(60));
    }

    @Test
    
    public void gradeEvaluationVeryGood(){
        newFB ac = new newFB();
        Assert.assertEquals("Very good", ac.gradeEvaluation(80));
    }

    @Test
    
    public void gradeEvaluationExcellent(){
        newFB ac = new newFB();
        Assert.assertEquals("Excellent", ac.gradeEvaluation(100));
    }

}
