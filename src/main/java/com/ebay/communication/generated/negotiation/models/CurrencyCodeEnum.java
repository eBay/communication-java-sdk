// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.communication.generated.negotiation.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enumerated type lists the three-letter &lt;a href=&quot;http://www.iso.org/iso/home/standards/currency_codes.htm&quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; codes representing the supported world currencies.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CurrencyCodeEnum implements ValuedEnum {
    AED("AED"),
    AFN("AFN"),
    ALL("ALL"),
    AMD("AMD"),
    ANG("ANG"),
    AOA("AOA"),
    ARS("ARS"),
    AUD("AUD"),
    AWG("AWG"),
    AZN("AZN"),
    BAM("BAM"),
    BBD("BBD"),
    BDT("BDT"),
    BGN("BGN"),
    BHD("BHD"),
    BIF("BIF"),
    BMD("BMD"),
    BND("BND"),
    BOB("BOB"),
    BRL("BRL"),
    BSD("BSD"),
    BTN("BTN"),
    BWP("BWP"),
    BYR("BYR"),
    BZD("BZD"),
    CAD("CAD"),
    CDF("CDF"),
    CHF("CHF"),
    CLP("CLP"),
    CNY("CNY"),
    COP("COP"),
    CRC("CRC"),
    CUP("CUP"),
    CVE("CVE"),
    CZK("CZK"),
    DJF("DJF"),
    DKK("DKK"),
    DOP("DOP"),
    DZD("DZD"),
    EGP("EGP"),
    ERN("ERN"),
    ETB("ETB"),
    EUR("EUR"),
    FJD("FJD"),
    FKP("FKP"),
    GBP("GBP"),
    GEL("GEL"),
    GHS("GHS"),
    GIP("GIP"),
    GMD("GMD"),
    GNF("GNF"),
    GTQ("GTQ"),
    GYD("GYD"),
    HKD("HKD"),
    HNL("HNL"),
    HRK("HRK"),
    HTG("HTG"),
    HUF("HUF"),
    IDR("IDR"),
    ILS("ILS"),
    INR("INR"),
    IQD("IQD"),
    IRR("IRR"),
    ISK("ISK"),
    JMD("JMD"),
    JOD("JOD"),
    JPY("JPY"),
    KES("KES"),
    KGS("KGS"),
    KHR("KHR"),
    KMF("KMF"),
    KPW("KPW"),
    KRW("KRW"),
    KWD("KWD"),
    KYD("KYD"),
    KZT("KZT"),
    LAK("LAK"),
    LBP("LBP"),
    LKR("LKR"),
    LRD("LRD"),
    LSL("LSL"),
    LTL("LTL"),
    LYD("LYD"),
    MAD("MAD"),
    MDL("MDL"),
    MGA("MGA"),
    MKD("MKD"),
    MMK("MMK"),
    MNT("MNT"),
    MOP("MOP"),
    MRO("MRO"),
    MUR("MUR"),
    MVR("MVR"),
    MWK("MWK"),
    MXN("MXN"),
    MYR("MYR"),
    MZN("MZN"),
    NAD("NAD"),
    NGN("NGN"),
    NIO("NIO"),
    NOK("NOK"),
    NPR("NPR"),
    NZD("NZD"),
    OMR("OMR"),
    PAB("PAB"),
    PEN("PEN"),
    PGK("PGK"),
    PHP("PHP"),
    PKR("PKR"),
    PLN("PLN"),
    PYG("PYG"),
    QAR("QAR"),
    RON("RON"),
    RSD("RSD"),
    RUB("RUB"),
    RWF("RWF"),
    SAR("SAR"),
    SBD("SBD"),
    SCR("SCR"),
    SDG("SDG"),
    SEK("SEK"),
    SGD("SGD"),
    SHP("SHP"),
    SLL("SLL"),
    SOS("SOS"),
    SRD("SRD"),
    STD("STD"),
    SYP("SYP"),
    SZL("SZL"),
    THB("THB"),
    TJS("TJS"),
    TMT("TMT"),
    TND("TND"),
    TOP("TOP"),
    TRY("TRY"),
    TTD("TTD"),
    TWD("TWD"),
    TZS("TZS"),
    UAH("UAH"),
    UGX("UGX"),
    USD("USD"),
    UYU("UYU"),
    UZS("UZS"),
    VEF("VEF"),
    VND("VND"),
    VUV("VUV"),
    WST("WST"),
    XAF("XAF"),
    XCD("XCD"),
    XOF("XOF"),
    XPF("XPF"),
    YER("YER"),
    ZAR("ZAR"),
    ZMW("ZMW"),
    ZWL("ZWL");
    public final String value;
    CurrencyCodeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CurrencyCodeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AED": return AED;
            case "AFN": return AFN;
            case "ALL": return ALL;
            case "AMD": return AMD;
            case "ANG": return ANG;
            case "AOA": return AOA;
            case "ARS": return ARS;
            case "AUD": return AUD;
            case "AWG": return AWG;
            case "AZN": return AZN;
            case "BAM": return BAM;
            case "BBD": return BBD;
            case "BDT": return BDT;
            case "BGN": return BGN;
            case "BHD": return BHD;
            case "BIF": return BIF;
            case "BMD": return BMD;
            case "BND": return BND;
            case "BOB": return BOB;
            case "BRL": return BRL;
            case "BSD": return BSD;
            case "BTN": return BTN;
            case "BWP": return BWP;
            case "BYR": return BYR;
            case "BZD": return BZD;
            case "CAD": return CAD;
            case "CDF": return CDF;
            case "CHF": return CHF;
            case "CLP": return CLP;
            case "CNY": return CNY;
            case "COP": return COP;
            case "CRC": return CRC;
            case "CUP": return CUP;
            case "CVE": return CVE;
            case "CZK": return CZK;
            case "DJF": return DJF;
            case "DKK": return DKK;
            case "DOP": return DOP;
            case "DZD": return DZD;
            case "EGP": return EGP;
            case "ERN": return ERN;
            case "ETB": return ETB;
            case "EUR": return EUR;
            case "FJD": return FJD;
            case "FKP": return FKP;
            case "GBP": return GBP;
            case "GEL": return GEL;
            case "GHS": return GHS;
            case "GIP": return GIP;
            case "GMD": return GMD;
            case "GNF": return GNF;
            case "GTQ": return GTQ;
            case "GYD": return GYD;
            case "HKD": return HKD;
            case "HNL": return HNL;
            case "HRK": return HRK;
            case "HTG": return HTG;
            case "HUF": return HUF;
            case "IDR": return IDR;
            case "ILS": return ILS;
            case "INR": return INR;
            case "IQD": return IQD;
            case "IRR": return IRR;
            case "ISK": return ISK;
            case "JMD": return JMD;
            case "JOD": return JOD;
            case "JPY": return JPY;
            case "KES": return KES;
            case "KGS": return KGS;
            case "KHR": return KHR;
            case "KMF": return KMF;
            case "KPW": return KPW;
            case "KRW": return KRW;
            case "KWD": return KWD;
            case "KYD": return KYD;
            case "KZT": return KZT;
            case "LAK": return LAK;
            case "LBP": return LBP;
            case "LKR": return LKR;
            case "LRD": return LRD;
            case "LSL": return LSL;
            case "LTL": return LTL;
            case "LYD": return LYD;
            case "MAD": return MAD;
            case "MDL": return MDL;
            case "MGA": return MGA;
            case "MKD": return MKD;
            case "MMK": return MMK;
            case "MNT": return MNT;
            case "MOP": return MOP;
            case "MRO": return MRO;
            case "MUR": return MUR;
            case "MVR": return MVR;
            case "MWK": return MWK;
            case "MXN": return MXN;
            case "MYR": return MYR;
            case "MZN": return MZN;
            case "NAD": return NAD;
            case "NGN": return NGN;
            case "NIO": return NIO;
            case "NOK": return NOK;
            case "NPR": return NPR;
            case "NZD": return NZD;
            case "OMR": return OMR;
            case "PAB": return PAB;
            case "PEN": return PEN;
            case "PGK": return PGK;
            case "PHP": return PHP;
            case "PKR": return PKR;
            case "PLN": return PLN;
            case "PYG": return PYG;
            case "QAR": return QAR;
            case "RON": return RON;
            case "RSD": return RSD;
            case "RUB": return RUB;
            case "RWF": return RWF;
            case "SAR": return SAR;
            case "SBD": return SBD;
            case "SCR": return SCR;
            case "SDG": return SDG;
            case "SEK": return SEK;
            case "SGD": return SGD;
            case "SHP": return SHP;
            case "SLL": return SLL;
            case "SOS": return SOS;
            case "SRD": return SRD;
            case "STD": return STD;
            case "SYP": return SYP;
            case "SZL": return SZL;
            case "THB": return THB;
            case "TJS": return TJS;
            case "TMT": return TMT;
            case "TND": return TND;
            case "TOP": return TOP;
            case "TRY": return TRY;
            case "TTD": return TTD;
            case "TWD": return TWD;
            case "TZS": return TZS;
            case "UAH": return UAH;
            case "UGX": return UGX;
            case "USD": return USD;
            case "UYU": return UYU;
            case "UZS": return UZS;
            case "VEF": return VEF;
            case "VND": return VND;
            case "VUV": return VUV;
            case "WST": return WST;
            case "XAF": return XAF;
            case "XCD": return XCD;
            case "XOF": return XOF;
            case "XPF": return XPF;
            case "YER": return YER;
            case "ZAR": return ZAR;
            case "ZMW": return ZMW;
            case "ZWL": return ZWL;
            default: return null;
        }
    }
}
