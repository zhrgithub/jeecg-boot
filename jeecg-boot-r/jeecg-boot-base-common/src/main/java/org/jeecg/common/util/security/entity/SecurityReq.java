package org.jeecg.common.util.security.entity;

import lombok.Data;

@Data
public class SecurityReq {
    private String data;
    private String pubKey;
    private String signData;
    private String aesKey;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPubKey() {
		return pubKey;
	}
	public void setPubKey(String pubKey) {
		this.pubKey = pubKey;
	}
	public String getSignData() {
		return signData;
	}
	public void setSignData(String signData) {
		this.signData = signData;
	}
	public String getAesKey() {
		return aesKey;
	}
	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}
    
}
