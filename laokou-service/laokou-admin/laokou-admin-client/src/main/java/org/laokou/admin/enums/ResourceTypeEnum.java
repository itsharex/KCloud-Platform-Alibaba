package org.laokou.admin.enums;

public enum ResourceTypeEnum {

	AUDIO("audio"), VIDEO("video"), IMAGE("image");

	private final String code;

	ResourceTypeEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
