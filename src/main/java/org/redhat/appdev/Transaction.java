
package org.redhat.appdev;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Transaction {

private String Id;

private String Time;

private String V1;

private String V2;

private String V3;

private String V4;

private String V5;

private String V6;

private String V7;

private String V8;

private String V9;

private String V10;

private String V11;

private String V12;

private String V13;

private String V14;

private String V15;

private String V16;

private String V17;

private String V18;

private String V19;

private String V20;

private String V21;

private String V22;

private String V23;

private String V24;

private String V25;

private String V26;

private String V27;

private String V28;

private String Amount;

private String Class;

private Boolean flagged = false;

private Boolean isFraud = false;


public Transaction() {

}

public Transaction(String Id, String Time, String V1, String V2, String V3, String V4, String V5, String V6, String V7, String V8, String V9, String V10, String V11, String V12, String V13, String V14, String V15, String V16, String V17, String V18, String V19, String V20, String V21, String V22, String V23, String V24, String V25, String V26, String V27, String V28, String Amount, String Class) {
super();
this.Id = Id;
this.Time = Time;
this.V1 = V1;
this.V2 = V2;
this.V3 = V3;
this.V4 = V4;
this.V5 = V5;
this.V6 = V6;
this.V7 = V7;
this.V8 = V8;
this.V9 = V9;
this.V10 = V10;
this.V11 = V11;
this.V12 = V12;
this.V13 = V13;
this.V14 = V14;
this.V15 = V15;
this.V16 = V16;
this.V17 = V17;
this.V18 = V18;
this.V19 = V19;
this.V20 = V20;
this.V21 = V21;
this.V22 = V22;
this.V23 = V23;
this.V24 = V24;
this.V25 = V25;
this.V26 = V26;
this.V27 = V27;
this.V28 = V28;
this.Amount = Amount;
this.Class = Class;
}


public String getId() {
return Id;
}


public void setId(String Id) {
this.Id = Id;
}


public String getTime() {
return Time;
}

public void setTime(String Time) {
this.Time = Time;
}

public String getV1() {
return V1;
}

public void setV1(String V1) {
this.V1 = V1;
}

public String getV2() {
return V2;
}

public void setV2(String V2) {
this.V2 = V2;
}

public String getV3() {
return V3;
}

public void setV3(String V3) {
this.V3 = V3;
}

public String getV4() {
return V4;
}

public void setV4(String V4) {
this.V4 = V4;
}

public String getV5() {
return V5;
}


public void setV5(String V5) {
this.V5 = V5;
}


public String getV6() {
return V6;
}


public void setV6(String V6) {
this.V6 = V6;
}


public String getV7() {
return V7;
}


public void setV7(String V7) {
this.V7 = V7;
}


public String getV8() {
return V8;
}


public void setV8(String V8) {
this.V8 = V8;
}


public String getV9() {
return V9;
}


public void setV9(String V9) {
this.V9 = V9;
}


public String getV10() {
return V10;
}


public void setV10(String V10) {
this.V10 = V10;
}


public String getV11() {
return V11;
}


public void setV11(String V11) {
this.V11 = V11;
}


public String getV12() {
return V12;
}


public void setV12(String V12) {
this.V12 = V12;
}


public String getV13() {
return V13;
}


public void setV13(String V13) {
this.V13 = V13;
}


public String getV14() {
return V14;
}


public void setV14(String V14) {
this.V14 = V14;
}


public String getV15() {
return V15;
}


public void setV15(String V15) {
this.V15 = V15;
}


public String getV16() {
return V16;
}


public void setV16(String V16) {
this.V16 = V16;
}


public String getV17() {
return V17;
}


public void setV17(String V17) {
this.V17 = V17;
}

public String getV18() {
return V18;
}


public void setV18(String V18) {
this.V18 = V18;
}

public String getV19() {
return V19;
}


public void setV19(String V19) {
this.V19 = V19;
}


public String getV20() {
return V20;
}


public void setV20(String V20) {
this.V20 = V20;
}


public String getV21() {
return V21;
}


public void setV21(String V21) {
this.V21 = V21;
}


public String getV22() {
return V22;
}


public void setV22(String V22) {
this.V22 = V22;
}


public String getV23() {
return V23;
}


public void setV23(String V23) {
this.V23 = V23;
}


public String getV24() {
return V24;
}


public void setV24(String V24) {
this.V24 = V24;
}


public String getV25() {
return V25;
}


public void setV25(String V25) {
this.V25 = V25;
}


public String getV26() {
return V26;
}


public void setV26(String V26) {
this.V26 = V26;
}


public String getV27() {
return V27;
}


public void setV27(String V27) {
this.V27 = V27;
}


public String getV28() {
return V28;
}


public void setV28(String V28) {
this.V28 = V28;
}


public String getAmount() {
return Amount;
}

public void setAmount(String Amount) {
this.Amount = Amount;
}


public String getClassValue() {
return Class;
}

public void setClassValue(String Class) {
this.Class = Class;
}

public Boolean isFlagged() {
	return this.flagged;
}

public void setFlagged(final Boolean flagged) {
	this.flagged = flagged;
}

public Boolean isFraud() {
	return this.isFraud;
}

public void setIsFraud(final Boolean isFraud) {
	this.isFraud = isFraud;
}


}