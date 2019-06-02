package com.ypc.mysql.json.model;

/**
 * @Author: ypcfly
 * @Date: 19-5-28 21:20
 * @Description:
 */
public class Address {

    private String country;

    private Integer countryCode;

    private String province;

    private Integer provinceCode;

    private String city;

    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", countryCode=" + countryCode +
                ", province='" + province + '\'' +
                ", provinceCode=" + provinceCode +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
