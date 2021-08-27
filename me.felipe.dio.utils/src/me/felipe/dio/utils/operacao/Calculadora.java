package me.felipe.dio.utils.operacao;

import me.felipe.dio.utils.operacao.internal.DivHelper;
import me.felipe.dio.utils.operacao.internal.MultHelper;
import me.felipe.dio.utils.operacao.internal.SubHelper;
import me.felipe.dio.utils.operacao.internal.SumHelper;

public class Calculadora {

    private final SumHelper sumHelper;
    private final SubHelper subHelper;
    private final DivHelper divHelper;
    private final MultHelper multHelper;

    public Calculadora(){
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        divHelper = new DivHelper();
        multHelper = new MultHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }

    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
}
