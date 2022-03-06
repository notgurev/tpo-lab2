package lab2.logariphmic;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static org.mockito.Mockito.*;

public class LogMock {
    public static LnCalculator getLnMock() {
        var m = mock(LnCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.6470295833786549);
        when(m.calculate(eq(1 * PI / 4))).thenReturn(-0.2415644752704905);
        when(m.calculate(eq(1 * PI / 3))).thenReturn(0.046117597181290375);
        when(m.calculate(eq(2 * PI / 3))).thenReturn(0.7392647777412357);
        when(m.calculate(eq(3 * PI / 4))).thenReturn(0.8570478133976193);
        when(m.calculate(eq(5 * PI / 6))).thenReturn(0.9624083290554456);
        when(m.calculate(eq(7 * PI / 6))).thenReturn(1.2988805656766584);
        when(m.calculate(eq(5 * PI / 4))).thenReturn(1.3678734371636099);
        when(m.calculate(eq(4 * PI / 3))).thenReturn(1.432411958301181);
        when(m.calculate(eq(5 * PI / 3))).thenReturn(1.6555555096153909);
        when(m.calculate(eq(7 * PI / 4))).thenReturn(1.7043456737848228);
        when(m.calculate(eq(11 * PI / 6))).thenReturn(1.7508656894197157);
        when(m.calculate(eq(PI))).thenReturn(1.1447298858494002);
        when(m.calculate(eq(2 * PI))).thenReturn(1.8378770664093453);
        when(m.calculate(eq(1 * PI / 2))).thenReturn(0.4515827052894548);

        when(m.calculate(eq(2.0))).thenReturn(0.6931471805599453);
        when(m.calculate(eq(3.0))).thenReturn(1.0986122886681098);
        when(m.calculate(eq(5.0))).thenReturn(1.6094379124341003);
        when(m.calculate(eq(10.0))).thenReturn(2.3025850929940);

        when(m.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(m.calculate(eq(-PI))).thenReturn(NaN);
        when(m.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-7 * PI / 4))).thenReturn(NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog2Mock() {
        var m = mock(LogBaseCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.9334663712488376);
        when(m.calculate(eq(1 * PI / 4))).thenReturn(-0.3485038705276813);
        when(m.calculate(eq(1 * PI / 3))).thenReturn(0.06653362875116246);
        when(m.calculate(eq(2 * PI / 3))).thenReturn(1.0665336287511624);
        when(m.calculate(eq(3 * PI / 4))).thenReturn(1.236458630193475);
        when(m.calculate(eq(5 * PI / 6))).thenReturn(1.388461723638525);
        when(m.calculate(eq(7 * PI / 6))).thenReturn(1.8738885508087668);
        when(m.calculate(eq(5 * PI / 4))).thenReturn(1.9734242243596811);
        when(m.calculate(eq(4 * PI / 3))).thenReturn(2.0665336287511624);
        when(m.calculate(eq(5 * PI / 3))).thenReturn(2.388461723638525);
        when(m.calculate(eq(7 * PI / 4))).thenReturn(2.458851051529923);
        when(m.calculate(eq(11 * PI / 6))).thenReturn(2.5259652473884597);
        when(m.calculate(eq(PI))).thenReturn(1.651496129472319);
        when(m.calculate(eq(2 * PI))).thenReturn(2.6514961294723185);
        when(m.calculate(eq(1 * PI / 2))).thenReturn(0.6514961294723187);

        when(m.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(m.calculate(eq(-PI))).thenReturn(NaN);
        when(m.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-7 * PI / 4))).thenReturn(NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog3Mock() {
        var m = mock(LogBaseCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.5889517075792716);
        when(m.calculate(eq(1 * PI / 4))).thenReturn(-0.21988146115072904);
        when(m.calculate(eq(1 * PI / 3))).thenReturn(0.04197804599218576);
        when(m.calculate(eq(2 * PI / 3))).thenReturn(0.6729077995636431);
        when(m.calculate(eq(3 * PI / 4))).thenReturn(0.780118538849271);
        when(m.calculate(eq(5 * PI / 6))).thenReturn(0.8760218131386556);
        when(m.calculate(eq(7 * PI / 6))).thenReturn(1.1822920415821505);
        when(m.calculate(eq(5 * PI / 4))).thenReturn(1.245092059567198);
        when(m.calculate(eq(4 * PI / 3))).thenReturn(1.3038375531351005);
        when(m.calculate(eq(5 * PI / 3))).thenReturn(1.506951566710113);
        when(m.calculate(eq(7 * PI / 4))).thenReturn(1.551362288010693);
        when(m.calculate(eq(11 * PI / 6))).thenReturn(1.5937066310648664);
        when(m.calculate(eq(PI))).thenReturn(1.0419780459921857);
        when(m.calculate(eq(2 * PI))).thenReturn(1.672907799563643);
        when(m.calculate(eq(1 * PI / 2))).thenReturn(0.4110482924207284);

        when(m.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-7 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(m.calculate(eq(-PI))).thenReturn(NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog5Mock() {
        var m = mock(LogBaseCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.40202208384670945);
        when(m.calculate(eq(1 * PI / 4))).thenReturn(-0.15009244743411718);
        when(m.calculate(eq(1 * PI / 3))).thenReturn(0.028654474226683595);
        when(m.calculate(eq(2 * PI / 3))).thenReturn(0.45933103230007666);
        when(m.calculate(eq(3 * PI / 4))).thenReturn(0.5325137470518682);
        when(m.calculate(eq(5 * PI / 6))).thenReturn(0.5979779161532907);
        when(m.calculate(eq(7 * PI / 6))).thenReturn(0.8070398712754582);
        when(m.calculate(eq(5 * PI / 4))).thenReturn(0.8499075525658829);
        when(m.calculate(eq(4 * PI / 3))).thenReturn(0.8900075903734698);
        when(m.calculate(eq(5 * PI / 3))).thenReturn(1.0286544742266837);
        when(m.calculate(eq(7 * PI / 4))).thenReturn(1.0589695076880505);
        when(m.calculate(eq(11 * PI / 6))).thenReturn(1.0878740185582687);
        when(m.calculate(eq(PI))).thenReturn(0.711260668712669);
        when(m.calculate(eq(2 * PI))).thenReturn(1.141937226786062);
        when(m.calculate(eq(1 * PI / 2))).thenReturn(0.2805841106392759);

        when(m.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-7 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(m.calculate(eq(-PI))).thenReturn(NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog10Mock() {
        var m = mock(LogBaseCalculator.class);

        when(m.calculate(eq(1 * PI / 6))).thenReturn(-0.2810013776895098);
        when(m.calculate(eq(1 * PI / 4))).thenReturn(-0.10491011863382854);
        when(m.calculate(eq(1 * PI / 3))).thenReturn(0.020028617974471367);
        when(m.calculate(eq(2 * PI / 3))).thenReturn(0.3210586136384525);
        when(m.calculate(eq(3 * PI / 4))).thenReturn(0.3722111360858339);
        when(m.calculate(eq(5 * PI / 6))).thenReturn(0.417968626646509);
        when(m.calculate(eq(7 * PI / 6))).thenReturn(0.564096662324747);
        when(m.calculate(eq(5 * PI / 4))).thenReturn(0.5940598857021901);
        when(m.calculate(eq(4 * PI / 3))).thenReturn(0.6220886093024337);
        when(m.calculate(eq(5 * PI / 3))).thenReturn(0.7189986223104902);
        when(m.calculate(eq(7 * PI / 4))).thenReturn(0.7401879213804282);
        when(m.calculate(eq(11 * PI / 6))).thenReturn(0.7603913074687152);
        when(m.calculate(eq(PI))).thenReturn(0.4971498726941338);
        when(m.calculate(eq(2 * PI))).thenReturn(0.7981798683581149);
        when(m.calculate(eq(1 * PI / 2))).thenReturn(0.19611987703015263);

        when(m.calculate(eq(-1 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-3 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-5 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-7 * PI / 4))).thenReturn(NaN);
        when(m.calculate(eq(-1 * PI / 2))).thenReturn(NaN);
        when(m.calculate(eq(-PI))).thenReturn(NaN);

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
}
