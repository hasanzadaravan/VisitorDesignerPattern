package sehiyyenazirliyi;

import sehiyyenazirliyi.EnumXesteVeziyyeti;
import sehiyyenazirliyi.EnumXestelik;

public class Xeste {


    String ad;
    private EnumXesteVeziyyeti xesteVeziyyeti;
    private EnumXestelik xestelik;

    public Xeste(String ad, EnumXesteVeziyyeti xesteVeziyyeti, EnumXestelik xestelik) {
        this.ad = ad;
        this.xesteVeziyyeti = xesteVeziyyeti;
        this.xestelik = xestelik;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public EnumXesteVeziyyeti getXesteVeziyyeti() {
        return xesteVeziyyeti;
    }

    public void setXesteVeziyyeti(EnumXesteVeziyyeti xesteVeziyyeti) {
        this.xesteVeziyyeti = xesteVeziyyeti;
    }

    public EnumXestelik getXestelik() {
        return xestelik;
    }

    public void setXestelik(EnumXestelik xestelik) {
        this.xestelik = xestelik;
    }
}
