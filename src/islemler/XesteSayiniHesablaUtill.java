package islemler;

import sehiyyenazirliyi.EnumXestelik;
import sehiyyenazirliyi.Xeste;
import sehiyyenazirliyi.Xestexana;

import java.util.List;

public class XesteSayiniHesablaUtill {

    public static int hastaSayiniHesabla(Xestexana xestexana, EnumXestelik enumXestelik) {
        List<Xeste> xesteList = xestexana.getXesteList();

        int xesteSayi = 0;
        for (Xeste xeste : xesteList
        ) {
            if (xeste.getXestelik().equals(enumXestelik)) {
                xesteSayi++;
            }
        }
        return xesteSayi;
    }
}
