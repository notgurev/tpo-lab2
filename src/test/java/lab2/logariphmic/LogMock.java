package lab2.logariphmic;

import lab2.MockChain;

import static java.lang.Double.*;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.PI;
import static org.mockito.Mockito.*;

public class LogMock {
    public static LnCalculator getLnMock() {
        LnCalculator ln = mock(LnCalculator.class);

        when(ln.calculate(eq(1 * PI / 6))).thenReturn(-0.6470295833786549);
        when(ln.calculate(eq(1 * PI / 4))).thenReturn(-0.2415644752704905);
        when(ln.calculate(eq(1 * PI / 3))).thenReturn(0.046117597181290375);
        when(ln.calculate(eq(2 * PI / 3))).thenReturn(0.7392647777412357);
        when(ln.calculate(eq(3 * PI / 4))).thenReturn(0.8570478133976193);
        when(ln.calculate(eq(5 * PI / 6))).thenReturn(0.9624083290554456);
        when(ln.calculate(eq(7 * PI / 6))).thenReturn(1.2988805656766584);
        when(ln.calculate(eq(5 * PI / 4))).thenReturn(1.3678734371636099);
        when(ln.calculate(eq(4 * PI / 3))).thenReturn(1.432411958301181);
        when(ln.calculate(eq(5 * PI / 3))).thenReturn(1.6555555096153909);
        when(ln.calculate(eq(7 * PI / 4))).thenReturn(1.7043456737848228);
        when(ln.calculate(eq(11 * PI / 6))).thenReturn(1.7508656894197157);
        when(ln.calculate(eq(PI))).thenReturn(1.1447298858494002);
        when(ln.calculate(eq(2 * PI))).thenReturn(1.8378770664093453);
        when(ln.calculate(eq(1 * PI / 2))).thenReturn(0.4515827052894548);

        when(ln.calculate(eq(2.0))).thenReturn(0.6931471805599453);
        when(ln.calculate(eq(3.0))).thenReturn(1.0986122886681098);
        when(ln.calculate(eq(5.0))).thenReturn(1.6094379124341003);
        when(ln.calculate(eq(10.0))).thenReturn(2.3025850929940);

        when(ln.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(ln.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(ln.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(ln.calculate(eq(-PI))).thenReturn(NaN);
        when(ln.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(ln.calculate(eq(-7 * PI / 4))).thenReturn(NaN);

        when(ln.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(ln.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(ln.calculate(NaN)).thenReturn(NaN);

        return ln;
    }

    public static LogBaseCalculator getLog2Mock() {
        LogBaseCalculator log2 = mock(LogBaseCalculator.class);

        when(log2.calculate(eq(1 * PI / 6))).thenReturn(-0.9334663712488376);
        when(log2.calculate(eq(1 * PI / 4))).thenReturn(-0.3485038705276813);
        when(log2.calculate(eq(1 * PI / 3))).thenReturn(0.06653362875116246);
        when(log2.calculate(eq(2 * PI / 3))).thenReturn(1.0665336287511624);
        when(log2.calculate(eq(3 * PI / 4))).thenReturn(1.236458630193475);
        when(log2.calculate(eq(5 * PI / 6))).thenReturn(1.388461723638525);
        when(log2.calculate(eq(7 * PI / 6))).thenReturn(1.8738885508087668);
        when(log2.calculate(eq(5 * PI / 4))).thenReturn(1.9734242243596811);
        when(log2.calculate(eq(4 * PI / 3))).thenReturn(2.0665336287511624);
        when(log2.calculate(eq(5 * PI / 3))).thenReturn(2.388461723638525);
        when(log2.calculate(eq(7 * PI / 4))).thenReturn(2.458851051529923);
        when(log2.calculate(eq(11 * PI / 6))).thenReturn(2.5259652473884597);
        when(log2.calculate(eq(PI))).thenReturn(1.651496129472319);
        when(log2.calculate(eq(2 * PI))).thenReturn(2.6514961294723185);
        when(log2.calculate(eq(1 * PI / 2))).thenReturn(0.6514961294723187);

        when(log2.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(log2.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(log2.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(log2.calculate(eq(-PI))).thenReturn(NaN);
        when(log2.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(log2.calculate(eq(-7 * PI / 4))).thenReturn(NaN);

        when(log2.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(log2.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(log2.calculate(NaN)).thenReturn(NaN);

        return log2;
    }

    public static LogBaseCalculator getLog3Mock() {
        LogBaseCalculator log3 = mock(LogBaseCalculator.class);

        when(log3.calculate(eq(1 * PI / 6))).thenReturn(-0.5889517075792716);
        when(log3.calculate(eq(1 * PI / 4))).thenReturn(-0.21988146115072904);
        when(log3.calculate(eq(1 * PI / 3))).thenReturn(0.04197804599218576);
        when(log3.calculate(eq(2 * PI / 3))).thenReturn(0.6729077995636431);
        when(log3.calculate(eq(3 * PI / 4))).thenReturn(0.780118538849271);
        when(log3.calculate(eq(5 * PI / 6))).thenReturn(0.8760218131386556);
        when(log3.calculate(eq(7 * PI / 6))).thenReturn(1.1822920415821505);
        when(log3.calculate(eq(5 * PI / 4))).thenReturn(1.245092059567198);
        when(log3.calculate(eq(4 * PI / 3))).thenReturn(1.3038375531351005);
        when(log3.calculate(eq(5 * PI / 3))).thenReturn(1.506951566710113);
        when(log3.calculate(eq(7 * PI / 4))).thenReturn(1.551362288010693);
        when(log3.calculate(eq(11 * PI / 6))).thenReturn(1.5937066310648664);
        when(log3.calculate(eq(PI))).thenReturn(1.0419780459921857);
        when(log3.calculate(eq(2 * PI))).thenReturn(1.672907799563643);
        when(log3.calculate(eq(1 * PI / 2))).thenReturn(0.4110482924207284);

        when(log3.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(log3.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(log3.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(log3.calculate(eq(-7 * PI / 4))).thenReturn(NaN);
        when(log3.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(log3.calculate(eq(-PI))).thenReturn(NaN);

        when(log3.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(log3.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(log3.calculate(NaN)).thenReturn(NaN);

        return log3;
    }

    public static LogBaseCalculator getLog5Mock() {
        LogBaseCalculator log5 = mock(LogBaseCalculator.class);

        when(log5.calculate(eq(1 * PI / 6))).thenReturn(-0.40202208384670945);
        when(log5.calculate(eq(1 * PI / 4))).thenReturn(-0.15009244743411718);
        when(log5.calculate(eq(1 * PI / 3))).thenReturn(0.028654474226683595);
        when(log5.calculate(eq(2 * PI / 3))).thenReturn(0.45933103230007666);
        when(log5.calculate(eq(3 * PI / 4))).thenReturn(0.5325137470518682);
        when(log5.calculate(eq(5 * PI / 6))).thenReturn(0.5979779161532907);
        when(log5.calculate(eq(7 * PI / 6))).thenReturn(0.8070398712754582);
        when(log5.calculate(eq(5 * PI / 4))).thenReturn(0.8499075525658829);
        when(log5.calculate(eq(4 * PI / 3))).thenReturn(0.8900075903734698);
        when(log5.calculate(eq(5 * PI / 3))).thenReturn(1.0286544742266837);
        when(log5.calculate(eq(7 * PI / 4))).thenReturn(1.0589695076880505);
        when(log5.calculate(eq(11 * PI / 6))).thenReturn(1.0878740185582687);
        when(log5.calculate(eq(PI))).thenReturn(0.711260668712669);
        when(log5.calculate(eq(2 * PI))).thenReturn(1.141937226786062);
        when(log5.calculate(eq(1 * PI / 2))).thenReturn(0.2805841106392759);

        when(log5.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(log5.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(log5.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(log5.calculate(eq(-7 * PI / 4))).thenReturn(NaN);
        when(log5.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(log5.calculate(eq(-PI))).thenReturn(NaN);

        when(log5.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(log5.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(log5.calculate(NaN)).thenReturn(NaN);

        return log5;
    }

    public static LogBaseCalculator getLog10Mock() {
        LogBaseCalculator log10 = mock(LogBaseCalculator.class);

        when(log10.calculate(eq(1 * PI / 6))).thenReturn(-0.2810013776895098);
        when(log10.calculate(eq(1 * PI / 4))).thenReturn(-0.10491011863382854);
        when(log10.calculate(eq(1 * PI / 3))).thenReturn(0.020028617974471367);
        when(log10.calculate(eq(2 * PI / 3))).thenReturn(0.3210586136384525);
        when(log10.calculate(eq(3 * PI / 4))).thenReturn(0.3722111360858339);
        when(log10.calculate(eq(5 * PI / 6))).thenReturn(0.417968626646509);
        when(log10.calculate(eq(7 * PI / 6))).thenReturn(0.564096662324747);
        when(log10.calculate(eq(5 * PI / 4))).thenReturn(0.5940598857021901);
        when(log10.calculate(eq(4 * PI / 3))).thenReturn(0.6220886093024337);
        when(log10.calculate(eq(5 * PI / 3))).thenReturn(0.7189986223104902);
        when(log10.calculate(eq(7 * PI / 4))).thenReturn(0.7401879213804282);
        when(log10.calculate(eq(11 * PI / 6))).thenReturn(0.7603913074687152);
        when(log10.calculate(eq(PI))).thenReturn(0.4971498726941338);
        when(log10.calculate(eq(2 * PI))).thenReturn(0.7981798683581149);
        when(log10.calculate(eq(1 * PI / 2))).thenReturn(0.19611987703015263);

        when(log10.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(log10.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(log10.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(log10.calculate(eq(-7 * PI / 4))).thenReturn(NaN);
        when(log10.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(log10.calculate(eq(-PI))).thenReturn(NaN);

        when(log10.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(log10.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(log10.calculate(NaN)).thenReturn(NaN);

        return log10;
    }
}
