package com.nswt.statical.exception;

/*
 * @Author NSWT
 * @Date 2016-8-4
 * @Mail nswt@nswt.com.cn
 */
public class TemplateRuntimeException extends Exception {

	private static final long serialVersionUID = 1L;

	public TemplateRuntimeException(String message) {
		super(message);
	}

	public TemplateRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
}
