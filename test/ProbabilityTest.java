import com.company.Probability;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by vishnum on 3/11/2015.
 */
public class ProbabilityTest {
//    @Test
//    public void test_is_valid_probability_should_give_true_when_value_is_1by2(){
//        Probability prob = new Probability(0,1);
//        boolean actual = prob.isValidProbability(0.5);
//        assertTrue(actual);
//    }
//    @Test
//    public void test_is_valid_probability_should_give_false_when_value_is_5(){
//        Probability prob = new Probability(0,1);
//        boolean actual = prob.isValidProbability(5);
//        assertFalse(actual);
//    }
//    @Test
//    public void test_is_valid_probability_should_give_false_when_value_is_minus_1(){
//        Probability prob = new Probability(0,1);
//        boolean actual = prob.isValidProbability(-1);
//        assertFalse(actual);
//    }
//    @Test
//    public void test_calc_probability_calculate_the_probability(){
//        Probability prob = new Probability(0,1);
//        Double probability =prob.calculateProbability(4.0, 5.0);
//        assertEquals(probability,0.8,0.0);
//    }

    @Test
    public void test_add_probability_add_the_two_probability(){
        Probability prob = Probability.create(0,1);
        Double probability =prob.add(4.0, 5.0);
        assertEquals(probability,0.8,0.0);
    }


}
