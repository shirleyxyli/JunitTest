import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by xiaoyan.li on 2016-8-24.
 */
public class FirstCase {
    public int a;
    public int b;
    public int c;

    @Given("^�����һ������20$")
    public void �����һ������20(){
        a=20;
    }

    @And("^����ڶ�������40$")
    public void ����ڶ�������40(){
        b=40;
    }

    @When("^�������������$")
    public void �������������(){
        Add t = new Add();
        c=t.addtest(a,b);
    }

    @Then("^�ó��Ľ��(\\d+)$")
    public void �ó��Ľ��(int ExpectedResult){
        assertEquals(ExpectedResult,c);
        System.out.println("�ó����Ϊ:"+c);
    }
}
