package calculator.utils;

import internal.DivHelper;
import internal.MultHelper;
import internal.SubHelper;
import internal.SumHelper;

public class Calculator {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculator() {

        divHelper = new DivHelper();
        subHelper = new SubHelper();
        multHelper = new MultHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b){

        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b){

        return subHelper.execute(a, b);
    }

    public int div(int a, int b){

        return divHelper.execute(a, b);
    }

    public int mult (int a, int b){

        return multHelper.execute(a, b);
    }


}
