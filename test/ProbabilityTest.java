import com.company.Probability;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProbabilityTest {
    @Test
    public void test_create_should_give_give_new_probability_object_when_value_is_1_by_2(){
        Probability prob = Probability.create(0.5);
        Double actual = prob.getValue();
        assertEquals(0.5, actual, 0.0);
    }
    @Test
    public void test_create_probability_should_give_null_when_value_is_graterThanOne(){
     Probability prob = Probability.create(1.9);
        assertNull(prob);
    }
    @Test
    public void negate_should_give_the_new_object_with_probaility_of_not_occuring_event(){
        Probability prob = Probability.create(0.25);
        Probability result = prob.negate();
        assertEquals(result.getValue(),0.75,0.0);
    }
    @Test
    public void test_or_give_the_probability_of_having_at_least_one(){
        Probability prob = Probability.create(0.5);
        Probability result = Probability.create(0.5);
        assertEquals(prob.or(result).getValue(),0.75,0.0);
    }

    @Test
    public void test_add_probability_add_the_two_probability(){
        Probability prob1 = Probability.calculate(1, 2);
        Probability prob2 = Probability.calculate(2, 4);
        Probability resultProb =prob1.and(prob2);
        assertEquals(0.25,resultProb.getValue(),0.1);
    }


}
