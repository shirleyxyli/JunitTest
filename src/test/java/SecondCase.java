import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by shirley.li on 2016-8-24.
 */
public class SecondCase {

    public int num1;
    public int result;

    @Given("^输入基数(\\d+)$")
    public void InputBase(int BasNum){
        num1=BasNum;
    }

    @When("^进行循环相加$")
    public void RuAdd(){
        Add t = new Add();
        result = t.addmore(num1);
    }

    @Then("^得出结果是(\\d+)$")
    public void GetResult(int ExpResult){
        assertEquals(ExpResult,result);
        System.out.println("Result is:" + result);
    }
}
